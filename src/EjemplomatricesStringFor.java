public class EjemplomatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";  //Inicializar
        nombres[0][1] = "Pedro";
        nombres[1][0] = "Juan";
        nombres[1][1] = "Diego"; //Si comento a diego, el valor por defecto es null
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){ //Para acceder a la fila nombres[i].length; --- es el índice de la fila del for de arriba
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();//Salto de línea
        System.out.println("Iterando con foreach: ");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
