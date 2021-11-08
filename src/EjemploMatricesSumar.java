public class EjemploMatricesSumar {

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
        int[][] b = {{10,20,30}, {40,50,60}, {70,80,90}};

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b[i].length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println(ANSI_RED +"La suma de la matriz a + b es: " + ANSI_RESET);
        for (int i = 0; i < suma.length; i++){
            for (int j = 0; j < suma[i].length; j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
