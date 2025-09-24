
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, userNum = 1;
        
        while(userNum != 0) {
            System.out.println("Ingrese un número (0 para terminar):");
            userNum = Integer.parseInt(input.nextLine());
            if( userNum % 2 == 0  ) {
                num += userNum;
            }
        }
        System.out.println("La suma de los pares es: " + num);
    }
    
    
    
}
