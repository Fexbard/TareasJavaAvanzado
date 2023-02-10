package Item3;

public class Operaciones {
    double numero1;
    double numero2;
    public void Operaciones(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }
    public double suma(double num1,double num2){
        double suma = num1+num2;
         System.out.println("El resultado es " + suma);
        return suma;
    }
    public double multiplicacion(double num1,double num2){
        double multiplica = num1*num2;
        System.out.println("El resultado es " +multiplica);
        return  multiplica;
    }
    public double division(double num1,double num2){
        double divide = num1/num2;
        System.out.println("El resultado es " +divide);
        return divide;
    }


}
