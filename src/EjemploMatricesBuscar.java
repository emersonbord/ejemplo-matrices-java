public class EjemploMatricesBuscar {

    public static void main(String[] args) {
        int[][] matriz = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999},
        };
        int elementoBuscar = 15;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < matriz.length; i++){ //Para salirse de los 2 for utilizar etiqueta buscar, aí se sale de los 2 for
            for (j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + "," + j);
        }else{
            System.out.println(elementoBuscar +"No se encontró en la matriz");
        }
    }
}
