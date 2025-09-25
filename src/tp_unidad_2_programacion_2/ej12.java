
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej12 {
    final static int INDEX_TO_MODIFY = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] prices = {
            199.99,
            299.5,
            149.75,
            399.0,
            89.99
        };
        System.out.println("Precios originales");
        for( double price: prices ) {
            System.out.println(price);
        }
        System.out.println("Precios modificados");
        
        for( int i = 0; i < prices.length; i++ ) {
            if( i == INDEX_TO_MODIFY ) prices[i] = 129.99;
            System.out.println(prices[i]);
        }
    }
    
}
