import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize = 16;
    private ArrayList<Player> list = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addPlayer(Player player){
        if(list.size() < maxSize){
            list.add(player);
        }
    }

    public void printPlayers(){
        for(Player x : list){
            System.out.println(x.toString());
        }
    }

    public int size(){
        return list.size();
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int goals(){
        int totalGoals = 0;
        for(Player x : list){
            totalGoals += x.goals();
        }
        return totalGoals;
    }
}
