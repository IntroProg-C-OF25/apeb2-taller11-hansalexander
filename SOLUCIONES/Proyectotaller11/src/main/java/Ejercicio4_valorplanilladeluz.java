/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien
 * inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2%
 * del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio.
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @author hansa
 */
import java.util.Scanner;

public class Ejercicio4_valorplanilladeluz {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreCliente, cedulaCliente;
        int opcion;
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = tcl.nextLine();
        System.out.print("Ingrese la cedula del cliente: ");
        cedulaCliente = tcl.nextLine();
        System.out.println("Elija una opcion:");
        System.out.print("1.Calcular valor de la planilla de luz, 2.Calcular valor del predio del bien inmueble: ");

        opcion = tcl.nextInt();
        tcl.nextLine();
        switch (opcion) {
            case 1: {
                calcularValorluz(nombreCliente, cedulaCliente);
                break;
            }
            case 2: {
                calcularValorPredio(nombreCliente, cedulaCliente);
                break;
            }
            default:
                System.out.print("Opcion no valida");
        }

    }

    public static void calcularValorluz(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        double valorkilovatio, numkilovatios, totalLuz;
        System.out.print("Ingrese el valor del kilovatio ($): ");
        valorkilovatio = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        numkilovatios = tcl.nextDouble();

        totalLuz = valorkilovatio * numkilovatios;
        System.out.println("Cliente " + nombreCliente + " con cedula " + cedulaCliente + " debe cancelar el valor de $" + totalLuz);
    }

    public static void calcularValorPredio(String nombreCliente, String cedulaCliente) {
        Scanner tcl = new Scanner(System.in);
        double valorinmueble, valorpredio;
        System.out.print("Ingrese el valor del inmueble ($): ");
        valorinmueble = tcl.nextDouble();
        valorpredio = valorinmueble * 0.02;

        System.out.println("Cliente " + nombreCliente + " con cedula " + cedulaCliente + " tiene un bien inmueble valorado en $"
                + valorinmueble + " y tiene que pagar de predio $" + valorpredio);
    }
}
/***
 * Run
Ingrese el nombre del cliente: Dario
Ingrese la cedula del cliente: 1105776250
Elija una opcion:
1.Calcular valor de la planilla de luz, 2.Calcular valor del predio del bien inmueble: 2
Ingrese el valor del inmueble ($): 30000
Cliente Dario con cedula 1105776250 tiene un bien inmueble valorado en $30000.0 y tiene que pagar de predio $600.0
 */