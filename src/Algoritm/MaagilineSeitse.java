package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        int sum = 0;
        int avg;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] == 7) {
                sum = sum + 14;
            } else {
                sum = sum + naide[i];
            }
        }

        avg = sum / naide.length;
        System.out.println("Läbkorrutatud seitsmetega massiivi keskmine on " + avg);

    }

}
