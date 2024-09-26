package exercices;

public class SerranoGriloE00 {
    public final static int NOMBRE_PTS_VICTOIRE = 3;
    public final static int max = 10;
    public final static int min = 1;

    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;
        for (int i = 0; i < 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (max - min + 1)) + min;
            int scoreEquipe2 = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " et le résultat est : " + scoreEquipe1
                    + " à " + scoreEquipe2);
            if (scoreEquipe1 > scoreEquipe2) {
                System.out.println(nomEquipe1 + " a gagné");
                nombrePointEquipe1 = nombrePointEquipe1 + NOMBRE_PTS_VICTOIRE;
            } else if (scoreEquipe1 == scoreEquipe2) {
                System.out.println("Match nul");
                nombrePointEquipe1++;
                nombrePointEquipe2++;
            } else {
                System.out.println(nomEquipe2 + " a gagné");
                nombrePointEquipe2 = nombrePointEquipe2 + NOMBRE_PTS_VICTOIRE;
            }
        }
        System.out.println(nomEquipe1 + " a " + nombrePointEquipe1);
        System.out.println(nomEquipe2 + " a " + nombrePointEquipe2);

    }

}
