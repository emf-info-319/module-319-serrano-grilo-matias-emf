package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        i = 1;
        System.out.println(" ");
        while (i <= 5) {
            System.out.println("Boucle while, itération " + i);
            i++;
        }
        System.out.println(" ");
        i = 1;
        do {
            System.out.println("Boucle do-while, itération " + i);
            i++;
        } while (i <= 5);
        System.out.println(" ");
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;//il va continuer sans faire l'action
            }
            System.out.println("Boucle for, itération " + i);
        }
        System.out.println(" ");
        i = 1;
        while (i <= 5) {
            System.out.println("Boucle while, itération " + i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}