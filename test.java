

import java.util.Random;

public class test {

    public static void main(String[] args) {
        int taille = 50;
        int[] tab = creerTableau(taille);
        tab = remplirTableauValeurFixe(tab, 12); // Remplissage avec une valeur fixe

        tab = remplirTableauAleatoire(tab); // Remplissage avec des valeurs aléatoires
        System.out.println("Le tableau a une taille de " + tab.length + " cellules.");

        System.out.println("Contenu du tableau aléatoire :");
        afficherTableau(tab);

        int min = trouverMin(tab);
        int max = trouverMax(tab);
        System.out.println("La valeur min trouvée = " + min);
        System.out.println("La valeur max trouvée = " + max);

        tab = remplacerValeur(tab, 12, 5); // Remplacer 12 par 5
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tab);

        double somme = calculerSomme(tab);
        double moyenne = calculerMoyenne(tab);
        System.out.println("La somme des cellules du tableau = " + somme);
        System.out.println("La moyenne des cellules du tableau = " + moyenne);

        int valeurARechercher = 13;
        int premierePosition = chercherPremiereOccurrence(tab, valeurARechercher);
        int dernierePosition = chercherDerniereOccurrence(tab, valeurARechercher);
        System.out.println("La valeur " + valeurARechercher + " a été trouvée à la 1ère position N°" + premierePosition);
        System.out.println("La valeur " + valeurARechercher + " a été trouvée à la dernière position N°" + dernierePosition);
    }

    // Crée un tableau d'entiers d'une certaine taille
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // Remplit un tableau avec une valeur fixe
    public static int[] remplirTableauValeurFixe(int[] tab, int valeurFixe) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeurFixe;
        }
        return tab;
    }

    // Remplit un tableau avec des valeurs aléatoires
    public static int[] remplirTableauAleatoire(int[] tab) {
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(21); // Valeurs aléatoires entre 0 et 20
        }
        return tab;
    }

    // Détermine la taille d'un tableau
    public static int tailleTableau(int[] tab) {
        return tab.length;
    }

    // Affiche le contenu d'un tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]=" + tab[i]);
        }
    }

    // Recherche la valeur minimum d'un tableau
    public static int trouverMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    // Recherche la valeur maximum d'un tableau
    public static int trouverMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    // Compte la fréquence d'une valeur dans un tableau
    public static int compterFrequence(int[] tab, int valeur) {
        int count = 0;
        for (int i : tab) {
            if (i == valeur) {
                count++;
            }
        }
        return count;
    }

    // Établit la somme des valeurs contenues dans un tableau
    public static double calculerSomme(int[] tab) {
        double somme = 0;
        for (int i : tab) {
            somme += i;
        }
        return somme;
    }

    // Établit la moyenne des valeurs contenues dans un tableau
    public static double calculerMoyenne(int[] tab) {
        double somme = calculerSomme(tab);
        return somme / tab.length;
    }

    // Remplace une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tab, int valeurRecherchee, int valeurRemplacement) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurRecherchee) {
                tab[i] = valeurRemplacement;
            }
        }
        return tab;
    }

    // Recherche la première occurrence d'une valeur dans un tableau
    public static int chercherPremiereOccurrence(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                return i; // Retourne l'index de la première occurrence
            }
        }
        return -1; // Retourne -1 si la valeur n'est pas trouvée
    }

    // Recherche la dernière occurrence d'une valeur dans un tableau
    public static int chercherDerniereOccurrence(int[] tab, int valeur) {
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] == valeur) {
                return i; // Retourne l'index de la dernière occurrence
            }
        }
        return -1; // Retourne -1 si la valeur n'est pas trouvée
    }
}

