package programas;

import java.util.Scanner;

public class resta {
    
        public static void resta(){
            Scanner scannnumeros = new Scanner(System.in);

            System.out.print("Primer numero");
            double num1 = scannnumeros.nextDouble();

            System.out.print("Segundo numero");
            double num2 = scannnumeros.nextDouble();

            double sumar= num1 - num2 ;
            System.out.print("Resultado" + sumar);
        }
    }