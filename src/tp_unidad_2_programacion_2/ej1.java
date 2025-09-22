/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

/**
 *
 * @author winig
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el año a evaluar: ");
        int anoUser = Integer.parseInt(input.nextLine());
        
        String resp = isBisiesto(anoUser) ? "Es bisiesto" : "No es bisiesto";
        System.out.print(resp);
    }
    
    public static boolean isBisiesto( int ano ) {
        boolean isDivisibleBy400 = (ano % 400) == 0;
        if(isDivisibleBy400) return true;
        
        boolean isDivisibleBy4 = (ano % 4) == 0;
        boolean notDivisibleBy100 = (ano % 100) != 0;
        
        return isDivisibleBy4 && notDivisibleBy100;
    }
    
}
