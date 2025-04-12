## Ejercicio 3
  import java.util.Scanner;

class CalcularAreaFiguras {

  //Creamos metodo para sacar el area de un triangulo.
    public static int areaTriangulo(int base, int altura) {
        return (base * altura)/2;
    }

  //Creamos metodo para sacar el area de un rectangulo.
    public static int areaRectangulo(int base, int altura) {
        return  base * altura;
    }

  //Creamos metodo para sacar el area de un rectangulo.
    public static double areaCirculo(double radio) {
        double pi = 3.14159;
        return pi * radio * radio;
    }

  //Despues de crear los metodos, hacemos el metodo principal y definimos la entrada y la variable opcion.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

      //Hacemos las salidas donde indiquen al usuario que seleccione una figura.
        System.out.println("Seleccione la figura a la que quiere sacar el area: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        opcion = sc.nextInt();

      //Segun la opcion tomada por el usuario se le llevara al caso que eligio.
        switch(opcion) {

            //En el caso 1 se define la base y altura.
            case 1:
                int base, altura;

            //Se le pide al usuario que ingrese una base y altura.
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();

            //Se define resultado.
                double resultado = areaTriangulo(base, altura);

            //Se le muestra el resultado al usuario.
                System.out.println("El area del triangulo es: " + resultado);
                break;
                
            case 2:

            //Se le pide al usuario que ingrese una base y altura.
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();

            //Se define resultado
                resultado = areaRectangulo(base, altura);

            //Se le muestra el resultado al usuario.
                System.out.println("El area del rectangulo es: " + resultado);
                break;
            case 3:

            //Definimos radio.
                int radio;

            //Le pedimos al usuario que ingrese un radio.
                System.out.print("Ingrese el radio: ");
                radio = sc.nextInt();

            //Definimos resultado.
                resultado = areaCirculo(radio);

            //Se le muestra resultado al usuario.
                System.out.println("El area del circulo es: " + resultado);
                break;
        }
    }
}
