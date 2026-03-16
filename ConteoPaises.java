public class ConteoPaises {
    public static void main(String[] args) {
        String[][] paisesEuropa = {
            {"España", "Francia", "Alemania"},
            {"Italia", "", "Portugal"},
            {"Suiza", "Bélgica", ""}
        };

        int contadorPaises = 0;

        System.out.println("--- Países Europeos Ingresados ---");
        for (int i = 0; i < paisesEuropa.length; i++) {
            for (int j = 0; j < paisesEuropa[i].length; j++) {
                if (paisesEuropa[i][j] != null && !paisesEuropa[i][j].isEmpty()) {
                    System.out.println("- " + paisesEuropa[i][j]);
                    contadorPaises++;
                }
            }
        }

        System.out.println("\nTotal de países ingresados: " + contadorPaises);
    }
}