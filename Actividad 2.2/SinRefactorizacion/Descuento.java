public class Descuento {
    // método con la variable temporal (sin aplicar inline temp)
    public static boolean tieneDescuento(double montoCompra) {
        double precioBase = montoCompra; //variable local temporal

        /**
         * supongamos que aquí luego se aplicará extract method
         * o sea, se va a tomar este bloque y mandarlo a un método independiente
         */
        //double impuesto = precioBase * 0.16;
        //System.out.println("El impuesto añadido es: $" + impuesto);


        return precioBase > 1000; //es true si el monto de la compra es mayor a 1000
    }
 
    //si se aplica el extract method, el código queda forzosamente cargado de parámetros extras 
    //ya que las variables temporales limitan el alcance del código provocando dependencias
    public static void calcularYMostrarImpuesto(double precioBase) {
        double impuesto = precioBase * 0.16;
        System.out.println("El impuesto aniadido a la compra es: $" + impuesto);
    }
        
     

}


