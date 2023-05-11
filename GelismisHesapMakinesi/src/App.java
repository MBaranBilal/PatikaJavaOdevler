import java.util.Scanner;

public class App {
    public static Scanner tarayici = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String menu = "=========================\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Üs Alma\n6-Faktöriyel Hesaplama\n7-Mod Alma\n8-Dikdörtgen Alanı ve Çevresi\n0-Çıkış\n=========================";
        boolean devamMı = true;
        while (devamMı) {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlem:");
            int secim = tarayici.nextInt();

            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    devamMı = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
            }
        }

    }

    public static void toplama() {
        System.out.print("Kaç sayı gireceksiniz :");
        int adet = tarayici.nextInt();
        int toplam = 0;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı:");
            int sayi = tarayici.nextInt();
            toplam += sayi;
        }
        System.out.println("Toplama işlemi sonucu:" + toplam);
    }

    public static void cikarma() {
        System.out.print("Çıkarma işlemi yapmak istediğiniz sayıları sırasıyle giriniz:");
        int sayi1 = tarayici.nextInt();
        int sayi2 = tarayici.nextInt();
        System.out.println("Çıkarma işlemi sonucu:" + (sayi1 - sayi2));
    }

    public static void carpma() {
        System.out.print("Kaç sayı gireceksiniz:");
        int adet = tarayici.nextInt();
        int carpim = 1;
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı:");
            int sayi = tarayici.nextInt();
            carpim *= sayi;
        }
        System.out.println("Çarpma işlemi sonucu:" + carpim);
    }

    public static void bolme() {
        boolean flag = true;
        while (flag) {
            System.out.print("Bölüneni ve böleni giriniz:");
            double bolunen = tarayici.nextInt();
            double bolen = tarayici.nextInt();
            if (bolen == 0) {
                System.out.println("Bölen 0 olamaz.");
            } else {
                double bolum = bolunen / bolen;
                System.out.println("Bölme işlemi sonucu:" + bolum);
                flag = false;
            }
        }
    }

    public static void usluSayi() {
        System.out.print("Taban ve üs değerlerini sırasıyla giriniz:");
        int taban = tarayici.nextInt();
        int us = tarayici.nextInt();
        int carpim = 1;
        for (int i = 1; i <= us; i++) {
            carpim *= taban;
        }
        System.out.println("Üs alma işleminin sonucu:" + carpim);
    }

    public static void faktoriyel() {
        while (true) {
            System.out.print("Faktöriyelini almak istediğiniz sayı:");
            int sayi = tarayici.nextInt();
            if (sayi == 0) {
                System.out.println("Faktöriyel işlemi sonucu:1");
                break;
            } else if (sayi < 0) {
                System.out.println("Faktöriyeli alınacak sayı negatif olamaz.");
            } else {
                int carpim = 1;
                for (int i = 2; i <= sayi; i++) {
                    carpim *= i;
                }
                System.out.println("Faktöriyel işlemi sonucu:" + carpim);
                break;
            }
        }
    }

    public static void modAlma() {
        System.out.print("Modu alınacak sayıyı ve böleni sırasıyle giriniz:");
        int anaSayi = tarayici.nextInt();
        int bolen = tarayici.nextInt();
        System.out.println("Mod alma sonucu:" + (anaSayi % bolen));
    }

    public static void dikdortgen() {
        while (true) {
            System.out.print("Dikdörtgenin kısa ve uzun kenarını sırasıyla giriniz:");
            int kısaKenar = tarayici.nextInt();
            int uzunKenar = tarayici.nextInt();
            if (kısaKenar <= 0 || uzunKenar <= 0) {
                System.out.println("Kenar değerleri pozitif sayı olmalıdır.");
            } else {
                System.out.println("Dikdörtgen alanı:" + (kısaKenar * uzunKenar));
                System.out.println("Dikdörtgen çevresi:" + ((kısaKenar + uzunKenar) * 2));
                break;
            }
        }

    }
}
