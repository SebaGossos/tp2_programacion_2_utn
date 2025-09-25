/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej11 {
    
    final static double INPUT_OUTPUT = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double price = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(price);
    }
    public static void calcularDescuentoEspecial(double price) {
        double appliedDiscount = price * INPUT_OUTPUT;
        System.out.println("El descuento especial aplicado es: " + appliedDiscount);
        System.out.println("El precio final con descuento es: " + (price - appliedDiscount) );
    }
}
