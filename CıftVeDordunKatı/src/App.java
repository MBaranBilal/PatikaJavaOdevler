import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        /*
         * boolean poztifMi=true;
         * int toplam=0;
         * while(poztifMi){
         * System.out.print("Bir sayı giriniz:");
         * int sayi=tarayici.nextInt();
         * if(sayi<0){
         * poztifMi=false;
         * }
         * else{
         * if(sayi%2!=0){
         * toplam+=sayi;
         * }
         * }
         * }
         * System.out.println("Girilen pozitif tek sayıların toplamı:"+toplam);
         */

        boolean ciftMi = true;
        int toplam = 0;
        while (ciftMi) {
            System.out.print("Bir sayı giriniz:");
            int sayi = tarayici.nextInt();
            if (sayi % 2 != 0) {
                ciftMi = false;
            } else {
                if (sayi % 2 == 0 && sayi % 4 == 0) {
                    toplam += sayi;
                }
            }
        }
        System.out.println("Girilen çift ve dördün katı olan sayıların toplamı:" + toplam);
    }
}
