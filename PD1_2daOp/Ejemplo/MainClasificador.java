import java.util.Scanner;

public class MainClasificador {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el turno (Manana o Tarde), por favor ingresar la primera letra en mayuscula:");
        String turno = scanner.nextLine(); 
        System.out.println("Ingrese el numero del dia (1-7):");
        int numeroDia = scanner.nextInt();

    
        
        ClasificadorDia clasificador = new ClasificadorDia(turno, numeroDia);
        System.out.println(clasificador);
        String tipoDia = ClasificadorDia.clasificarDiaSemana(clasificador.getNumeroDia());
        System.out.println(tipoDia);
        boolean esManana = ClasificadorDia.esTurnoManana(clasificador.getTurno());
        System.out.println(esManana);

        scanner.close();
    }


}
