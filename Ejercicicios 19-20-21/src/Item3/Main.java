package Item3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija qué operación desea hacer, las operaciones disponibles son:");
        System.out.println("Suma(sum), multiplación(mul) y división(div)");
        String operation = scanner.nextLine();
        System.out.println("Ingrese los números");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();


        switch (operation) {
            case "sum":
                operaciones.suma(number1, number2);
        break;
        case "mul":
            operaciones.multiplicacion(number1, number2);
        break;
        case "div":
            operaciones.division(number1, number2);
        }

    }
}