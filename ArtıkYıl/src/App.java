import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Yıl giriniz:");
        int yil = tarayici.nextInt();

        if ((yil % 100 == 0 && yil % 400 != 0)) {
            System.out.println(yil + " bir artık yıl değildir !");
        } else if (yil % 4 == 0) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
