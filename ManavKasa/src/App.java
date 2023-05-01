import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Ürünlerden kaçar kg almak istediğinizi yan yana yazınız:");
        int kgA = tarayici.nextInt();
        int kgE = tarayici.nextInt();
        int kgD = tarayici.nextInt();
        int kgM = tarayici.nextInt();
        int kgP = tarayici.nextInt();
        double toplam = kgA * armut + kgD * domates + kgE * elma + kgM * muz + kgP * patlıcan;
        System.out.println("Toplam Tutar:" + toplam);
    }

}
