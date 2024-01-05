package practicelogic.practices;
import java.util.*;
public class inverso {
     
 
/**
 * arreglos:
 * 1) 
 * Inversión de un arreglo: 
 * Escribe un programa que invierta el orden
 *  de los elementos de un arreglo de enteros. 
 * No se permite utilizar colecciones auxiliares.
 */
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System. out. println("Ingrese el tañamo de su arreglo");
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
             System.out.printf("%d. Ingrese: ",(i+1));
             a[i] = sc.nextInt();
        }
        for(int i = a.length - 1; i >= 0; i--){
            System.out.println("Aqui: " + a[i]);
        }
        
    }
     
    
 
}
