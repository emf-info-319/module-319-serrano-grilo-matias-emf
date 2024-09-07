package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        byte monAge = 15;
        boolean estMajeur;
        String prenom = "Matias";
        String nom = "Grilo";
        if (monAge > 20) {
            estMajeur = true;

        } else {
            estMajeur = false;
        }
        System.out.println("Je m'appelle " + prenom + " " + nom);
        System.out.println("Mon âge est de : " + monAge + " ans");
        if (estMajeur) {
            System.out.println("Je suis majeur");

        } else {
            System.out.println("Je ne suis pas encore majeur");
        }

    }

}
