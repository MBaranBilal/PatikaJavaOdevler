import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = tarayici.nextInt();
        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                sayac++;
            }
        }

        double ortalama = toplam / sayac;
        System.out.print("3 ve 4'e tam bölünen sayıların ortalaması:" + ortalama);
    }
}
