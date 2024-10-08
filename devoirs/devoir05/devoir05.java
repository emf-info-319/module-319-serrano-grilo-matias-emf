package devoirs.devoir05;

public class devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int nbre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une valeur svp : ");
        int valeur = scanner.nextInt();
        scanner.nextLine();

        while (scanner != nbre) {
            System.out.print("Entrez une valeur svp : ");
            scanner.nextLine();
            if (scanner > nbre) {
                System.out.println("trop grand");

            } else if (scanner < nbre) {
                System.out.println("trop petit");

            } else {
                System.out.println("Bravo, trouvé !");
            }

        }
        scanner.close();

    }

}
// je n'ai pas réussi a comprendre comment utiliser le scanner le scanner