public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi = { 1, 2, 3, 4, 5 };
        double toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            toplam += (1.0 / dizi[i]);
        }
        System.out.println(toplam);

        double harmonikOrt = dizi.length / toplam;
        System.out.println(harmonikOrt);
    }
}
