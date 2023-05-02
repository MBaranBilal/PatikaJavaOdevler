import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String kullaniciAdi, sifre;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        kullaniciAdi = tarayici.nextLine();
        System.out.print("Şifre:");
        sifre = tarayici.nextLine();

        if (kullaniciAdi.equals("Baran") && sifre.equals("PatikaJava")) {
            System.out.println("Giriş onaylandı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
