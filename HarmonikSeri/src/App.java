import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = tarayici.nextInt();
        double toplam = 0;
        for (double i = 1; i <= sayi; i++) {
            toplam += (1 / i);
        }
        System.out.println("Harmonik toplam:" + toplam);
    }
}
