package agus.coderhouse.jpa.entity;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Agustina", "123456789");

        // Crear producto
        Producto producto = new Producto("Zapatos", 100);

        // Crear venta
        Venta venta = new Venta(cliente, producto, 1);

        // Mostrar información
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad vendida: " + venta.getCantidad());
        System.out.println("Total: " + venta.calcularTotal());
    }
}
