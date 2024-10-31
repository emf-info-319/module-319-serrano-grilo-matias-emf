import java.util.Scanner;

public class IntroMethode {

    public static void main(String[] args) {
        debut();

        int nombre1 = demandeNombre();
        int nombre2 = demandeNombre();
        int nombre3 = demandeNombre();
        int somme =somme(nombre1,nombre2,nombre3);
        System.out.println("\nLa somme est : " + somme);
        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bievenu sur ce preier programme.");
        System.out.println("on va voir les méthode dans ce cours.");
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEntrez un nombre : ");
        int reponse = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + reponse + " !");

        return reponse;
    }
    public static int somme(int nombre1,int nombre2, int nombre3){
        int somme = nombre1 + nombre2 + nombre3;
        
        return somme;
    }
    public static void fin() {
        System.out.println("\nProgramme terminé");
    }
}