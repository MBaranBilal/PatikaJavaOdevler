import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Yolculuk mesafesi (KM):");
        int mesafe = tarayici.nextInt();
        System.out.print("Yaşınız:");
        int yas = tarayici.nextInt();
        System.out.print("Yolculuk tipi (1-Tek Yön 2-Gidiş Dönüş):");
        int tip = tarayici.nextInt();

        double fiyat = mesafe * 0.10;

        if ((mesafe > 0 && yas > 0) && (tip == 1 || tip == 2)) {

            if (yas < 12) {
                fiyat /= 2;
                if (tip == 2) {
                    fiyat = fiyat - (fiyat * 0.20);
                    fiyat *= 2;
                }
            } else if (yas >= 12 && yas <= 24) {
                fiyat = fiyat - (fiyat * 0.10);
                if (tip == 2) {
                    fiyat = fiyat - (fiyat * 0.20);
                    fiyat *= 2;
                }
            } else if (yas > 65) {
                fiyat = fiyat - (fiyat * 0.30);
                if (tip == 2) {
                    fiyat = fiyat - (fiyat * 0.20);
                    fiyat *= 2;
                }
            }
            System.out.println("Toplam tutar:" + fiyat);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}
