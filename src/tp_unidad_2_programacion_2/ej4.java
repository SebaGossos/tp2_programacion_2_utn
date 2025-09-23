
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej4 {
    
    final static int DISCOUNT_A = 10;
    final static int DISCOUNT_B = 15;
    final static int DISCOUNT_C = 20;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double priceProd = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la categoría del producto (A, B, C): ");
        char catProd = input.nextLine().toUpperCase().charAt(0);
           
        finalPrice( priceProd, catProd );
        
    }
    
    public static void finalPrice( double priceProd, char catProd ) {
        double discount;
        switch( catProd ) {
            case 'A':
                discount = (priceProd * DISCOUNT_A) / 100;
                System.out.println("El precio del producto es: " + priceProd );
                System.out.println("El descuento del producto es el " + DISCOUNT_A + "% equivalente a: " + discount);
                System.out.print("El precio final del producto es: " + (priceProd - discount) );
                break;
            case 'B':
                discount = (priceProd * DISCOUNT_B) / 100;
                System.out.println("El precio del producto es: " + priceProd );
                System.out.println("El descuento del producto es el " + DISCOUNT_B + "% equivalente a: " + discount);
                System.out.print("El precio final del producto es: " + (priceProd - discount) );
                break;
            case 'C':
                discount = (priceProd * DISCOUNT_C) / 100;
                System.out.println("El precio del producto es: " + priceProd );
                System.out.println("El descuento del producto es el " + DISCOUNT_C + "% equivalente a: " + discount);
                System.out.print("El precio final del producto es: " + (priceProd - discount) );
                break;
            default:
                System.out.println("Ingrese un caracter o precio valido");
        }
    }
    
}
