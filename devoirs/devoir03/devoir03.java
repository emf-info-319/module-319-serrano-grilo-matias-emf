package devoirs.devoir03;

public class devoir03 {
    public static void main(String[] args) {
        int jour=26;
        int mois=11;
        int annee=2024;
        int JourTotale=0;
        int[] tab=new int []{31,28,31,30,31,30,31,31,30,31,30,31};
        int newmonth=mois-1;
        if(annee%4==0){
            tab[2]++;
        }
        for(int i=0;i<newmonth;i++){
            JourTotale+=tab[i];
        }
        int jourvrai=JourTotale+jour;
        System.out.println("Le"+jour+"/"+mois+"/"+annee+" est le jour "+jourvrai+" de l'An");
    }
    
}
