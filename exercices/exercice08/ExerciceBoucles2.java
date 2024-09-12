package exercices.exercice08;

public class ExerciceBoucles2 {
    public static void main(String[] args) {
        System.out.println("Boucle for:");
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
        System.out.println("Décollage !!");
        System.out.println(" ");
        System.out.println("Boucle while:");
        int i=5;
        while (i>0) {
            System.out.println(i);
            i--;
        }
        System.out.println("Décollage !!");
        System.out.println(" ");
        System.out.println("Boucle do-while:");
        i=5;
        do{System.out.println(i);
            i--;
        }while(i>0);
        System.out.println("Décollage");
    }
}
