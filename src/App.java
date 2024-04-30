import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tamano = metodo1(sc);
        int[] arreglo = metodo2(sc, tamano);
        metodo3();
        metodo4(arreglo);
        metodo3();
        metodo5(arreglo);
    }

    public static int metodo1(Scanner sc) {
        while (true) {
            try {
                System.out.println("Dijite el tamano del arreglo: ");
                int tam = sc.nextInt();
                if (tam <= 14 && tam >= 1) {
                    return tam;
                } else {
                    System.out.println("Dijite un um de 0 a 14");
                }
            } catch (InputMismatchException e) {
                System.out.println("Dijite num entero");
                sc.nextLine();
            }
        }
    }

    public static int[] metodo2(Scanner sc, int x) {
        int[] arreglo = new int[x];
        while (true) {
            try {
                for (int i = 0; i < x; i++) {
                    System.out.println("Dijite el valor del valor: " + (i + 1));
                    arreglo[i] = sc.nextInt();
                }
                return arreglo;
            } catch (InputMismatchException e) {
                System.out.println("Dijite un valor entero porfavor.");
                sc.nextLine();
            }
        }
    }

    public static void metodo3() {
        System.out.println("--------------------------------");
    }

    public static void metodo4(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "");
        }

    }

    public static void metodo5(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println(x[i] + "");
        }
    }
}
