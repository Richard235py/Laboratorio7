package modelo;

public class Operaciones {
    private int a;
    private int b;
    private double calculo;
   
    public void sumar(){
        calculo = a + b;
    }
    public void multiplicar(){
        calculo = a*b;
    }
     public void dividir(){
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        calculo = (double) a / b;
    }

    public double getCalculo(){
        return this.calculo;
    }

    public void setOperador1(int a) {
        this.a = a;
    }

    public void setOperador2(int b) {
        this.b = b;
    }

}
