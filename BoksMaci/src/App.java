import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Fighter f1 = new Fighter("Tyson", 30, 150, 90, 40);
        Fighter f2 = new Fighter("Joshua", 15, 100, 100, 10);

        Match match1 = new Match(f1, f2, 90, 110);
        match1.run();
    }
}
