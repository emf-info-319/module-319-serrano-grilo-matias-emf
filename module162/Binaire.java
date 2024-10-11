package module162;

import java.util.Scanner;

public class Binaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre décimal : ");
        int rep = scanner.nextInt();
        String binary = Integer.toBinaryString(rep);
        String hex = Integer.toHexString(rep);
        System.out.println("le nombre en binaire est : " + binary);
        System.out.println("le nombre en hexadecimal est : " + hex);
        int nombreDecimal = scanner.nextInt();
    }

}
