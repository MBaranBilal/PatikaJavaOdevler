import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1, sayi2, secim, sonuc;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("İşlem yapılacak sayıları girin:");
        sayi1 = tarayici.nextInt();
        sayi2 = tarayici.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("******************\nSeçiminiz:");
        secim = tarayici.nextInt();

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Yanlış seçim yaprınız.");
        }
    }
}
