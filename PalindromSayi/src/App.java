import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = tarayici.nextInt();
        palindrom(sayi);
    }

    public static void palindrom(int sayi) {
        int yedek = sayi, tersSayi = 0, sonRakam;
        while (yedek > 0) {
            sonRakam = yedek % 10;
            tersSayi = (tersSayi * 10) + sonRakam;
            System.out.println(tersSayi);
            yedek /= 10;

        }
        if (sayi != tersSayi) {
            System.out.println("Palindrom sayı değildir.");
        } else {
            System.out.println("Palindrom sayıdır.");
        }
    }
}
