package exercices.exercice10;

public class ExerciceMethodesTableaux {
    public static final int MINCELLULE = 1;
    public static final int MAXCELLULE = 20;
    public static final int MINTAB = 40;
    public static final int MAXTAB = 50;

    public static void main(String[] args) {
        int taille = (int) (Math.random() * (MAXTAB - MINTAB + 1) + MINTAB);
        ;
        int[] tab = creerTableau(taille);
        System.out.println("Le tableau a une taille de " + tab.length + " celllules\n");
        System.out.println("Contenu du tableau aléatoire :");
        remplirTableauFixe(tab);
        remplirTableauAleatoire(tab);
        devinerTailleTab(tab);
        afficherTab(tab);
        System.out.println("\nLa valeur min trouvée = " + rechercheValeurMin(tab));
        System.out.println("La valeur max trouvée = " + rechercheValeurMax(tab));
        direCombienDeNomvreX(tab, taille);
        System.out.println("La somme des cellules du tableau = " + sommeTableau(tab, taille));
        System.out.println("La moyenne des cellules du tableau = " + moyenneTableau(tab, taille));
        nombresRemplaces(tab, taille, taille);
        occurencePremierNombre(tab, taille);
        occurenceDernierNombre(tab, taille);

    }

    public static int[] creerTableau(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    public static int[] remplirTableauFixe(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int valeurCelulle = i;
            tab[i] = valeurCelulle;
        }

        return tab;
    }

    public static int[] remplirTableauAleatoire(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int valeurCelulle = (int) (Math.random() * (MAXCELLULE - MINCELLULE + 1) + MINCELLULE);
            tab[i] = valeurCelulle;
        }

        return tab;
    }

    public static int devinerTailleTab(int[] tab) {
        int tailleTabDeviner = tab.length;

        return tailleTabDeviner;
    }

    public static void afficherTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    public static int rechercheValeurMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }
        return min;
    }

    public static int rechercheValeurMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }

    public static int direCombienDeNomvreX(int[] tab, int frequence) {
        frequence = 0;
        int valeurCompter = (int) (Math.random() * (rechercheValeurMax(tab) - rechercheValeurMin(tab) + 1)
                + rechercheValeurMin(tab));
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurCompter) {
                frequence++;

            }
        }
        System.out.println("La valeur " + valeurCompter + " à été trouvée " + frequence + " fois.");
        return frequence;
    }

    public static int sommeTableau(int[] tab, int somme) {
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }

        return somme;
    }

    public static float moyenneTableau(int[] tab, float moyenne) {
        for (int i = 0; i < tab.length; i++) {
            moyenne += tab[i];
        }
        moyenne /= tab.length;
        return moyenne;
    }

    public static int[] nombresRemplaces(int[] tab, int valeurRecherche, int valeurRemplacer) {
        valeurRecherche = (int) (Math.random() * (rechercheValeurMax(tab) - rechercheValeurMin(tab) + 1)
                + rechercheValeurMin(tab));
        valeurRemplacer = (int) (Math.random() * (rechercheValeurMax(tab) - rechercheValeurMin(tab) + 1)
                + rechercheValeurMin(tab));
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurRecherche) {
                tab[i] = valeurRemplacer;
            }

        }
        System.out.println("\nAprès remplacement de la valeur " + valeurRecherche + " par la valeur " + valeurRemplacer
                + " voici le contenu du tableau :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]=" + tab[i]);
        }
        return tab;
    }

    public static int occurencePremierNombre(int[] tab, int nbr) {
        nbr = (int) (Math.random() * (rechercheValeurMax(tab) - rechercheValeurMin(tab) + 1) + rechercheValeurMin(tab));
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nbr) {
                System.out.println("La valeur " + nbr + " a été trouvée à la 1ère position N°" + i);
                break;
            }
            
            if (i < tab.length && i>tab.length-2) {
                System.out.println("La valeur " + nbr + " n'a pas été trouvé");
            }

        }
        return nbr;
    }
    public static int occurenceDernierNombre(int[] tab, int nbr) {
        nbr = (int) (Math.random() * (rechercheValeurMax(tab) - rechercheValeurMin(tab) + 1) + rechercheValeurMin(tab));
        for (int i = tab.length-1; i!=-1; i--) {
            
            if (tab[i] == nbr) {
                System.out.println("La valeur " + nbr + " a été trouvée à la dernière position N°" + i);
                break;
            }
            
            if (i ==0) {
                System.out.println("La valeur " + nbr + " n'a pas été trouvé");
            }

        }
        return nbr;
    }
}
