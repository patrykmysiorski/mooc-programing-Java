import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private int number;
    private int i;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        i = 0;
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        i = 0;
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        while(i < 7){
            number = random.nextInt(39) + 1;
            if(!containsNumber(number)){
                numbers.add(number);
                i++;
            }
        }
        //System.out.println(numbers.size());

    }


    public boolean containsNumber(int number) {
        if(!numbers.contains(number)){
            return false;
        }
        else{
            return true;
        }
    }
}
