public class EjemplomatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe","Pedro"}, {"Juan","Diego"}, {"Lucas","Pancha"}};

        System.out.println("Iterando con foreach: ");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
