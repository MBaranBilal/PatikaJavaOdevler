import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int acilis = 10;
        double kmUcret = 2.20;
        int minTutar = 20;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Başlangıç noktası ile varış noktası arasındaki mesafe:");
        double mesafe = tarayici.nextDouble();
        double sonuc = (acilis + (kmUcret * mesafe)) < 20 ? 20 : acilis + (kmUcret * mesafe);
        System.out.println("Ödenecek Tutar:" + sonuc);
    }
}
