/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        int largestNum = Integer.MIN_VALUE;
        while(counter < 3) {
            System.out.print("Ingrese el " + (counter + 1) + " er numero: ");
            int currentNum = Integer.parseInt(input.nextLine());
            if( currentNum > largestNum ) largestNum = currentNum;
            counter++;
        }
        System.out.println("El mayor numero es: " + largestNum);
    }
    
}
