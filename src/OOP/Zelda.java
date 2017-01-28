package OOP;

/**
 * Created by henri on 28.01.17.
 */
public class Zelda {

    int hp;

    public Zelda(int elusid) {
        hp = elusid;
        System.out.println(hp);
    }

    public void kaklusKolliga(int kollilElusid) {
        hp = hp - kollilElusid;
        System.out.println("Koll ründab!");
    }

    public void prindiMituEluAlles() {
        System.out.println("Zeldal on " + hp + " elu alles.");
    }

    public void prindiKasOnElus() {
        if (hp > 0) {
            System.out.println("Zelda on veel elus!");
        } else {
            System.out.println("Zelda hukkus!");
        }
    }
}
