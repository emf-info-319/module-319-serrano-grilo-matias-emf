package devoirs.devoir05;

import java.util.Scanner;

public class devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une valeur entre 1 et 100 : ");
        int guess = scanner.nextInt();
        while (guess != nbre) {
            if (guess > nbre) {
                System.out.println("Trop grand");
                guess = scanner.nextInt();
            } else if (guess < nbre) {
                System.out.println("Trop petit");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Bravo, trouvé");
        scanner.close();

    }

}