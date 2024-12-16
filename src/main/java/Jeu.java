import models.Ennemi;
import models.Tour;

import java.util.ArrayList;

public class Jeu {

    private int argent;
    private final ArrayList<Tour> tours;
    private final ArrayList<Ennemi> ennemis;
    private int pv_base;

    public Jeu() {
        this.argent = 200;
        this.pv_base = 100;
        this.tours = new ArrayList<>();;
        this.ennemis = new ArrayList<>();;
    }

    static void JeuMenu(){
        System.out.println("--- MENU ---\n\n");
        System.out.println(
                """
                        1.  Construire une tour
                        2. Afficher les caractéristiques des tours
                        3.  Lancer une attaque
                        4. Afficher la liste des ennemis
                        5.  Finir le tour
                        6. Quitter le jeu"""
        );
    }
}
