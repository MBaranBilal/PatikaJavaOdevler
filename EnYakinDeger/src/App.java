import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);

        int[] dizi = { 15, 12, 788, 1, -1, -778, 2, 0 };
        Arrays.sort(dizi);
        System.out.print("Bir sayı giriniz:");
        int sayi = tarayici.nextInt();
        int kucukEnYakin = dizi[0], buyukEnYakin = dizi[dizi.length - 1];

        for (int i = 0; i < dizi.length; i++) {
            if (sayi < dizi[i]) {
                if (buyukEnYakin > dizi[i]) {
                    buyukEnYakin = dizi[i];
                }
            }
            if (sayi > dizi[i]) {
                if (kucukEnYakin < dizi[i]) {
                    kucukEnYakin = dizi[i];
                }
            }
        }

        System.out.println("Dizi: {15,12,788,1,-1,-778,2,0}");
        System.out.println("Girilen sayı:" + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı:" + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı:" + buyukEnYakin);
    }
}
