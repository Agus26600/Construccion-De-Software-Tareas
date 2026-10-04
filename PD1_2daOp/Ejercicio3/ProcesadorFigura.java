public class ProcesadorFigura {
    public void imprimirArea(Figura figura) {
        //faltaba esa clausula de guarda 
        if (figura == null) {
            System.out.println("La figura proporcionada es nula.");
            return;
        }
        
        System.out.println(figura.obtenerDetalle());
        System.out.println("El área de la figura " + figura + " es: " + figura.calcularArea());
        
    }

}
