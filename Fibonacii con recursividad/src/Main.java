import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        for (int i = 0; i < limite; i++) {
            System.out.print(Ejercicios.funcionFibonacci(i) + ", ");
        }
    }
}