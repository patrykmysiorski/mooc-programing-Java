import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if(word.isEmpty() == false){
                words.add(word);
            }
            else{
                for (String name: words){
                    System.out.println(name);
                }
                break;
            }
        }

    }
}
