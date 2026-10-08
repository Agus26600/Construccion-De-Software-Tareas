public class Compra {

    public static double calcularTotal(double precio, int cantidad) {

        //en esta parte, descuento es una variable temporal que almacena  el subtotal por 0.10
        //pero no es necesario, pues podemos simplemente enviar el subtotal por 0.10 directamente en el return
        double subtotal = precio * cantidad;
        double descuento = subtotal * 0.10;
        
        return subtotal - descuento;
    }
}