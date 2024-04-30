import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamano = sc.nextInt();

        int[] arreglo = crearArregloConValores(sc, tamano);

        System.out.println("Arreglo creado con los siguientes valores:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static int[] crearArregloConValores(Scanner sc, int tamano) {
        int[] arreglo = new int[tamano];
        System.out.println("Ingrese los valores del arreglo:");

        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        return arreglo;
    }
}