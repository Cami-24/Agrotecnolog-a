public class DronRiego extends Dispositivo implements IAccionable, IRegistrable {
    private double capacidadTanque;

    public DronRiego(int id, String nombre, String fabricante, double consumoElectrico, double capacidadTanque) {
        super(id, nombre, fabricante, consumoElectrico);
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String accionar() {
        return getNombre() + " está realizando riego con tanque de " + capacidadTanque + " L";
    }

    @Override
    public String registrar() {
        return "Registro del DronRiego " + getNombre() + " completado correctamente.";
    }

    @Override
    public String toString() {
        return "Tipo: DronRiego | ID: " + getId() + " | Nombre: " + getNombre() +
                " | Fabricante: " + getFabricante() +
                " | Consumo: " + getConsumoElectrico() + "W | CapacidadTanque: " + capacidadTanque + " L";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Dron de Riego ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.printf("Consumo eléctrico: %.2fW%n", getConsumoElectrico());
        System.out.println("Capacidad del tanque: " + capacidadTanque + " L");
        System.out.println("=====================");
    }
}
