import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Kaç sayı yazacaksınız:");
        int adet = tarayici.nextInt();
        int enBuyuk, enKucuk;

        System.out.print("1. sayı:");
        int sayi = tarayici.nextInt();
        enBuyuk = sayi;
        enKucuk = sayi;

        for (int i = 2; i <= adet; i++) {
            System.out.print(i + ". sayı:");
            sayi = tarayici.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            } else if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En büyük sayı:" + enBuyuk);
        System.out.println("En küçük sayı:" + enKucuk);
    }
}
