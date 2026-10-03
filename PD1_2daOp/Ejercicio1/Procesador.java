import java.util.ArrayList;
import java.util.List;


public class Procesador {
    private List<Integer> listaDatos = new ArrayList<>();

    public Procesador(List<Integer> listaDatos) {
        this.listaDatos = listaDatos;
    }

    public List<Integer> getListaDatos() {
        return listaDatos;
    }

    public void setListaDatos(List<Integer> listaDatos) {
        this.listaDatos = listaDatos;
    }

    //ya no es static porque se debe de instanciar un objeto para usar la funcion
    public void procesar(List<Integer> listaDatos) {
        int suma = 0;
        for (int i = 0; i < listaDatos.size(); i++) {
            if (listaDatos.get(i) < 0){
                System.out.println("El valor "  + listaDatos.get(i) + " es negativo, se omite");
                continue;
            }
            suma += listaDatos.get(i);
            i++;     
            
        }
        System.out.println("La suma de los valores positivos es: " + suma);
    }


}
