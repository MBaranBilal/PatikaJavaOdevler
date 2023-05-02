import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat, fizik, turkce, kimya, muzik, toplam = 0;
        double ortalama;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat = tarayici.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik = tarayici.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkce = tarayici.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya = tarayici.nextInt();
        System.out.print("Müzik Notunuz:");
        muzik = tarayici.nextInt();

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
        }

        ortalama = toplam / 5;

        if (ortalama >= 55) {
            System.out.println("Ortalamanız:" + ortalama + " Sınıfı Geçtiniz !");
        } else {
            System.out.println("Ortalamanız:" + ortalama + " Sınıfta Kaldınız.");
        }

    }
}
