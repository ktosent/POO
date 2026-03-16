import java.util.Random;

public class UniversidadMatrices {
    public static void main(String[] args) {
        
        int[][] ingresosPorHora = new int[1][24];
        Random random = new Random();

        int totalEstudiantes = 0;


        for (int hora = 0; hora < 24; hora++) {
            ingresosPorHora[0][hora] = random.nextInt(51); 
            totalEstudiantes += ingresosPorHora[0][hora];
        }

        double promedio = (double) totalEstudiantes / 24;

        System.out.println("--- Ingreso de Estudiantes: Universidad Matrices ---");
        for (int hora = 0; hora < 24; hora++) {
            System.out.printf("Hora %02d:00 -> %d estudiantes\n", hora, ingresosPorHora[0][hora]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Cantidad total de estudiantes en el día: " + totalEstudiantes);
        System.out.printf("Promedio de estudiantes por hora: %.2f\n", promedio);
    }
}