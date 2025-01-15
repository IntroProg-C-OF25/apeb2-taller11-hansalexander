/**
 *Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 *El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal 
 *(quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio1_procesodearreglo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limitefi = 0, limiteco = 0;
        System.out.print("Dame el limite de las filas y el limite de las columnas:  ");
        limitefi = tcl.nextInt();
        limiteco = tcl.nextInt();
        int matriz[][] = new int[limitefi][limiteco];
        generarMatriz(matriz);
        System.out.println("Matriz generada: ");
        System.out.println("");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        System.out.println("");
        presentarPromediosMatriz(matriz);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }

    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("Elementos pares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
        System.out.println("Elementos impares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
    }

    public static void presentarPromediosMatriz(int matriz[][]) {
        int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("Promedio Matriz: " + promedioMatriz);
    }
}
/***
 * Run
Dame el limite de las filas y el limite de las columnas:  3 3 
Matriz generada: 

8 2 9 
8 2 9 
7 9 9 
Elementos pares de la matriz
8 2 
8 2 

Elementos impares de la matriz
9 
9 
7 9 9 

Promedio Matriz: 7
 */