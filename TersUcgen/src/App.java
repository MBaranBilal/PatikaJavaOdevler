import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Satır sayısı:");
        int satir = tarayici.nextInt();

        int yildiz = 2 * satir - 1;
        int bosluk = 0;
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= bosluk; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildiz; k++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz -= 2;
            bosluk++;
        }
    }
}
