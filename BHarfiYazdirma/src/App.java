public class App {
    public static void main(String[] args) throws Exception {

        // A harfi yazdırma:

        /*
         * String[][] dizi = new String[6][4];
         * for (int i = 0; i < dizi.length; i++) {
         * for (int j = 0; j < dizi[i].length; j++) {
         * if ((i == 0 || i == 2) || (j == 0 || j == 3)) {
         * dizi[i][j] = "*";
         * } else if ((i != 0 || i != 2) && (j == 1 || j == 2)) {
         * dizi[i][j] = " ";
         * }
         * 
         * }
         * }
         * 
         * for (int i = 0; i < dizi.length; i++) {
         * for (int j = 0; j < dizi[i].length; j++) {
         * System.out.print(dizi[i][j]);
         * }
         * System.out.println();
         * }
         */

        String[][] dizi = new String[5][4];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if ((i == 0 && j != 3) || (i == 2 && j != 3) || (i == 4 && j != 3)) {
                    dizi[i][j] = "*";
                } else if (j == 0) {
                    dizi[i][j] = "*";
                } else if (j == 3 && (i == 1 || i == 3)) {
                    dizi[i][j] = "*";
                } else {
                    dizi[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]);
            }
            System.out.println();
        }

    }
}
