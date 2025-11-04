import java.util.*;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Listar dispositivos");
        System.out.println("2. Buscar por ID");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Ordenar por consumo eléctrico");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        return sc.nextInt();
    }

    public int solicitarID() {
        System.out.print("\nIngrese el ID: ");
        return sc.nextInt();
    }

    public String solicitarNombre() {
        System.out.print("\nIngrese el nombre: ");
        sc.nextLine(); 
        return sc.nextLine();
    }

    public void mostrarDispositivos(List<Dispositivo> lista) {
        lista.forEach(System.out::println);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEncabezado() {
        System.out.println("\n=== Sistema de Agrotecnología ===");
    }
}
