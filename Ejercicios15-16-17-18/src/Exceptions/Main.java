package Exceptions;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner division = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = division.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = division.nextInt();

        try {
            int resultado = DividePorCero(a, b);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse, corrija el error " + e.getMessage());
        } finally {
            System.out.println("Aquí va el contenido del Finally");
        }
// Ejercicio de ArrayIndexOutOfBounds

        int[] elements = {1, 2, 3, 4, 5, 6,};
        try {
            System.out.println("La suma total de su deuda es: " + lectorArray(elements));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lector de Array " + e.getClass() + e.getMessage());
        }

// Ejercicio de FileNotFound
        try {
            String data = "file.dat";
            FileInputStream inData = new FileInputStream(data);
        } catch (FileNotFoundException fne) {
            System.out.println(fne.getMessage()+ fne.getClass());

        }
    }
        public static int DividePorCero ( int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static int lectorArray ( int[] elements) throws ArrayIndexOutOfBoundsException {
            int suma = elements[1] + elements[9];
            return suma;
        }

}