public class EstacionMeteorologica extends Dispositivo implements IMedible, IRegistrable {
    private double presion;
    private double velocidadViento;

    public EstacionMeteorologica(int id, String nombre, String fabricante, double consumoElectrico,
                                 double presion, double velocidadViento) {
        super(id, nombre, fabricante, consumoElectrico);
        this.presion = presion;
        this.velocidadViento = velocidadViento;
    }

    @Override
    public String medir() {
        return "Presión: " + presion + " hPa, Viento: " + velocidadViento + " km/h";
    }

    @Override
    public String registrar() {
        return "Registro guardado: condiciones climáticas actuales.";
    }

    @Override
    public String toString() {
        return "Tipo: EstacionMeteorologica | ID: " + getId() + " | Nombre: " + getNombre() +
                " | Fabricante: " + getFabricante() +
                " | Consumo: " + getConsumoElectrico() + "W | Presión: " + presion + " hPa | Viento: " + velocidadViento + " km/h";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Estacion Meteorologica ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.printf("Consumo eléctrico: %.2fW%n", getConsumoElectrico());
        System.out.println("Presión: " + presion + " hPa");
        System.out.println("Velocidad del viento: " + velocidadViento + " km/h");
        System.out.println("===============================");
    }
}
