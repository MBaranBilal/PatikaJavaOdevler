import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int sayi = tarayici.nextInt();
        int sayiYedek = sayi;
        desen(sayi, sayiYedek);
    }

    public static int desen(int sayi, int sayiYedek) {
        if (sayi <= 0) {
            System.out.print(sayi + " ");
            while (sayi < sayiYedek) {
                sayi += 5;
                System.out.print(sayi + " ");
                if (sayi == sayiYedek) {
                    break;
                }
            }
            return sayi;
        }
        System.out.print(sayi + " ");
        sayi -= 5;
        return desen(sayi, sayiYedek);
    }
}
