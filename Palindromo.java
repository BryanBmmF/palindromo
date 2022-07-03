/**
 *
 * @author bryan
 */

import java.util.Scanner;

public class Palindromo {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            String palabra="";
        
            //en caso de que se especifiquen argumentos al ejecutr el programa
            for (int i = 0; i < args.length; i++) {
                palabra+=args[i]+"";
            }
            
            if(palabra.isEmpty()){
                System.out.println("Porfavor especifique un parametro al correr el programa");
            } else {
                StringBuilder alrevez = new StringBuilder(palabra);
                String nueva = alrevez.reverse().toString();
            
            
                if (nueva.equals(palabra)) {
                    System.out.println("La palabra ingresada SI es Palindromo");
                } else {
                    System.out.println("La palabra ingresada NO es Palindromo");
                }
            }
                
        
        
    }
}