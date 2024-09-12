package devoirs.devoir02;

public class devoir02 {
    public final static double CAPACITE_RESERVOIR_A = 3;//variable constante qui ne change jamais
    public final static double CAPACITE_RESERVOIR_B = 3;
    public static void main(String[] args) {
        int remplissage = ( int ) ( Math.random() * ( 8 - 0 + 1 ) ) + 0;//nombre aléatoire
        System.out.println("Il y a "+remplissage+" litres à remplir.");
        int reservoirA =0;
        int reservoirB=0;
        while(CAPACITE_RESERVOIR_A+CAPACITE_RESERVOIR_B>remplissage){
            remplissage--;
            reservoirA++;
            while (condition) {
                
            }
            if (remplissage==0) {
                break;
            }
            
        }
    
    }
    
}
