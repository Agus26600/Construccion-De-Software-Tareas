public class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override 
    public String toString() {
        return "triangulo";
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }


    //metodo añadido
    @Override 
    public String obtenerDetalle() {
        return "\nTriangulo con base: " + base + " y altura: " + altura;
    }

   

}
