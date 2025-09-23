/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int age = Integer.parseInt(input.nextLine());
        lifeStage(age);
    }
    
    public static void lifeStage( int age ) {
        if(age < 12 && age > -1) {
            System.out.println("Es un Niño"); 
        } else if( age > 11 && age < 18 ) {
            System.out.println("Es un Adolecente"); 
        } else if( age > 17 && age < 60 ) {
            System.out.println("Es un Adulto"); 
        } else if( age > 59) {
            System.out.println("Es un Adulto Mayor"); 
        } else {
            System.out.println("Ingrese u numero mayor a -1"); 
        }
        
    }
    
}
