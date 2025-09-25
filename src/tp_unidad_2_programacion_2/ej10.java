
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int currStock = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        int quantitySold = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida:  ");
        int quantityReceived = Integer.parseInt(input.nextLine());
        
        actualizarStock( currStock, quantitySold, quantityReceived);
    }
    
    public static void actualizarStock( int currStock, int quantitySold, int quantityReceived) {
        int newStock = (currStock - quantitySold) + quantityReceived; 
        System.out.println("El nuevo stock del producto es: " + newStock);
    }
    
}
