package practicelogic.practices;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Escribe una frase: ");
        String nombre = sc.nextLine(); 
        nombre = nombre.toLowerCase();
        int countVocal = 0;
        int letter = 0;
        for(char iterando : nombre.toCharArray()){
            
            if(iterando == 'a' || iterando == 'e' || iterando == 'i' || iterando == 'o' || iterando == 'u' ){
                countVocal++;
            }else{
                if( Character.isLetter(iterando) )
                    letter++;
            }
        }
        int sumletter = 0;
        sumletter = countVocal + letter;
        System.out.printf("Total de letra es: %d", sumletter);
        System.out.println("\nCantidad vocales es: "+ countVocal);
        System.out.print("Cantidad de letras es: "+ letter);
    }
}