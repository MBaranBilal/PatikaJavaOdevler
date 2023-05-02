import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sicaklik;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        sicaklik = tarayici.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
