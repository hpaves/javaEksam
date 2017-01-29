package OOP;

import java.util.ArrayList;

/**
 * Created by henri on 28.01.17.
 */
public class Kassa {

    ArrayList<String> shoppingList = new ArrayList<>();
    String kassapidajaNimi;

    public Kassa(String kassapidaja) {
        kassapidajaNimi = kassapidaja;
    }

    public void lisaToode(String toode) {
        shoppingList.add(toode);
    }

    public void eemaldaToode(String toode) {
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).equals(toode)) {
                shoppingList.remove(i);
            }
        }
    }

    public void prindiOstutsekk() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println();
        System.out.println("Teid teenindas " + kassapidajaNimi);
    }
}
