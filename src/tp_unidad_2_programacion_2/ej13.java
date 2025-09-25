package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej13 {
    final static int INDEX_TO_MODIFY = 2;

    public static void main(String[] args) {
        double[] prices = {
            199.99,
            299.5,
            149.75,
            399.0,
            89.99
        };
        Scanner input = new Scanner(System.in);
        
        System.out.println("Precios originales: ");
        showPrices(prices, 0, -1);
        System.out.println("Precios modificados: ");
        showPrices(prices, 0, INDEX_TO_MODIFY);
    }
    
    public static void showPrices(double[] prices, int index, int indexToChange ){
        if(prices.length > index) {
            if( indexToChange == index ) prices[index] = 129.99;  
            System.out.println("Precio: " + prices[index]);
            showPrices(prices, index + 1, indexToChange );
        }
        
    }
}
