public class Compra {

    public static double calcularTotal(double precio, int cantidad) {
        
        //aplicando el principio de inline temp, eliminamos la variable temporal descuento
        double subtotal = precio * cantidad;

        return subtotal - (subtotal * 0.10);
    }
}