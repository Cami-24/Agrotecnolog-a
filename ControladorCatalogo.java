import java.util.ArrayList;
import java.util.Collections;

public class ControladorCatalogo {
    private ArrayList<Dispositivo> catalogo = new ArrayList<>();

    //equipos con sus características

    public void init() {
        catalogo.add(new DronRiego(1, "AquaDrone", "AgroTech", 25.5, 40));
        catalogo.add(new DronRiego(2, "IrrigaPro", "GreenCorp", 22.1, 35));
        catalogo.add(new DronMonitoreo(3, "SkyView", "AgroTech", 15.3, "4K"));
        catalogo.add(new DronMonitoreo(4, "AgroScan", "SkyFarm", 16.8, "HD"));
        catalogo.add(new SensorSuelo(5, "SoilSense", "EcoSensors", 5.4, 23, 62.0));
        catalogo.add(new SensorSuelo(6, "TerraWatch", "GreenCorp", 6.0, 28, 55.3));
        catalogo.add(new DronRiego(7, "HydroDrone", "FarmFly", 21.2, 50));
        catalogo.add(new DronMonitoreo(8, "CropEye", "SkyFarm", 14.9, "8K"));
        catalogo.add(new SensorSuelo(9, "EarthSense", "AgroTech", 4.8, 12, 70.0));
        catalogo.add(new SensorSuelo(10, "SoilPro", "FarmSensors", 5.1, 2, 65.5));
    }

    public void listarDispositivos() {
        for (Dispositivo d : catalogo) {
            d.mostrarDetalles();
            System.out.println();
        }
    }

    public void buscarPorId(int id) {
        for (Dispositivo d : catalogo) {
            if (d.getId() == id) {
                d.mostrarDetalles();
                return;
            }
        }
        System.out.println("No se encontró un dispositivo con ID: " + id);
    }

    public void buscarPorNombre(String nombre) {
        for (Dispositivo d : catalogo) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                d.mostrarDetalles();
                return;
            }
        }
        System.out.println("No se encontró un dispositivo con nombre: " + nombre);
    }

    public void ordenarPorConsumo() {
        Collections.sort(catalogo);
        System.out.println("Catálogo ordenado por consumo eléctrico (menor a mayor):");
        listarDispositivos();
    }

    public ArrayList<Dispositivo> getCatalogo() {
        return catalogo;
    }
}