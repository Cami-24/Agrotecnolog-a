import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ControladorCatalogo controlador = new ControladorCatalogo();
        controlador.init();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            vista.mostrarEncabezado();
            System.out.println("1. Listar todos los dispositivos");
            System.out.println("2. Buscar dispositivo por ID");
            System.out.println("3. Buscar dispositivo por nombre");
            System.out.println("4. Ordenar por consumo eléctrico");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> controlador.listarDispositivos();
                case 2 -> {
                    System.out.print("Ingrese el ID: ");
                    int id = sc.nextInt();
                    controlador.buscarPorId(id);
                }
                case 3 -> {
                    System.out.print("Ingrese el nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    controlador.buscarPorNombre(nombre);
                }
                case 4 -> controlador.ordenarPorConsumo();
                case 0 -> vista.mostrarMensaje("Saliendo del sistema...");
                default -> vista.mostrarMensaje("Opción inválida.");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }
}
