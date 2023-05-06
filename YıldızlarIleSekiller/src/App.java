import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz:");
        int satir = tarayici.nextInt();
        int satirYedek = satir;

        int yildiz = 1;
        int bosluk = satir - 1;
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= bosluk; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildiz; k++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz += 2;
            bosluk--;
        }

        yildiz -= 4;
        bosluk += 2;
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
