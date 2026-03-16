public class TableroAjedrez {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        char[] columnas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                tablero[i][j] = "" + columnas[j] + (8 - i);
            }
        }

        // Imprimir el tablero
        System.out.println("--- Tablero de Ajedrez ---");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }
    }
}