import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Taban:");
        int taban = tarayici.nextInt();
        System.out.print("Üs:");
        int us = tarayici.nextInt();

        System.out.println("Üs alma işlemi sonucu:" + usAlma(taban, us));

    }

    public static int usAlma(int taban, int us) {
        if (us == 1) {
            return taban;
        }
        return taban * usAlma(taban, us - 1);
    }
}
