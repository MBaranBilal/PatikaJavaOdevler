import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tarayici = new Scanner(System.in);
        String kullaniciAdi, sifre;

        int hak = 3;
        boolean devamMı = true;
        int bakiye = 10000;
        int secim = 0;
        int miktar;
        while (devamMı) {
            System.out.print("Kullanıcı adı:");
            kullaniciAdi = tarayici.nextLine();
            System.out.print("Şifre:");
            sifre = tarayici.nextLine();
            if (kullaniciAdi.equals("baran") && sifre.equals("123")) {
                System.out.println("Sisteme giriş sağlandı.");
                while (secim != 4) {
                    System.out.println(
                            "*****************\nYapmak istediğiniz işlemi seçiniz:\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Öğrenme\n4-Çıkış Yap");
                    secim = tarayici.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("--------------\nYatırmak istediğiniz miktar:");
                            miktar = tarayici.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.println("--------------\nÇekmek istediğinz miktar:");
                            miktar = tarayici.nextInt();
                            if (miktar < bakiye) {
                                bakiye -= miktar;
                            } else {
                                System.out.println("Bakiye yetersiz");
                            }

                            break;
                        case 3:
                            System.out.println("--------------\nMevcut bakiyeniz:" + bakiye);
                            break;
                        case 4:
                            System.out.println("--------------\nÇıkış yapılıyor...");
                            secim = 4;
                            devamMı = false;
                            break;
                    }

                }
            } else {
                hak--;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                    break;
                } else {
                    System.out.println("Kullanıcı adı veya şifre hatalı.Tekrar deneyiniz.Kalan hakkınız:" + hak);
                }
            }
        }
    }
}
