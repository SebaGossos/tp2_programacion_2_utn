package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej6 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, cer = 0, numUser;
        System.out.println("Ingrese 10 numeros enteros: ");
        for( int i = 0; i < 10; i++ ) {
            System.out.print( (i + 1) + " Ingrese un numero: ");
            numUser = Integer.parseInt(input.nextLine());
            if(numUser > 0) {
                pos++;
            } else if( numUser < 0 ) {
                neg++;
            } else {
                cer++;
            }
        }
        System.out.println("Cantidad de numeros positivos: " + pos);
        System.out.println("Cantidad de numeros negativos: " + neg);
        System.out.println("Cantidad de cero: " + cer);
    }
    
}
