/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej7 {
    
    final static int max = 10, min = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int note = 5;
       
        do {
            if(note > max || note < min) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
            System.out.print("Ingrese una nota (0-10): ");
            note = Integer.parseInt( input.nextLine() );
        } while (note > max || note < min);
        System.out.println("Nota guardada correctamente");
    }
    
}
