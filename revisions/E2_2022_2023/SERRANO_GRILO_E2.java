package revisions.E2_2022_2023;

import java.util.Scanner;

public class SERRANO_GRILO_E2 {
    public final static int NOMBRE_BATONNETS = 21;
    public final static int MIN = 1;
    public final static int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
        System.out.println("Bienvenue dans le jeu de Nim !\nRègle : Vous et l'IA retirez tour à tour entre " + MIN
                + " et " + MAX + " bâtonnets.\nLe joueur qui retire le dernier bâtonnet perd.");
        boolean tourJoueur=false;
        while (nbBatonnetRestants(batonnets)>0) {
            afficheBatonnets(batonnets);
            if (tourJoueur) {
                tourJoueur=false;
                int nbEnleve=demanderNombre(scanner);
                enleverBatonnets(batonnets, nbEnleve);
                
            }else{
                tourJoueur=true;
                int nbEnleveIA=(int) (Math.random() * (MAX - MIN + 1)) + MIN;
                System.out.println("L'IA enlève "+nbEnleveIA+" bâtonnet(s).");
                enleverBatonnets(batonnets, nbEnleveIA);
                
            }
            
        }
        if (!tourJoueur) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne ;");
        }else{
            System.out.println("L'IA a retiré le dernier bâtonnet. Vous gagnez !");
        }
        scanner.close();
    }

    public static void afficheBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print(" |");

            } else {
                System.out.print(" -");
            }
        }
        System.out.println();
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbBatonnet = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbBatonnet++;
            }
        }
        return nbBatonnet;
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax;
        if (nbEnleve>nbRestants) {
            nbEnleveMax=nbRestants;
            
        }else{
            nbEnleveMax=nbEnleve;
        }
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        System.out.print("Combien de bâtonnets voulez-vous enlever (1, 2 ou 3) ? ");
        int reponse = scanner.nextInt();

        while (reponse > MAX || reponse < MIN) {

            System.out.print("Nombre hors de portée !\nCombien de bâtonnets voulez-vous enlever (1, 2 ou 3) ?");
            reponse = scanner.nextInt();
        }

        return reponse;
    }
}
