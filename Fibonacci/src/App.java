import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Fibonocci serisinin kaç basamağını görmek istersiniz:");
        int basamak = tarayici.nextInt();
        int sayi1 = 0, sayi2 = 1;
        int toplam = 0;

        for (int i = 1; i <= basamak; i++) {
            toplam += (sayi1 + sayi2);
            sayi1 = sayi2;
            sayi2 = toplam;
            System.out.print(toplam + " ");
            toplam = 0;
        }
    }
}
