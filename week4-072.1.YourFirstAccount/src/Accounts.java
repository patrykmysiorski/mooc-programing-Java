
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAccount = new Account("My`s account", 100.0);
        myAccount.deposit(20);
        System.out.println(myAccount);
    }

}
