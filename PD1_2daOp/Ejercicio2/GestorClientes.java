import java.util.ArrayList;
import java.util.List;
public class GestorClientes {

    private List<String> clientes = new ArrayList<>();

    public GestorClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    public List<String> getClientes() {
        return clientes;
    }

    public void setClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    //static solo se utiliza cuando una variable o metodo pertenece a la clase en general
    //y no a un objeto en particular, o sea cuando no necesitas crear una instancia (con new) para utilizarlo
    //por eso se quitó el static de la funcion
    public void eliminarInactivos(List<String> clientes, List<String> inactivo) {
        clientes.removeAll(inactivo);

    }
    

}
