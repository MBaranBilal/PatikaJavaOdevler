import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        mat = tarayici.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = tarayici.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya = tarayici.nextInt();
        System.out.print("Turkce notunuzu giriniz:");
        turkce = tarayici.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih = tarayici.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik = tarayici.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ders notu ortalamanız:" + ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
