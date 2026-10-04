public class MainFigura {
    public static void main(String[] args){
        ProcesadorFigura procesador = new ProcesadorFigura();
        Figura triangulo = new Triangulo(4, 5);
  
        procesador.imprimirArea(triangulo);

        //casteo para cambiar valores ya que los metodos de acceso no son de la interfaz
        //por eso la clase concreta debe tener gets y sets
        ((Triangulo) triangulo).setAltura(4);
        ((Triangulo) triangulo).setBase(5);

        procesador.imprimirArea(triangulo);

        Figura rectangulo = new Rectangulo(4, 5);
        procesador.imprimirArea(rectangulo);

    }

}
