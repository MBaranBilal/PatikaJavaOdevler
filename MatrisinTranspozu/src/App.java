public class App {
    public static void main(String[] args) throws Exception {
        int[][] dizi = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] dizi2 = { { 4, 8, 12, 7 },
                { 2, 77, 10, 0 },
                { 25, 55, 0, 3 } };

        transpozAl(dizi);
        transpozAl(dizi2);

    }

    public static void transpozAl(int[][] dizi) {
        int satir = dizi.length;
        int sutun = dizi[0].length;

        int[][] dizi2 = new int[sutun][satir];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (i != j) {
                    dizi2[j][i] = dizi[i][j];
                } else {
                    dizi2[i][j] = dizi[i][j];
                }
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                System.out.print(dizi[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Transpozu:");
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[0].length; j++) {
                System.out.print(dizi2[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
