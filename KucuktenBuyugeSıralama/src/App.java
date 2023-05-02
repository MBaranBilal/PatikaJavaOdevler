import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1, sayi2, sayi3;
        int enKucuk;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("3 adet sayı giriniz:");
        sayi1 = tarayici.nextInt();
        sayi2 = tarayici.nextInt();
        sayi3 = tarayici.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            enKucuk = sayi1;

            if (sayi2 < sayi3) {
                System.out.println("Sıralama:" + sayi1 + " " + sayi2 + " " + sayi3);
            } else {
                System.out.println("Sıralama:" + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            enKucuk = sayi2;

            if (sayi1 < sayi3) {
                System.out.println("Sıralama:" + sayi2 + " " + sayi1 + " " + sayi3);
            } else {
                System.out.println("Sıralama:" + sayi2 + " " + sayi3 + " " + sayi1);
            }
        } else {
            if (sayi2 < sayi1) {
                System.out.println("Sıralama:" + sayi3 + " " + sayi2 + " " + sayi1);
            } else {
                System.out.println("Sıralama:" + sayi3 + " " + sayi1 + " " + sayi2);
            }
        }
    }
}
