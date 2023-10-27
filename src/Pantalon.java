class Pantalon extends Prenda implements GestionInventario {
    private String talla;
    private String color;
    private double precio;

    public Pantalon(String nombre, String talla, String color, double precio) {
        super(nombre);
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return "Pantalón " + nombre + " - Talla: " + talla + ", Color: " + color + ", Precio: " + precio + " Soles.";
    }

    @Override
    public void agregarAlInventario() {
        // Implementación para agregar este pantalón al inventario.
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}