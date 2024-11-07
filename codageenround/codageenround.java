package codageenround;

public class codageenround {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        int[] rayons = new int[10];
        for (int i = 0; i < rayons.length; i++) {
            rayons[i]=genereNombre(1, 10);
            
        }
        for (int i = rayons.length-1; i >= 0; i--) {
            if (rayons[i]>50) {
                System.out.println(rayons[i]*rayons[i]*PI);
                System.out.println(rayons[i]);
            }else{
                System.out.println(rayons[i]*PI);
                System.out.println(rayons[i]);
            }
        }
    }
    public static int genereNombre(int min,int max){
    int nbr=(int) (Math.random() * (max - min + 1) + min);
        return nbr;
    }
}

