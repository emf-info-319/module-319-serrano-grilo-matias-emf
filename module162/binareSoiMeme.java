package module162;
import java.util.Scanner;
public class binareSoiMeme {
    public static void main(String[] args) {
        int[] tableauDeValeurBinaire=new int[]{1,2,4,8,16,32,64,128,256,512,10242048,4096,8192,16384,32768};
        System.out.println(convertirNombre(demandeDuNombreBinaire(), tableauDeValeurBinaire));
    }
    
    public static int demandeDuNombreBinaire(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quelle est le binaire que vous voulez convertir : ");
        int guess = scanner.nextInt();
        return guess;
    }
    public static int convertirNombre(int guess,int[]tab){
        int nombre = guess; 

        String nombreString = String.valueOf(nombre);

        int[] tableau = new int[nombreString.length()];

        for (int i = 0; i < nombreString.length(); i++) {
            tableau[i] = Character.getNumericValue(nombreString.charAt(i));
        }
        for (int i = tab.length-1; i > 0; i--) {
            if (tableau) {
                
            }
            
        }
        int nbrConverti=1;
        return nbrConverti;
    }
}
