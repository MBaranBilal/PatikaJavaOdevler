import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        double boy = tarayici.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        int kilo = tarayici.nextInt();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz:" + vki);
    }
}
