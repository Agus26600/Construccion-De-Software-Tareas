public class Compra {

    public static double calcularTotal(double precio, int cantidad) {

        //aplicando el principio de inline temp, eliminamos la variable temporal descuento y
        //hacemos el calculo directamente en el return como se dijo
        double subtotal = precio * cantidad;

        return subtotal - (subtotal * 0.10);
    }
}