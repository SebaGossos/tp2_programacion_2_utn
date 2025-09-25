package tp_unidad_2_programacion_2;

import java.util.Scanner;

public class ej9 {
    
    final static double INT_PRICE_PER_KG = 10.0, NAT_PRICE_PER_KG = 5.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double price = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        double weight = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional): ");
        String area = input.nextLine().toLowerCase();
        while(!(area.equalsIgnoreCase("nacional") || area.equalsIgnoreCase("internacional"))) {
            System.out.println("Ingrese la zona de envio correctamente (Nacional/Internacional): ");
            System.out.println(area == "nacional"  + "  " + area);
            area = input.nextLine().toLowerCase();
        }
        
        double cost = calcularCostoEnvio(weight, area);
        calcularTotalCompra(price, cost);
        
        
    }
    
    public static double calcularCostoEnvio( double weight, String area ) {
        return switch(area) {
            case "nacional" -> weight * NAT_PRICE_PER_KG;
            case "internacional" -> weight * INT_PRICE_PER_KG;
            default -> 0.0;
        };
    }
    
    public static void calcularTotalCompra( double price, double cost ) {
        System.out.println("El costo del envío es:" + cost);
        System.out.println("El total a pagar es: " + (price + cost));
    }
    
}
