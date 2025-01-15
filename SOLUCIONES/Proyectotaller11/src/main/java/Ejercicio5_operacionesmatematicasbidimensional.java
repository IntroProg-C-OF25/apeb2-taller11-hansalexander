/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio5_operacionesmatematicasbidimensional {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamanio de las matrices: ");
        n = tcl.nextInt();
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        generarMatriz(matriz1);
        generarMatriz(matriz2);

        System.out.println("Matriz 1:");
        PresentarMatriz(matriz1);
        System.out.println("Matriz 2: ");
        PresentarMatriz(matriz2);
        System.out.println("Suma de matrices:");
        PresentarMatriz(sumaMatrices(matriz1, matriz2));
        System.out.println("Resta de matrices:");
        PresentarMatriz(restaMatrices(matriz1, matriz2));
        System.out.println("Multiplicacion de matrices:");
        PresentarMatriz(multiplicacionMatrices(matriz1, matriz2));
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }

    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] restaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicacionMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < matriz1.length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void PresentarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
/***
 * Run
Ingrese el tamanio de las matrices: 3
Matriz 1:
5	1	3	
1	8	7	
5	1	3	
Matriz 2: 
3	7	0	
6	4	4	
6	4	4	
Suma de matrices:
8	8	3	
7	12	11	
11	5	7	
Resta de matrices:
2	-6	3	
-5	4	3	
-1	-3	-1	
Multiplicacion de matrices:
39	51	16	
93	67	60	
39	51	16	
 */
