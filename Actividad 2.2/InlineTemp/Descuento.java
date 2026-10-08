public class Descuento {
    // Método refactorizado aplicando Inline Temp
    public static boolean tieneDescuento(double montoCompra) {

        return montoCompra > 1000;
    }

    public static void calcularYMostrarImpuesto(double montoCompra) {
        double impuesto = montoCompra * 0.16;
        System.out.println("El impuesto aniadido a la compra es: $" + impuesto);
    }
}
