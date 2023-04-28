package Sesion15a18;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Excepciones {
    public static void main(String[] args) {

        // Ejemplo de ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // Se genera una excepción al intentar dividir entre cero
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");
        }

        // Ejemplo de ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[6];
            int x = arr[8]; // Se genera una excepción al intentar acceder a un índice fuera de los límites del array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice especificado está fuera de los límites del array.");
        }

        // Ejemplo de FileNotFoundException
        try {
            File file = new File("archivo_que_no_existe.txt");
            FileReader fr = new FileReader(file); // Se genera una excepción al intentar acceder a un archivo que no existe
        } catch (FileNotFoundException e) {
            System.out.println("El archivo especificado no existe.");
        }
    }
}