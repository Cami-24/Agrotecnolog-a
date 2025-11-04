public class SensorSuelo extends Dispositivo implements IMedible {
    private double humedad;
    private double ph;

    public SensorSuelo(int id, String nombre, String fabricante, double consumoElectrico,
                       double humedad, double ph) {
        super(id, nombre, fabricante, consumoElectrico);
        this.humedad = humedad;
        this.ph = ph;
    }

    @Override
    public String medir() {
        return "Humedad: " + humedad + "%, ph: " + ph + "°C";
    }

    @Override
    public String toString() {
        return "Tipo: SensorSuelo | ID: " + getId() + " | Nombre: " + getNombre() + " | Fabricante: " + getFabricante() +
                " | Consumo: " + getConsumoElectrico() + "W | Humedad: " + humedad + "% | pH: " + ph;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== SensorSuelo ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.printf("consumoElectrico: %.2fW%n", getConsumoElectrico());
        System.out.println("Humedad: " + humedad + "%");
        System.out.println("ph: " + ph + "°C");
        System.out.println("===================");
    }
}
