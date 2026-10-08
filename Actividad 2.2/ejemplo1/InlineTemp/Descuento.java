public class Descuento {

    // Método refactorizado aplicando Inline Temp
    public static boolean tieneDescuento(double montoCompra) {

        //en este caso, la variable temporal precioBase se ha eliminado pues era
        //muy innecesario y no aportaba ni quitaba claridad al codigo, por lo tanto, se hizo directamente
        return montoCompra > 1000;
    }

    public static void calcularYMostrarImpuesto(double montoCompra) {
        double impuesto = montoCompra * 0.16;
        System.out.println("el impuesto aniadido a la compra es: $" + impuesto);
    }
}