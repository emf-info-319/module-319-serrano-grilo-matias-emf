package exercices.exercice11;

public class ExerciceInversionTableau {
    public final static int MIN = 0;
    public final static int MAX = 100;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("Contenu du tableau initial : ");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.println("Tableau initial ["+i+"] = "+tableauInitial[i]);
        }
        int[]tableauFinal = new int[4];
        inverseLeTableau(tableauInitial, tableauFinal);
        System.out.println("\nContenu du tableau final : ");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau initial ["+i+"] = "+tableauFinal[i]);
        }
    }

    public static int[] inverseLeTableau(int[]tableauInitial, int[] tableauFinal) {
        int fin=tableauInitial.length-1;
        for (int i = 0; i < tableauFinal.length; i++) {
            tableauFinal[i]=tableauInitial[fin];
            fin--;
        }
        return tableauFinal;
    }

}
