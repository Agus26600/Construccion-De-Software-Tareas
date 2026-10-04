import java.util.ArrayList;
import java.util.List;

public class MainGestorClientes {
    
    public static void main(String[] args){

        List<String> listaClientes = new ArrayList<>();
        listaClientes.add("Juan");
        listaClientes.add("Pedro");
        GestorClientes gestor = new GestorClientes(listaClientes);
        List<String> listaInactivos = new ArrayList<>();
        listaInactivos.add("Pedro");
        gestor.eliminarInactivos(listaClientes, listaInactivos);
        System.out.println("Clientes activos: " + gestor.getClientes());


      
    }


}
