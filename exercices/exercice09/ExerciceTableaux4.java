public class ExerciceTableaux4 {
    public static void main(String[] args) {
        int NbDeBase=17;
        int[] tab=new int[5];
        for(int NbSuivant=0;NbSuivant<tab.length;NbSuivant++){
            int NouveauNb=NbDeBase++;
            tab[NbSuivant]=NouveauNb;
            System.out.println("Cellule"+" : "+NouveauNb);
        }
    }
    
}
