import java.util.Scanner;

public class HitungNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = input.nextLine();
        System.out.print("NIM   : ");
        String nim = input.nextLine();

        System.out.print("Masukkan nilai Tubes : ");
        double nilaiTubes = input.nextDouble();
        System.out.print("Masukkan nilai Quiz  : ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("Masukkan nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS   : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS   : ");
        double nilaiUAS = input.nextDouble();

        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek :");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Total Nilai : " + totalNilai);

        input.close();
    }
}
