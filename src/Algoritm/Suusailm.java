package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        tempFinder(kraadid1);
        tempFinder(kraadid2);

    }


    public static void tempFinder(int[] arrayName) {
        int posCount = 0;
        int negCount = 0;
        int diff;

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > 0) {
                posCount++;
            } else if (arrayName[i] < 0) {
                negCount++;
            }
        }

        diff = posCount - negCount;

        if (diff < 0) {
            diff = 0; // kui positiivdeid on vähem, siis on neid nulli võrra rohkem
        }

        System.out.println("Positiivseid on " + diff + " võrra rohkem.");

    }

}
