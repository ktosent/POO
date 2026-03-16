public class GuerraNavalConBarcos {
    public static void main(String[] args) {

        char[][] tableroNaval = new char[10][10];

        for (int i = 0; i < tableroNaval.length; i++) {
            for (int j = 0; j < tableroNaval[i].length; j++) {
                tableroNaval[i][j] = '~';
            }
        }
        for (int j = 2; j <= 5; j++) {
            tableroNaval[1][j] = 'B';
        }

        for (int i = 4; i <= 6; i++) {
            tableroNaval[i][7] = 'B';
        }

        tableroNaval[8][2] = 'B';
        tableroNaval[8][3] = 'B';

        System.out.println("--- Tablero de Guerra Naval ---");
        
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");
        System.out.println();

        char letraFila = 'A';
        for (int i = 0; i < tableroNaval.length; i++) {
            System.out.print(letraFila + " "); // Letra de la fila
            
            for (int j = 0; j < tableroNaval[i].length; j++) {
                System.out.print(tableroNaval[i][j] + " "); // Agua o Barco
            }
            System.out.println(); 
        }
    }
}
