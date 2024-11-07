

import java.util.Random;

public class test {

    public static void main(String[] args) {
        int[] tab=new int[]{2,6,6,2,1,1,1,1};
        int nbr = 1;
        int occurence=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nbr) {
                occurence++;
            }

        }
        System.out.println("le nombre "+nbr+" à été trouvée "+occurence+" fois");
    }
}