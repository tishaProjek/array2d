import java.util.Scanner;

public class Survei27 {

    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        Scanner sc = new Scanner(System.in);
        int[][] data = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        // untuk menyimpan hasil survei
        for (int i = 0; i < data.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                data[i][j] = sc.nextInt();}
        }

        // menghitung rata stiap responden
        System.out.println("\n=== ratarata setiap responden ===");
        for (int i = 0; i < data.length; i++) {
            double total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];}
            double rata = total / data[i].length;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        // menghitung rata stiap pertanyaan
        System.out.println("\n=== rata rata setiap pertanyaan ===");
        for (int j = 0; j < data[0].length; j++) {
            double total = 0;
            for (int i = 0; i < data.length; i++) {
                total += data[i][j];

            } double rata = total / data.length;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        // menghitung rata keseluruhan
        double total = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];}

        }double rata = total / (data.length * data[0].length);
        System.out.println("\n=== rata rata keseluruhan ===");
        System.out.println("Rata-rata: " + rata);
    }
}
