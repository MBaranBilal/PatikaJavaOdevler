import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double pi = 3.14;
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Yarıçap:");
        int yariCap = tarayici.nextInt();
        System.out.print("Merkez açı ölçüsü:");
        int merkezAci = tarayici.nextInt();
        System.out.print("Dairenin çevresi:" + (2 * pi * yariCap) + "\nDairenin alanı:" + (pi * yariCap * yariCap)
                + "\nMerkez açı ölçüsü " + merkezAci + "  derece olan daire diliminin alanı:"
                + (pi * yariCap * yariCap * merkezAci) / 360);
    }
}
