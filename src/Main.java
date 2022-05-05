import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("introduzca dos numeros:");

        Scanner sc = new Scanner(System.in);
        int respuesta1 = sc.nextInt();
        sc = new Scanner(System.in);
        int respuesta2 = sc.nextInt();

        ImplementarPila.crear();
        System.out.println(ImplementarPila.impresion());
        ImplementarPila.push(respuesta1);
        ImplementarPila.push(respuesta2);
        System.out.println(ImplementarPila.impresion());


    }
}
