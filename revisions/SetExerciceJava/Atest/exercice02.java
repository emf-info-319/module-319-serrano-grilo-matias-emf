package revisions.SetExerciceJava.Atest;

public class exercice02 {
    public final static int MAX = 10;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int nb1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int nb2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int nb3 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        if (nb1 > nb2 ) {
            System.out.println(nb2);
            System.out.println(nb1);

        } else {
            System.out.println(nb1);
            System.out.println(nb2);
        }
    }
    
}
//Je suis bloquer