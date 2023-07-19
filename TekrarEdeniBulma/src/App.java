import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi = { 43, 2, 77, 66, 2, 27, 32, 89, 77, 66, 10, 43, 10, 2, 66, 27 };
        int[] tekrarEdenler = new int[dizi.length];
        int index = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && dizi[i] == dizi[j] && dizi[i] % 2 == 0) {
                    if (!isFound(tekrarEdenler, dizi[i])) {
                        tekrarEdenler[index++] = dizi[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(tekrarEdenler));
    }

    public static boolean isFound(int[] dizi, int deger) {
        for (int eleman : dizi) {
            if (eleman == deger) {
                return true;
            }
        }
        return false;
    }
}
