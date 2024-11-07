import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama;
        String[][] penonton = new String[4][2];
        do {
            System.out.println("-  Menu 1: Input data penonton");
            System.out.println("-  Menu 2: Tampilkan daftar penonton");
            System.out.println("-  Menu 3: Exit");
            System.out.print("Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (menu) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris > 4 && kolom > 2) {
                    System.out.println("Baris " + baris + " dan kolom " + kolom + " tidak tersedia");
                    break;
                } else if (baris > 4) {
                    System.out.println("Baris " + baris + " tidak tersedia");
                    break;
                } else if (kolom > 2) {
                    System.out.println("Kolom " + kolom + " tidak tersedia");
                    break;
                }
                if (penonton[baris-1][kolom-1] != null) {
                    System.out.println("Kursi yang dipilih sudah terisi, pilih kursi lainnya");
                    break;
                } else {
                    penonton[baris-1][kolom-1] = nama;
                }
                System.out.println();
                    break;

                case 2:
                System.out.print("Daftar penonton: ");
                for (baris = 0; baris < 4; baris++) {
                    for (kolom = 0; kolom < 2; kolom++) {
                    if (penonton[baris][kolom] == null) {
                        penonton[baris][kolom] = "***";
                    } else {
                    System.out.print(penonton[baris][kolom] + " ");
                    }
                    }
                }
                System.out.println();
                    break;
            }
        } while (menu != 3);
        sc.close();
    }
}