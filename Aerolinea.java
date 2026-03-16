import java.util.Scanner;

public class Aerolinea {
    public static void main(String[] args) {
        // Matriz de 6 destinos y 3 horarios
        int vuelos[][] = new int[6][3];
        Scanner sc = new Scanner(System.in);
        
        // Llenado de la matriz con la cantidad de asientos
        for (int i = 0; i < 6; i++) {
            // Corrección: j < 3 y el incremento es j++
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la cantidad de asientos para el destino " + i + ", horario " + j + ":");
                vuelos[i][j] = sc.nextInt();
            }
        }
        
        // Declaración e inicialización de variables para las reservas
        String bandera = ""; 
        int destino, horario, asientos;
        
        // Inicio del sistema de reservas
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("\n--- NUEVA RESERVA ---");
            System.out.println("Ingrese el N° del destino (0-5): ");
            destino = sc.nextInt();
            System.out.println("Ingrese el horario del vuelo (0-2): ");
            horario = sc.nextInt();
            System.out.println("Ingrese la cantidad de asientos que desea reservar: ");
            asientos = sc.nextInt();

            // Validación para asegurar que los índices existan en la matriz
            if (destino >= 0 && destino < 6 && horario >= 0 && horario < 3) {
                if (vuelos[destino][horario] >= asientos) {
                    System.out.println("Su reserva fue realizada con éxito.");
                    // Actualización de asientos disponibles
                    vuelos[destino][horario] -= asientos; 
                } else {
                    // Corrección: Se agregó el punto faltante
                    System.out.println("Lo sentimos, no hay asientos disponibles.");
                }
            } else {
                System.out.println("Error: El destino o el horario ingresado no existe.");
            }
           
            System.out.println("\nSi desea seguir reservando ingrese cualquier valor. Si desea terminar escriba 'finish': ");
            bandera = sc.next();
        }
        
        System.out.println("Gracias por usar nuestro sistema de aerolínea.");
        sc.close(); // Siempre es buena práctica cerrar el Scanner al final
    }
}