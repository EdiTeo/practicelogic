package practicelogic.practices;

 import java.util.*;
public class PareImpares {
   

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = sc.nextInt();
        int[] arr = new int[tamaño];
        int[] par = new int[tamaño];
        int[] impar = new int[tamaño];
        int j = 0, k= 0;
        for(int i = 0; i < tamaño; i++){
            System.out.printf("Ingrese el elemento %d:",(i+1));
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                par[j] = arr[i];
                j++;
            }else{
                impar[k] = arr[i];
                k++;
            }
        }
        System.out.println("Arreglo de Pares: "+ Arrays.toString(par));
        System.out.println("Arreglo de Impares: "+Arrays.toString(impar));
    }
}


