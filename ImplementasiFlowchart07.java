import java.util.Scanner;
public class ImplementasiFlowchart07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] data = new int[6][10];
        int [] perResponden = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int [] perPertanyaan = {0, 0, 0, 0, 0, 0, 0};
        for (int responden = 0; responden < 10; responden++) {
            int totalPert = 0;
            for (int pertanyaan = 0; pertanyaan < 6; pertanyaan++) {
                System.out.print("Masukkan nilai pertanyaan ke-" + (pertanyaan+1) + " responden ke-" + (responden+1) + ": ");
                data[pertanyaan][responden] = sc.nextInt();
                totalPert += data[pertanyaan][responden];
            }
            perResponden[responden] = totalPert;
        }
        for (int responden = 9; responden >= 0; responden--) {
            System.out.println("Rata-rata per responden ke-" + responden + ": " + perResponden[responden]/6);
        }
        int totalResp = 0;
        for (int responden = 0; responden < 10; responden++) {
            totalResp += data[0][responden];
        }
        for (int pertanyaan = 0; pertanyaan < 6; pertanyaan++) {
            perPertanyaan[pertanyaan] = totalResp;
        }
        for (int pertanyaan = 5; pertanyaan >= 0; pertanyaan--) {
            System.out.println("Rata-rata per pertanyaan ke-" + pertanyaan + ": " + perPertanyaan[pertanyaan]/10);
        }
        int totalSeluruh = 0;
        for (int pertanyaan = 0; pertanyaan < 6; pertanyaan++) {
            totalSeluruh += perPertanyaan[pertanyaan]/10;
        }
        System.out.println("Rata-rata keseluruhan: " + totalSeluruh/6);
        sc.close();
    }
}