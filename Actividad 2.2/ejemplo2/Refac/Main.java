import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        double total = Compra.calcularTotal(precio, cantidad);

        System.out.println("total de la compra: $" + total);

        scanner.close();
    }
}