package OOP;

import java.util.Arrays;

/**
 * Created by henri on 28.01.17.
 */
public class Pastakas {

    int tint;
    int tahed;

    public Pastakas(int tindiKogus) {
        tint = tindiKogus;
    }

    public void kirjuta(String withSpaces) {
        String noSpaces = withSpaces.replace(" ", "");
        tahed = noSpaces.length();

        if (tint >= noSpaces.length()) {
            System.out.println(withSpaces);
            tint = tint - noSpaces.length();
        } else {
            String tintLoppemasEhkUusLause = withSpaces.substring(0, tint);
            for (int i = 0; i < tintLoppemasEhkUusLause.length(); i++) {
                String a = String.valueOf(tintLoppemasEhkUusLause.charAt(i));
                if (a.equals(" ")) {
                    tint++;
                }
            }
            System.out.println(withSpaces.substring(0, tint));
        }
    }

    public void prindiPaljuTintiAlles() {
        System.out.println("Tinti on järel " + tint + " ühikut");
    }
}
