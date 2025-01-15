/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado,
 * área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios y generar
 * el valor correspondiente. Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo
 * ;3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio2_Areas {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base = 0, altura = 0, lado = 0;
        int tipodearea;
        System.out.println("Seleccione el area de la figura (1. Cuadrado, 2. Rectangulo, 3. Triagulo): ");
        tipodearea = tcl.nextInt();

        switch (tipodearea) {
            case 1: {
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = tcl.nextDouble();
                System.out.println("El area del cuadrado es: " + obtenerAreaCuadrado(lado));
                break;
            }
            case 2: {
                System.out.print("Ingrese la base del rectangulo: ");
                base = tcl.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                altura = tcl.nextDouble();
                System.out.println("El area del rectangulo es: " + obtenerAreaRectangulo(base, altura));
                break;
            }
            case 3: {
                System.out.print("Ingrese la base del triangulo: ");
                base = tcl.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                altura = tcl.nextDouble();
                System.out.print("El area del triangulo es: " + obtenerAreaTriangulo(base, altura));
                break;
            }
            default:
                System.out.println("Opcion no valida.");
        }

    }

    public static double obtenerAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double obtenerAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double obtenerAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
/***
 * Run
Seleccione el area de la figura (1. Cuadrado, 2. Rectangulo, 3. Triagulo): 
1
Ingrese el lado del cuadrado: 4
El area del cuadrado es: 16.0

Seleccione el area de la figura (1. Cuadrado, 2. Rectangulo, 3. Triagulo): 
2
Ingrese la base del rectangulo: 5
Ingrese la altura del rectangulo: 10
El area del rectangulo es: 50.0
 
Seleccione el area de la figura (1. Cuadrado, 2. Rectangulo, 3. Triagulo): 
3
Ingrese la base del triangulo: 6
Ingrese la altura del triangulo: 15
El area del triangulo es: 45.0
 */
