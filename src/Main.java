import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Prenda> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar una camiseta");
            System.out.println("2. Agregar un pantalón");
            System.out.println("3. Agregar un zapato");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la camiseta: ");
                    String nombreCamiseta = scanner.nextLine();
                    System.out.print("Talla: ");
                    String tallaCamiseta = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorCamiseta = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioCamiseta = scanner.nextDouble();

                    Camiseta camiseta = new Camiseta(nombreCamiseta, tallaCamiseta, colorCamiseta, precioCamiseta);
                    inventario.add(camiseta);
                    break;
                case 2:
                    System.out.print("Nombre del pantalón: ");
                    String nombrePantalon = scanner.nextLine();
                    System.out.print("Talla: ");
                    String tallaPantalon = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorPantalon = scanner.nextLine();
                    System.out.print("Precio: ");
                       double precioPantalon = scanner.nextDouble();

                    Pantalon pantalon = new Pantalon(nombrePantalon, tallaPantalon, colorPantalon, precioPantalon);
                    inventario.add(pantalon);
                    break;
                case 3:
                    System.out.print("Nombre del zapato: ");
                    String nombreZapato = scanner.nextLine();
                    System.out.print("Talla: ");
                    String tallaZapato = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorZapato = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioZapato = scanner.nextDouble();

                    Zapato zapato = new Zapato(nombreZapato, tallaZapato, colorZapato, precioZapato);
                    inventario.add(zapato);

                    break;
                case 4:
                    mostrarInventario(inventario);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void mostrarInventario(List<Prenda> inventario) {
        System.out.println("Inventario de prendas:");
        for (Prenda prenda : inventario) {
            System.out.println(prenda.descripcion());
        }
    }
}








