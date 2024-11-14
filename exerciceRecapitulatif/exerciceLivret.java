package exerciceRecapitulatif;

public class exerciceLivret {
    public final static int MIN = 5;
    public final static int MAX = 20;

    public static void main(String[] args) {
        int nbr1 = choisirUnNombre();
        int nbr2 = choisirUnNombre();

        System.out.println("Les chiffres sont : " + nbr1 + " " + nbr2);
        String[] tab = new String[construireTableMultiplication(nbr1, nbr2).length];
        tab = construireTableMultiplication(nbr1, nbr2);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }
    }

    public static int choisirUnNombre() {
        int nbrAleatoire = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        return nbrAleatoire;
    }

    public static String[] construireTableMultiplication(int nbr1, int nbr2) {
        String[] tab = new String[nbr1 * nbr2];
        int index = 0;
        for (int a = 1; a <= nbr1; a++) {
            for (int b = 1; b <= nbr2; b++) {
                tab[index] = a + " x " + b + " = " + (a * b);
                index++;
            }
        }
        return tab;
    }
}
