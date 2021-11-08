public class EjemploMatricesTransponerMatriz {

    public static void main(String[] args) {

        int[][] a,b;

        a = new int[8][4];//Instanciamos el arreglo
        b = new int[4][8];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = i+j*3;//Accedemos a cada posición de fila y columna [i][j] y la llenamos con datos i+j*3
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                b[j][i] = a[i][j]; //[j][i] al reves porque damos vueltas las filas en las columnas y las columnas en las filas, eso será igual a a[i][j] valor de cada fila y columna de la matriz a... el ij de a se lo asignamos en la posicion j i de b, lo damos vuelta
            }
        }

        System.out.println("La matriz trnaspuestab: ");
        for (int i = 0; i<b.length; i++){
            for (int j = 0; j < b[i].length; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
