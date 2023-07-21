import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        int rastgeleSayi = rnd.nextInt(100);

        Scanner tarayici = new Scanner(System.in);

        int tahminHakki = 0;
        int tahmin;
        int[] yanlisTahminler = new int[5];
        boolean isWin = false;
        boolean hataliMi = false;

        while (tahminHakki < 5) {
            System.out.print("Tahmininizi giriniz:");
            tahmin = tarayici.nextInt();

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 0 ve 100 arasında bir sayı giriniz !");
                if (!hataliMi) {
                    hataliMi = true;
                    System.out.println("Sonraki hatalı sayı girişlarinizde hakkınız azalacaktır.");
                } else {
                    System.out.println("Birden çok hatalı sayı girdiğiniz için hakkınız:" + (5 - (++tahminHakki)));
                }
                continue;
            }

            if (rastgeleSayi == tahmin) {
                System.out.println("======================================");
                System.out.println("Tebrikler tahmininiz doğru ! Bilgisayarın tuttuğu sayı " + rastgeleSayi + " idi.");
                isWin = true;
                break;
            } else {
                yanlisTahminler[tahminHakki] = tahmin;
                tahminHakki++;
                System.out.println("Bilemediniiiz :(");
                if (tahmin > rastgeleSayi) {
                    System.out.println(tahmin + " sayısı gizli sayıdan daha büyük.");
                } else {
                    System.out.println(tahmin + " sayısı gizli sayıdan daha küçük.");
                }

                System.out.println("Kalan tahmin hakkınız:" + (5 - tahminHakki));
            }
        }

        if (!isWin) {
            System.out.println("======================================");
            System.out.println("Kaybettiniz. Yapmış olduğunuz tahminler:");
            for (int i : yanlisTahminler) {
                System.out.print(i + " ");
            }
            System.out.println("Bilgisayarın tuttuğu sayı " + rastgeleSayi + " idi.");
        }
    }
}
