public class ExerciceTableaux3 {
    public final static int min = 1;
    public final static int max = 6;

    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int NbCellule = 0; NbCellule < tab.length; NbCellule++) {
            tab[NbCellule] = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("Cellule " + NbCellule + " : " + tab[NbCellule]);
        }
        int NoteAdd = 0;
        for(int NbCellule=0;NbCellule<tab.length;NbCellule++){
            NoteAdd=NoteAdd+tab[NbCellule];
        }
        System.out.println("La moyenne de classe est de "+NoteAdd/10);
    }
}
