import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static double sum(ArrayList<Integer> list) {
        double sum = 0;
        for(Integer number: list){
            sum += number;
        }
        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        double count = 0;
        for(Integer number: list){
            count++;
        }
        double sum = sum(list);
        double avg = sum/count;
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double roznica = 0.0;
        int n = 0;
        for(Integer number: list){
            roznica += Math.pow((number - avg), 2);
            n++;
        }
        //System.out.println(roznica);
        double wynik = roznica/(n-1);
        //System.out.println(wynik);

        return wynik;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
