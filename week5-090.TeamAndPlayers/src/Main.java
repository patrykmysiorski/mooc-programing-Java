public class Main {
    public static void main(String[] args) {
        Team real = new Team("Real Madrid");
        System.out.println(real.getName());
        real.setMaxSize(10);
        Player karim = new Player("Karim", 50);
        Player isco = new Player("Isco", 23);

        real.addPlayer(karim);
        real.addPlayer(isco);

        System.out.println("Total goals: " + real.goals());
    }
}
