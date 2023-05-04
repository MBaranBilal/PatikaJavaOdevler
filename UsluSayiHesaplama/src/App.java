import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Taban:");
        int taban = tarayici.nextInt();
        System.out.print("Üs:");
        int us = tarayici.nextInt();
        int carpim = 1;

        for (int i = 1; i <= us; i++) {
            carpim *= taban;
        }
        System.out.println("Sonuç:" + carpim);
    }
}
