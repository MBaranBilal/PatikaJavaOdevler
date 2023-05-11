import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = tarayici.nextInt();
        int sonuc = asalSayi(sayi, sayi / 2);
        if (sonuc == 0) {
            System.out.println("asal sayi degildir");
        } else {
            System.out.println("asal sayidir");
        }

    }

    public static int asalSayi(int sayi, int i) {
        if (sayi < 2) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (sayi % i == 0) {
            return 0;
        }
        return asalSayi(sayi, i - 1);
    }
}
