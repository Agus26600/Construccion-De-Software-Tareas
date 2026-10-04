 ///pienso que una interfaz en este caso es buena opcion ya que se pueden crear distintos tipos 
 // de figura (ya que cada una tiene diferentes parametros y dimensiones), 
 // si fuera solo una clase abstracta (padre), y la concreta(hija) heredara una base y altura 
 // todas las demas figuras estarian obligadas a tener esos mismos parametros.
 //Con este enfoque, incluso se podrian crear figuras como circulo, hexagono etc 
 public interface Figura {
    double calcularArea();
    String obtenerDetalle();
}
