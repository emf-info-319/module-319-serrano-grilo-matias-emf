import java.util.Scanner;

public class E1SERRANO_GRILO {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int NOMBRE_TUILES = 12;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("*         'Shut the Box'         *");
        System.out.println("**********************************");
        System.out.println(
                "Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dés. Le 0 \npermet de terminer la partie.\n");
        for (int i = 0; i < tuiles.length; i++) {
            
            tuiles[i] = i+1;
        }
        while (enJeu) {
            
        afficheTuiles(tuiles);
        int totalDes = tireLesDes();
        System.out.println("Donnez le(s) nombre(s) à enlever :");
        tuiles=enleveTuiles(tuiles, totalDes);
        boolean encore=contientEncoreDesTuilesABaisse(tuiles);
        if (!encore) {
            System.out.println("Jeu terminé");
            SCANNER.close();
            enJeu=false;
        }
    }
    }

    public static void afficheTuiles(int[] tuiles) {
        for (int i = 0; i < tuiles.length; i++) {
            if (tuiles[i] == 0) {
                System.out.print("|_");
            } else if (tuiles[i] > 9) {
                System.out.print("|" + tuiles[i]);
            }

            else {
                System.out.print("|0" + tuiles[i]);
            }
        }
        System.out.println("|");

    }

    public static int tireLesDes() {
        int nb1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int nb2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int total = nb1 + nb2;
        System.out.println("Les nombres tirés sont : " + nb1 + " et " + nb2 + " qui font un total de " + total);
        return total;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demadeEncore = true;
        do {
            int valeur = SCANNER.nextInt();
            totalEnleve += valeur;
            if (valeur == 0) {
                System.out.println("Abandon...");
                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }
                copieTableau(tuilesTemp);
                demadeEncore = false;
            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println("Hors limites !");
                totalEnleve = 0;

            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve -= valeur;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demadeEncore = false;
                }
            }
        } while (demadeEncore == true);

        return tuiles;

    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }
    public static boolean contientEncoreDesTuilesABaisse(int[] tab){
        int pasVide=0;
        boolean encoreTuile;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>0) {
                pasVide++;
            }
        }
        if (pasVide>0) {
            encoreTuile=true;
        }else{
            encoreTuile=false;
        }
        return encoreTuile;

    }
}
