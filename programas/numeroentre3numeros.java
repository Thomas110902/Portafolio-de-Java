package programas;

import java.util.Scanner;

public class numeroentre3numeros {

    public static void numeros3(){

        Scanner numeros = new Scanner(System.in);

    
        System.out.print("Ingresa el primer número: ");
        int num1 = numeros.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = numeros.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = numeros.nextInt();

        // Comparaciones usando if para ordenar de mayor a menor
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }

    }
}