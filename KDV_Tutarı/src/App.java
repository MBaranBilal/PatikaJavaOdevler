import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);

        System.out.print("KDV'li tutarını öğrenmek istediğiniz fiyat:");
        int fiyat = tarayici.nextInt();
        double kdv = 0.18;
        double kdvliTutar = fiyat + (fiyat * kdv);
        System.out.println(
                "KDV'siz fiyat:" + fiyat + "\nKDV'li fiyat:" + kdvliTutar + "\nKDV tutarı:" + (kdvliTutar - fiyat));
    }
}
