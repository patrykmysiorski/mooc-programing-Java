public class Player {
    private String name;
    private int amountofGoals;

    public Player(String name){
        this(name, 0);
    }

    public Player(String name, int amountofGoals){
        this.name = name;
        this.amountofGoals = amountofGoals;
    }

    public String getName(){
        return name;
    }

    public int goals(){
        return amountofGoals;
    }

    public String toString(){
        return "Player: " + name + ", goals " + amountofGoals;
    }
}
