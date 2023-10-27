
/**
 *
 * @author Lenin
 */
class Zapato extends Prenda implements GestionInventario {
    private String talla;
    private String color;
    private double precio;
    private String material;

    public Zapato(String nombre, String talla, String color, double precio) {
        super(nombre);
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.material = material;
    }

    @Override
    public String descripcion() {
        return "Zapato " + nombre + " - Talla: " + talla + ", Color: " + color +
                ", Precio: " + ", El Material es: " + material + precio + " Soles.";
    }

    @Override
    public void agregarAlInventario() {
        // Implementación para agregar esta camiseta al inventario.
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}
