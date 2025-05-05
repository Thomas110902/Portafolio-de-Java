package programas;

import java.util.Scanner;

public class numeroentre2numeros {
        public static void Mayorymenor2(){

            Scanner scannnumeros = new Scanner(System.in);

            System.out.print("Primer numero");
            int num1 = scannnumeros.nextInt();

            System.out.print("Segundo numero");
            int num2 = scannnumeros.nextInt();

            if (num1 > num2 ) {
                System.out.println("Es mayor " + num1 + "que " + num2);

                
            }else {
                System.out.println("Es mayor " + num2 + "que" + num1);
            }




        }
        
    }