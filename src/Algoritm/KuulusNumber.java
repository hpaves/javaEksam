package Algoritm;

import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7, 4, 4, 4}; // vastus on 7
        int[] uus = new int[naide.length];

        Arrays.sort(naide);

        int comparisonBase;
        int count;
        int greatestCount = 0;
        int comparisonGreatestValue = 0;

        for (int i = 0; i < naide.length; i++) {
            comparisonBase = naide[i];
            count = 0;
            for (int j = 0; j < naide.length; j++) {
                if (naide[j] == comparisonBase && comparisonBase !=3) {
                    count++;
                }
            }

            if (count > greatestCount) {
                greatestCount = count;
                comparisonGreatestValue = comparisonBase;
            }

        }

        System.out.println(comparisonGreatestValue);
        }

}
