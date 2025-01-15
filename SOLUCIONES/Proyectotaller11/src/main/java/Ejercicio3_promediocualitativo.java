/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9
 * el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un método principal.
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio3_promediocualitativo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, num2, num3, num4, promedioT;
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        num3 = tcl.nextDouble();
        System.out.print("Ingrese el cuarto numero: ");
        num4 = tcl.nextDouble();
        promedioT = (num1 + num2 + num3 + num4) / 4;
        String promedioCualitativo = obtenerPromedioCualitativo(num1, num2, num3, num4);
        System.out.println("El promedio obtenido es: " + promedioT);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    public static String obtenerPromedioCualitativo(double num1, double num2, double num3, double num4) {
        double promedio = (num1 + num2 + num3 + num4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}
/**
 * *
 * Run 
Ingrese el segundo numero: 7
Ingrese el tercer numero: 9
Ingrese el cuarto numero: 10
El promedio obtenido es: 7.75
El promedio cualitativo es: Bueno
 */