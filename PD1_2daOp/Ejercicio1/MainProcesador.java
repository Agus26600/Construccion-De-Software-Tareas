import java.util.ArrayList;
import java.util.List;

public class MainProcesador {
    public static void main(String[] args) {
        int[] datos = {5, 10, -3, 8};
        List<Integer> listaDatos = new ArrayList<>();
        for (int dato : datos) {
            listaDatos.add(dato);
        }
        Procesador procesador = new Procesador(listaDatos);
        procesador.procesar(procesador.getListaDatos());
    }

}
