package programas;

import java.util.Scanner;

public class conversionKgaG {
    
        public static void gramos(){
            Scanner numeros = new Scanner(System.in);

        System.out.println("Ingresa la medida en kilogramos : ");
        double num1 = numeros.nextDouble();

        double operacion = num1 * 1000 ;

        System.out.println("En gramos es : " + operacion);
        }
    }