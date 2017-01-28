package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by henri on 27.01.17.
 */
public class Chat {
    String nimi;
    ArrayList<String[]> messages = new ArrayList(); // määrab, et arraylistisis saavad olla AINULT stringid

    public Chat(String toaNimi) {
        nimi = toaNimi;
    }
    public void sisestaSonum(String kasutaja, String sonum) { // VÄÄRTUSED lendavad sellel real olevate MUUTUJATE sisse
        String[] rida = new String[2];
        rida[0] = kasutaja;
        rida[1] = sonum;
        messages.add(rida);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(Arrays.toString(messages.get(i)));
        }
    }

    public void adminKustutabSonumi(String kustutatav) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i)[1].equals(kustutatav)) { //muutuja, massiiv, string
            // messages.remove(i); // kustutab terve rea koos sõnumi ja nimega
                messages.get(i)[1] = "DELETED!"; // kustutab vaid sõnumi
            }
            System.out.println();
        }
    }

    public void prindiToaNimi() {
        System.out.println(nimi);
    }
}
