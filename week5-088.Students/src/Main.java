
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, studentNumber, toSearch;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){
            System.out.print("name: ");
            name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = scanner.nextLine();
            list.add(new Student(name, studentNumber));
        }
        for(Student stu : list){
            System.out.println(stu.toString());
        }

        System.out.print("Give search term: ");
        toSearch = scanner.nextLine();
        System.out.println("Result:");

        for(Student stu : list){
            if(stu.toString().contains(toSearch)){
                System.out.println(stu.toString());
            }
        }
    }
}
