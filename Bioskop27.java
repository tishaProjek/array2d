public class Bioskop27 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Andi";
        penonton[0][1] = "Anis";
        penonton[1][0] = "Budi";
        penonton[1][1] = "Gisel";
        penonton[2][0] = "Citra";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Dewi";
        penonton[3][1] = "Hana";
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        // menampilkan nama pada baris 3 (indeks 2)
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
    }
}
