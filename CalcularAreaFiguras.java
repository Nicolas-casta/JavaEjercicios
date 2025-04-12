## Ejercicio 3
  import java.util.Scanner;

class CalcularAreaFiguras {
    public static int areaTriangulo(int base, int altura) {
        return (base * altura)/2;
    }
    
    public static int areaRectangulo(int base, int altura) {
        return  base * altura;
    }
    
    public static double areaCirculo(double radio) {
        double pi = 3.14159;
        return pi * radio * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("Seleccione la figura a la que quiere sacar el area: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        opcion = sc.nextInt();
        
        switch(opcion) {
            case 1:
                int base, altura;
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();
                double resultado = areaTriangulo(base, altura);
                System.out.println("El area del triangulo es: " + resultado);
                break;
                
            case 2:
                
                System.out.print("Ingrese la base: ");
                base = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                altura = sc.nextInt();
                resultado = areaRectangulo(base, altura);
                System.out.println("El area del rectangulo es: " + resultado);
                break;
            case 3:
                int radio;
                System.out.print("Ingrese el radio: ");
                radio = sc.nextInt();
                resultado = areaCirculo(radio);
                System.out.println("El area del circulo es: " + resultado);
                break;
        }
    }
}
