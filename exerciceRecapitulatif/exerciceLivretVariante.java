package exerciceRecapitulatif;

import java.util.Scanner;

public class exerciceLivretVariante {
    public final static int MIN = 5;
    public final static int MAX = 20;

    public static void main(String[] args) {
        int nbr1 = choisirUnNombre();
        int nbr2 = choisirUnNombre();

        System.out.println("Les chiffres sont : " + nbr1 + " " + nbr2);
        String[] tab = new String[construireTableMultiplication(nbr1, nbr2).length];
        tab = construireTableMultiplication(nbr1, nbr2);
        System.out.print("Entrez une valeur correcte : ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        
        
        if (guess > tab.length || guess < 0) {
            while (guess > tab.length || guess < 0) {
                
            
            System.out.print("Entrez une valeur correcte :");

            guess = scanner.nextInt();
            }
            System.out.println(tab[guess]);
        }else{
        System.out.println(tab[guess]);
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
