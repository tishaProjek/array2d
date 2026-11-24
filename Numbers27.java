import java.util.Arrays;

public class Numbers27 {
    public static void main(String[] args) {

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers));
            System.out.println(Arrays.deepToString(myNumbers));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        int[][] salinan = new int[myNumbers.length][];

        for (int i = 0; i < myNumbers.length; i++) {
            salinan[i] = new int[myNumbers[i].length];
            for (int j = 0; j < myNumbers[i].length; j++) {
                salinan[i][j] = myNumbers[i][j];
            }
        }
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);

    }
}
