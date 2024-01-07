package practicelogic.practices;

import java.util.*;

public class Rotation{
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int[] number = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.printf("%d. Ingrese el numero: ", (i+1));
            number[i] = sc.nextInt();
        }
        System.out.println("Ingrese el numero de veces que se rote: ");
        int n = sc.nextInt(), i = 0;
         int[] rotated = new int[10];
        for (  i = 0; i < 10; i++) {
            rotated[(i + n) % 10] = number[i];
        }
        System.out.println(Arrays.toString(rotated));    
         
    }
}
