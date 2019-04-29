
public class Main {

    public static void main(String[] args) {
        MyDate data = new MyDate(30,11,1997);
        System.out.println(data);
        data.advance();
        System.out.println(data);
        data.advance();
        System.out.println(data);
    }
}
