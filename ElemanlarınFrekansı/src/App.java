import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] sayilar = { 10, 20, 20, 45, 10, 10, 10, 20 };
        Arrays.sort(sayilar);
        int sayac = 1;
        for (int i = 0; i < sayilar.length; i++) {
            if (i == 0) {
                for (int j = 0; j < sayilar.length; j++) {
                    if ((i != j) && sayilar[i] == sayilar[j]) {
                        sayac++;
                    }
                }
                System.out.println(sayilar[i] + " sayısı " + sayac + " kere tekrar edildi.");
                sayac = 1;
            } else if (sayilar[i] != sayilar[i - 1]) {
                for (int j = 0; j < sayilar.length; j++) {
                    if ((i != j) && sayilar[i] == sayilar[j]) {
                        sayac++;
                    }
                }
                System.out.println(sayilar[i] + " sayısı " + sayac + " kere tekrar edildi.");
                sayac = 1;
            }
        }
    }
}
