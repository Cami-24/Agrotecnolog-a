public class DronMonitoreo extends Dispositivo implements IAccionable, IMedible, IRegistrable {
    private String resolucionCamara;

    public DronMonitoreo(int id, String nombre, String fabricante, double consumoElectrico, String resolucionCamara) {
        super(id, nombre, fabricante, consumoElectrico);
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public String accionar() {
        return getNombre() + " está capturando imágenes con cámara " + resolucionCamara;
    }

    @Override
    public String medir() {
        double medicion = Math.random() * 100;
        return "Nivel de luz detectado: " + String.format("%.2f", medicion) + "%";
    }

    @Override
    public String registrar() {
        return "Registro del DronMonitoreo " + getNombre() + " almacenado exitosamente.";
    }

    @Override
    public String toString() {
        return "Tipo: DronMonitoreo | ID: " + getId() + " | Nombre: " + getNombre() +
                " | Fabricante: " + getFabricante() +
                " | Consumo: " + getConsumoElectrico() + "W | Resolución: " + resolucionCamara;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Dron de Monitoreo ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.printf("Consumo eléctrico: %.2fW%n", getConsumoElectrico());
        System.out.println("Resolución de cámara: " + resolucionCamara);
        System.out.println("=========================");
    }
}
