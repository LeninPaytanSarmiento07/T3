class Camiseta extends Prenda implements GestionInventario {
    private String talla;
    private String color;
    private double precio;

    public Camiseta(String nombre, String talla, String color, double precio) {
        super(nombre);
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return "Camiseta " + nombre + " - Talla: " + talla + ", Color: " + color + ", Precio: " + precio + " Soles.";
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