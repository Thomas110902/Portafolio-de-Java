package programas;

import java.util.Scanner;

public class promedio {
        public static void promedio(){
            Scanner scannnumeros = new Scanner(System.in);

            System.out.print("Primer numero");
            double num1 = scannnumeros.nextDouble();

            System.out.print("Segundo numero");
            double num2 = scannnumeros.nextDouble();

            System.out.print("Tercer numero");
            double num3 = scannnumeros.nextDouble();

            double sumar= (num1 + num2 + num3) / 3;
            System.out.print("Resultado" + sumar);
        }
        
    }