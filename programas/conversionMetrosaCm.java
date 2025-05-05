package programas;

import java.util.Scanner;

public class conversionMetrosaCm {

    public static void metros(){
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingresa la medida en metros : ");
        double num1 = numeros.nextDouble();

        double operacion = num1 * 100 ;

        System.out.println("En centimetros es : " + operacion);
    }
}