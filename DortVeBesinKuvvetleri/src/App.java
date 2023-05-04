import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = tarayici.nextInt();

        for (int i = 1, j = 1; i <= sayi; i *= 4, j *= 5) {
            System.out.println("4'ün kuvveti:" + i);
            if (j < sayi) {
                System.out.println("5'in kuvveti:" + j);
            }

        }
    }
}
