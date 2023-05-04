import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Doğdunuz ay (sayı ile):");
        int ay = tarayici.nextInt();
        System.out.print("Doğdunuz gün:");
        int gun = tarayici.nextInt();

        if ((ay > 0 && ay <= 12) && (gun > 0 && gun <= 31)) {

            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                System.out.println("Koç");
            } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                System.out.println("Boğa");
            } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 22)) {
                System.out.println("İkizler");
            } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                System.out.println("Yengeç");
            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                System.out.println("Aslan");
            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                System.out.println("Başak");
            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                System.out.println("Terazi");
            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                System.out.println("Akrep");
            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                System.out.println("Yay");
            } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
                System.out.println("Oğlak");
            } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
                System.out.println("Kova");
            } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
                System.out.println("Balık");
            }
        } else {
            System.out.println("Lütfen doğru değerler giriniz.");
        }

    }
}
