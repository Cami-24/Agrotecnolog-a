import java.util.Objects;

public abstract class Dispositivo implements Comparable<Dispositivo> {
    private int id;
    private String nombre;
    private String fabricante;
    private double consumoElectrico;

    public Dispositivo(int id, String nombre, String fabricante, double consumoElectrico) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.consumoElectrico = consumoElectrico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(double consumo) {
        this.consumoElectrico = consumo;
    }

    @Override
    public int compareTo(Dispositivo otro) {
        return Double.compare(this.consumoElectrico, otro.consumoElectrico);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Fabricante: " + fabricante + 
               ", Consumo: " + consumoElectrico + "W";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dispositivo)) return false;
        Dispositivo otro = (Dispositivo) obj;
        return this.id == otro.id;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Nuevo método abstracto que obliga a las subclases a mostrar su estado completo
    public abstract void mostrarDetalles();
}
