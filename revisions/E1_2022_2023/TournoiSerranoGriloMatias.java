package revisions.E1_2022_2023;

public class TournoiSerranoGriloMatias {
    public static final String[] EQUIPES = new String[] { "FC Richemont", "FC Central", "FC Schoeberg", "FC Beauregard",
            "Team AFF", "Etoile Sport" };
    public static final int MAX_GOAL = 10;
    public static int[] POINT_EQUIPES = new int[6];

    public static void main(String[] args) {

    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        if (scoreEquipe1 < scoreEquipe2) {
            POINT_EQUIPES[index1] += 3;
            System.out.println("L'équipe " + EQUIPES[index2] + " a gagné contre l'équipe " + EQUIPES[index1]);
        } else if (scoreEquipe1 > scoreEquipe2) {
            POINT_EQUIPES[index2] += 3;
            System.out.println("L'équipe " + EQUIPES[index1] + " a gagné contre l'équipe " + EQUIPES[index2]);

        } else {
            POINT_EQUIPES[index1] += 1;
            POINT_EQUIPES[index2] += 1;
            System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
        }
    }

    public static int rechercheMaxPts() {
        int max = POINT_EQUIPES[0];
        for (int i = 1; i < POINT_EQUIPES.length; i++) {
            max = Math.max(max, POINT_EQUIPES[i]);
        }
        return max;
    }

    public static int[] trouveGagnants(){
        int maxPts= rechercheMaxPts();
        int compteurDesGagnants=0;
        for
    }
}
