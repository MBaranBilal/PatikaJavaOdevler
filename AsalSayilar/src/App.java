public class App {
    public static void main(String[] args) throws Exception {
        for (int sayi = 2; sayi <= 100; sayi++) {
            int bolum;
            for (bolum = 2; bolum < sayi; bolum++) {
                if (sayi % bolum == 0)
                    break;
            }
            if (bolum == sayi)
                System.out.println(sayi);
        }
    }
}
