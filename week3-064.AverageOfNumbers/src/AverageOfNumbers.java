
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
