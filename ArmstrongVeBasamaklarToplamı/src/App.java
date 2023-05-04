import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayaci = new Scanner(System.in);

        // Armstrong sayı bulma
        /*
         * System.out.print("Bir sayı giriniz:");
         * int sayi=tarayaci.nextInt();
         * int sayiYedek=sayi;
         * int sayiYedek2=sayi;
         * int basamakSayisi=0;
         * int toplam=0;
         * int carpim=1;
         * 
         * while(sayi>0){
         * sayi/=10;
         * basamakSayisi++;
         * }
         * 
         * while(sayiYedek>0){
         * for(int i=1;i<=basamakSayisi;i++){
         * carpim*=sayiYedek%10;
         * }
         * sayiYedek/=10;
         * toplam+=carpim;
         * carpim=1;
         * }
         * 
         * 
         * if(toplam==sayiYedek2){
         * System.out.println("Girilen sayı Armstrong sayıdır.");
         * }
         * else{
         * System.out.println("Girilen sayı Armstrong sayı değildir.");
         * }
         */

        // Bir sayının basamak sayılarının toplamını hesaplayan program

        System.out.print("Bir sayı giriniz:");
        int sayi = tarayaci.nextInt();
        int basamakSayisi = 0;
        int toplam = 0;

        while (sayi > 0) {
            toplam += (sayi % 10);
            sayi /= 10;
        }
        System.out.println("Basamaklar toplamı=" + toplam);

    }
}
