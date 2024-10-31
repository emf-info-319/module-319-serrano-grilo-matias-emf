package exercices.exercice10;

public class ExerciceMethodesTableaux {
    public static final int MINCELLULE = 10;
    public static final int MAXCELLULE = 20;
    public static final int MINTAB = 40;
    public static final int MAXTAB = 50;
    public static void main(String[] args) {
        int taille=(int) (Math.random() * (MAXTAB - MINTAB + 1) + MINTAB);;
        int[] tab = creerTableau(taille);
        remplirTableauFixe(tab);
        remplirTableauAleatoire(tab);
        devinerTailleTab(tab);
        afficherTab(tab);
        
        
    }
    public static int[] creerTableau(int taille){
        int[] tab=new int[taille];
        return tab;
    }
    public static int[] remplirTableauFixe(int[]tab){
        for (int i = 0; i < tab.length; i++) {
        int valeurCelulle = i;
        tab[i]=valeurCelulle;
        }
        
        return tab;
    }
    public static int[] remplirTableauAleatoire(int[]tab){
        for (int i = 0; i < tab.length; i++) {
        int valeurCelulle = (int) (Math.random() * (MAXCELLULE - MINCELLULE + 1) + MINCELLULE);
        tab[i]=valeurCelulle;
        }
        
        return tab;
    }
    public static int devinerTailleTab(int[]tab){
        int tailleTabDeviner=tab.length;
        
        return tailleTabDeviner;
    }
    public static void afficherTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public static int[] rechercheValeurMin(int[]tab){
        int min = Math.min(10, 20);
        return min;
    }
}
