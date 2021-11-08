public class EjemploMatricesIdentidad {
    /**SE LE CONOCE COMO MATRIZ IDENTIDAD O MATRIZ UNITARIA EN ÁLGEBRA LINEAL
    LLENAR UNA MATRIZ EN QUE LA DIAGONAL PRINCIPAL O DE AL MEDIO QUE SEPARA LA PARTE INFERIOR Y SUPERIOR DE LA MATRIZ ESTÉ CON 1 Y EL RESTO CON 0
    LA DIAGONAL PRINCIPAL ES JUSTO CUANDO COINCIDE QUE EL I = J */

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                } //NO ES NECESARIO UN else{} matriz[i][j] = 0, PORQUE POR DEFECTO COMO ES DEL TIPO INTEGER SE COMPLETA CON 0
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
