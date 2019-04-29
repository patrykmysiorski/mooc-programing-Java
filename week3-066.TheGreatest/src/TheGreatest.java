import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int great = 0;
        boolean i = true;
        for(Integer number: list){
            if(i == true){
                great = number;
            }
            else{
                if(great < number){
                    great = number;
                }
            }
            i = false;
        }
        return great;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
