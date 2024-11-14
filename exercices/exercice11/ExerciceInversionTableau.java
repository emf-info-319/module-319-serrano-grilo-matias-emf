package exercices.exercice11;

public class ExerciceInversionTableau {
    public final static int MIN = 0;
    public final static int MAX = 100;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("Contenu du tableau initial : ");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }
        int[] tableauFinale = new int[4];
        tableauFinale = inverseLeTableau(tableauInitial);
        System.out.println("\nContenu du tableau final : ");
        for (int i = 0; i < tableauFinale.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauFinale[i]);
        }
    }

    public static int[] inverseLeTableau(int[] tableauInitial) {
        int[] tableauFinal = new int[tableauInitial.length];
        int fin = tableauInitial.length - 1;
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauFinal[i] = tableauInitial[fin];
            fin--;
        }

        return tableauFinal;
    }

}
