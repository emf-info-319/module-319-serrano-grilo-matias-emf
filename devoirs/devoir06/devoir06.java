package devoirs.devoir06;

public class devoir06 {
    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] tab = genereTableau(VALEUR_MAX, VALEUR_MIN, TAILLE_TABLEAU);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Tableau[" + i + "] = " + "[" + tab[i] + "]");
        }
        System.out.println("La plus petite valeur trouvée est : " + rechercheMin(tab));
        System.out.println("La plus grande valeur trouvée est : " + rechercheMax(tab));
        System.out.println("Le nombre[" + VALEUR_RECHERCHEE + "] figure à la position ["
                + rechercheValeur(tab, VALEUR_RECHERCHEE, TAILLE_TABLEAU) + "] du tableau");
    }

    public static int[] genereTableau(int VALEUR_MAX, int VALEUR_MIN, int TAILLE_TABLEAU) {
        int[] tableau = new int[TAILLE_TABLEAU];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1) + VALEUR_MIN);
        }

        return tableau;
    }

    public static int rechercheMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }

        return min;
    }

    public static int rechercheMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }

    public static int rechercheValeur(int[] tab, int VALEUR_RECHERCHEE, int position) {
        position=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == VALEUR_RECHERCHEE) {
                position = i;
                break;
            }
        }
        if (position==0) {
            position=-1;
        }

        return position;
    }

}
