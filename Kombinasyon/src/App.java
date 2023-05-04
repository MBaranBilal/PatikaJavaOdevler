import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("N değeri:");
        int n = tarayici.nextInt();
        System.out.print("R değeri:");
        int r = tarayici.nextInt();
        int carpimN = 1, carpimR = 1, carpimN_R = 1;

        if (n < r) {
            System.out.println("n değeri r'den büyük olmalıdır");
        } else {
            for (int i = 1; i <= n; i++) {
                carpimN *= i;
            }
            for (int i = 1; i <= r; i++) {
                carpimR *= i;
            }
            for (int i = 1; i <= (n - r); i++) {
                carpimN_R *= i;
            }
            double kombinasyon = carpimN / (carpimR * carpimN_R);
            System.out.println("Kombinasyon sonucu:" + kombinasyon);
        }

    }
}
