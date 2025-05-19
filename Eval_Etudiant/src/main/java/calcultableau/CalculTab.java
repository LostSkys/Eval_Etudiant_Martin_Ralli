package calcultableau;

import java.util.*;


// Somme des éléments d'un tableau d'entiers
public class CalculTab {

    ArrayList tab = new ArrayList(50);
    int i;
    int n = 0;
    int Sum = 0;

    // Saisir la taille du tableau
    public void initTableau() {
        do {
            System.out.println("Veuillez entrer la taille du tableau");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n > 50);
    }

    //
    public void tab() {
        System.out.println("DEBUT PROGRAMME");
        for (i = 0; i < n; i++) {
            System.out.println("Veuillez entrer un nombre");
            Scanner sc1 = new Scanner(System.in);
            tab.set(i, sc1.nextInt());
        }
    }

    // Afficher chacuns des éléments du tableau
    public void affichageTableau() {
        System.out.println("Les élements de tableau sont : ");
        for (i = 0; i < n; i++) {
            //System.out.println(tab[i]);
        }
    }

    // Affichage de la somme
    public void affichageSomme() {
        // AFFICHAGE DE SOMME
        for (i = 0; i < n; i++) {
            //Sum += tab.get(i);
        }
        System.out.println("La somme des éléments est égale à " + Sum);
        System.out.println("FIN PROGRAMME");
    }

}