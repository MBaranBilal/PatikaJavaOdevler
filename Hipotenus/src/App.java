import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Hipotenüs uzunluğunu bulan program
        Scanner tarayici = new Scanner(System.in);
        System.out.print("1. kenar:");
        int kenar1 = tarayici.nextInt();
        System.out.print("2. kenar:");
        int kenar2 = tarayici.nextInt();
        double kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs:" + kenar3);

        // Alan hesaplayan program
        System.out.println("Kenar uzunluklarını yan yana girin:");
        int k1 = tarayici.nextInt();
        int k2 = tarayici.nextInt();
        int k3 = tarayici.nextInt();
        int u = (k1 + k2 + k3) / 2;
        double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));
        System.out.println("Üçgenin Alanı:" + alan);
    }
}
