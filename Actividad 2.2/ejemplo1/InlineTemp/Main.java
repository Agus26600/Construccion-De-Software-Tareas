import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el monto de la compra: ");
        double monto = scanner.nextDouble();

        boolean resultado = Descuento.tieneDescuento(monto);

        System.out.println("tiene descuento el pedido? " + resultado);

        scanner.close();
    }
}