package devoirs.devoir02;

public class devoir02 {
    public final static double CAPACITE_RESERVOIR_A = 3;// variable constante qui ne change jamais
    public final static double CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int remplissage = (int) (Math.random() * (8 - 0 + 1)) + 0;// nombre aléatoire entre 0  et 8
        System.out.println("Il y a " + remplissage + " litres à remplir.");//dit le nombre aléatoire de litre à remplir
        int reservoirA = 0;//définition de la valeur du résérvoir a
        int reservoirB = 0;//définition de la valeur du résérvoir b
        while (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B >= remplissage) {//tant que la capacité de a et b est plus grand que le remplisage faire ce qui est dedans
            if (remplissage == 0) {//si le remplissage est égal a 0 arreter
                break;
            }
            remplissage--;//remplissage moin 1
            if (reservoirA < 3) {//si le reservoir a est plus petit que troi faire ça
                reservoirA++;//reservoir plus 1
                System.out.println("Remplisage du réservoir A...");
                System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);//dire combien de litre a chaque reservoir
            } else {//sinon faire ça
                reservoirB++;//reservoir b plus 1
                System.out.println("Remplisage du réservoir B...");
                System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);//dire combien de litre a chaque reservoir
            }
        }
        System.out.println("Remplissage terminé!");
    }
}