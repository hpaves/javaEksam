package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {

    public static void main(String[] args) {
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        int sum = 0;
        int avg = 0;
        int count = 0;

        for (int i = 0; i < naide.length; i++) {
            sum = sum + naide[i].length();
        }

        avg = sum / naide.length;

        for (int i = 0; i < naide.length; i++) {
            if (avg < naide[i].length()){
                count++;
            }
        }

        System.out.println("Keskmisest pikemaid sõnesid on " + count);
    }

}
