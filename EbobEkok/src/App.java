import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        boolean sorgu = true;
        int secim = 0;
        while (sorgu) {
            System.out.print("1-EBOB 2-EKOK:");
            secim = tarayici.nextInt();
            if (secim == 1 || secim == 2) {
                sorgu = false;
            } else {
                System.out.println("Yanlış seçim yaptınız.");
            }
        }
        System.out.print("1. sayı:");
        int sayi1 = tarayici.nextInt();
        System.out.print("2. sayı:");
        int sayi2 = tarayici.nextInt();
        int ebob = 1, ekok = 1;

        int i = 2;
        while (i <= sayi1 || i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            if (ebob == sayi1 || ebob == sayi2) {
                break;
            }
            i++;
        }

        switch (secim) {
            case 1:
                System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u:" + ebob);
                break;
            case 2:
                ekok = (sayi1 * sayi2) / ebob;
                System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u:" + ekok);
                break;
        }
    }
}
