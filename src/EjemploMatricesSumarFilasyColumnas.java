public class EjemploMatricesSumarFilasyColumnas {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sumaFila, sumaColumna;


        for (int i = 0; i < a.length; i++){
            sumaColumna = 0;
            sumaFila = 0;
            for (int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            System.out.println("Total fila " + i + " : " + sumaFila);
            System.out.println("Total columna " + i + " : " + sumaColumna);
        }
    }
}
