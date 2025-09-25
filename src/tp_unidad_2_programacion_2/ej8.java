/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double basePrice, tax, disc;
        
        System.out.println("Ingrese el precio base del producto: ");
        basePrice = Double.parseDouble(input.nextLine());
        
        System.out.println("Igrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        tax = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        disc = Double.parseDouble(input.nextLine());
        
        calcularPrecioFinal( basePrice, tax, disc );
    }
    
    public static void calcularPrecioFinal(double basePrice, double tax, double disc){
        double finalPrice = basePrice + (((basePrice * tax) - (basePrice * disc)) / 100);
        System.out.println("El precio final del producto es: " + finalPrice);
    }
}
