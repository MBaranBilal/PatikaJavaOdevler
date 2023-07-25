import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satir;
    int sutun;
    Scanner tarayici = new Scanner(System.in);

    MineSweeper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
    }

    public void run() {
        int[][] oyunTablosu = new int[satir][sutun];
        // Mayınların oyun tablosuna rastgele yerleştirilmesi:
        int mayinSayisi = (satir * sutun) / 4;
        Random rndSatir = new Random();
        Random rndSutun = new Random();
        for (int i = 1; i <= mayinSayisi; i++) {
            int rastSatir = rndSatir.nextInt(satir);
            int rastSutun = rndSutun.nextInt(sutun);

            if (oyunTablosu[rastSatir][rastSutun] == 0) {
                oyunTablosu[rastSatir][rastSutun] = -1;
            } else {
                while (oyunTablosu[rastSatir][rastSutun] == -1) {
                    rastSatir = rndSatir.nextInt(satir);
                    rastSutun = rndSutun.nextInt(sutun);
                }
                oyunTablosu[rastSatir][rastSutun] = -1;
            }
        }
        // ===================================================

        // Mayınların konumunun gösterilmesi:
        System.out.println("Mayınların Konumu:\n================");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (oyunTablosu[i][j] != -1) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("================\n");
        // ===================================================
        mayinKontrol(oyunTablosu);

    }

    public void mayinKontrol(int oyunTablosu[][]) {
        System.out.println("======== MAYIN TARLASI ========");
        for (int i = 0; i < oyunTablosu.length; i++) {
            for (int j = 0; j < oyunTablosu[0].length; j++) {
               if(oyunTablosu[i][j]==0 || oyunTablosu[i][j]==-1){
                System.out.print("- ");
               }
            }
            System.out.println();
        }

        int bosAlan = 0;
        for (int i = 0; i < oyunTablosu.length; i++) {
            for (int j = 0; j < oyunTablosu[0].length; j++) {
                if (oyunTablosu[i][j] == 0) {
                    bosAlan++;
                }
            }
        }

        while (bosAlan > 0) {
            System.out.print("Satır giriniz:");
            int satir = tarayici.nextInt();
            System.out.print("Sütun giriniz:");
            int sutun = tarayici.nextInt();
            if ((satir < 0 || satir > oyunTablosu.length - 1) || sutun < 0 || sutun > oyunTablosu[0].length) {
                System.out.println("Hatalı satır veya sütun numarası girdiniz.\n===============");
                continue;
            }

            int sutunYedek = sutun;

            int etrMayin = 0;
            if (oyunTablosu[satir][sutun] == -1) {
                System.out.println("Oyunu kaybettiniz !");
                break;
            } else {
                // Seçilen hücrenin üstündeki 3 hücrede mayın olup olmadığının kontrolü:
                for (int k = 1; k <= 3; k++) {
                    if (((satir - 1 >= 0 && satir - 1 <= oyunTablosu.length - 1)
                            && (sutun - 1 >= 0 && sutun - 1 <= oyunTablosu[0].length - 1))
                            && oyunTablosu[satir - 1][sutun - 1] == -1) {
                        etrMayin++;
                    }
                    sutun++;
                }
                // ===================================================
                sutun = sutunYedek;
                // Seçilen hücrenin altındaki 3 hücrede mayın olup olmadığının kontrolü:
                for (int k = 1; k <= 3; k++) {
                    if (((satir + 1 >= 0 && satir + 1 <= oyunTablosu.length - 1)
                            && (sutun - 1 >= 0 && sutun - 1 <= oyunTablosu[0].length - 1))
                            && oyunTablosu[satir + 1][sutun - 1] == -1) {
                        etrMayin++;
                    }
                    sutun++;
                }
                // ===================================================
                sutun = sutunYedek;
                // Seçilen hücrenin sağında ve solunda mayın olup olmadığının kontrolü:
                for (int k = 1; k <= 2; k++) {
                    if ((sutun - 1 >= 0 && sutun <= oyunTablosu[0].length) && oyunTablosu[satir][sutun - 1] == -1) {
                        etrMayin++;
                    }
                    sutun += 2;
                }
                // ===================================================
                sutun = sutunYedek;

                for (int i = 0; i < oyunTablosu.length; i++) {
                    for (int j = 0; j < oyunTablosu[0].length; j++) {
                        if (i == satir && j == sutun) {
                            oyunTablosu[i][j] = etrMayin;
                            System.out.print(oyunTablosu[i][j] + " ");
                        } else if (oyunTablosu[i][j] == 0 || oyunTablosu[i][j] == -1) {
                            System.out.print("- ");
                        } else {
                            System.out.print(oyunTablosu[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
                bosAlan--;
            }
            if (bosAlan == 0) {
                System.out.println("Tebrikler Oyunu Kazandınız !!");
            }
        }

    }
}
