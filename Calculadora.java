# JavaEjercicios
## Ejercicio 1
import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        
        //Se define la entrada y la variable numeros.
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        //Se pide al usuario que ingrese dos numeros.
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        
        //Se definen las operaciones.
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;
        
        //Se le muestra al usuario el resultado de las operaciones segun los numeros ingresados por el usuario.
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El modulo es: " + modulo);
    }
}
