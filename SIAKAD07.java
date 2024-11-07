import java.util.Scanner;
public class SIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah siswa: ");
        int siswa = sc.nextInt();
        System.out.print("Jumlah mata kuliah: ");
        int matkul = sc.nextInt();
        int[][] nilai = new int[siswa][matkul];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[matkul].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/matkul);
        }
        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < nilai[matkul].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+ 1) + ": " + totalPerMatkul / siswa);
        }
        sc.close();
    }
}