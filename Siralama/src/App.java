import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dizinin boyutunu giriniz:");
        Scanner tarayici = new Scanner(System.in);
        int boyut = tarayici.nextInt();
        int[] sayilar = new int[boyut];

        for (int i = 0; i <= boyut - 1; i++) {
            System.out.print((i + 1) + ". sayı:");
            sayilar[i] = tarayici.nextInt();
        }

        int temp;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i + 1; j < sayilar.length; j++) {
                if (sayilar[i] > sayilar[j]) {
                    temp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = temp;
                }
            }
        }

        System.out.println("Girilen sayıların sıralanmış hali:");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }
}
