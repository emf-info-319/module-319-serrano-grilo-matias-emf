
import java.util.Arrays;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        int nombre = 164661; // Le nombre à décortiquer

        // Convertir le nombre en chaîne de caractères
        String nombreString = String.valueOf(nombre);

        // Créer un tableau d'entiers de la même longueur que la chaîne
        int[] tableau = new int[nombreString.length()];

        // Remplir le tableau avec les chiffres du nombre
        for (int i = 0; i < nombreString.length(); i++) {
            tableau[i] = Character.getNumericValue(nombreString.charAt(i));
        }

        // Afficher le tableau
        System.out.println("Tableau des chiffres : " + Arrays.toString(tableau));
        
    }
}