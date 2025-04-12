## Ejercicio 2
import java.util.Scanner;

class DatosUsuario {
    public static void main(String[] args) {

        //Definimos la entrada y las variables mombre, edad y correo.
        Scanner sc = new Scanner(System.in);
        String nombre, edad, correo;

         //Le pedimos al usuario que ingrese los datos.
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextLine();
        System.out.print("Ingrese su correo: ");
        correo = sc.nextLine();

        //Mostramos resultado de los datos ingresados al usuario.
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su correo es: " + correo);
        
    }
}
