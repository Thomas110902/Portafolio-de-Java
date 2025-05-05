import java.util.Scanner;

import vistas.vista;

public class Main {

    public static void main(String[] args){
        int opcion;

        do{
            
            
            vistas.vista.banner();        Scanner scanner = new Scanner(System.in);
        
        //Menu
        programas.opciones.opciones();
            System.out.println("[0] Salir");
            System.out.println("[?]");
             opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                    System.out.println("------------------");
                    programas.sumar.suma();
                    break;
                case 2:
                    System.out.println("----------------");
                    programas.resta.resta();
                    break;
                    case 3:
                    System.out.println("----------------");
                    programas.multiplicacion.multi();
                        break;
                    case 4:
                        System.out.println("----------------");
                        programas.division.division();
                        break;
                    case 5:
                        System.out.println("----------------");
                        programas.modulo.modulo();
                        break;
                    case 6:
                        System.out.println("----------------");
                        programas.promedio.promedio();
                        break;
                    case 7:
                        System.out.println("----------------");
                        programas.numeroentre2numeros.Mayorymenor2();
    
                        break;
                    case 8:
                        System.out.println("----------------");
                        programas.numeroentre3numeros.numeros3();
    
                        break;
                    case 9:
                        System.out.println("----------------");
                        programas.conversionMetrosaCm.metros();
                        break;
                    case 10:
                        System.out.println("----------------");
                        programas.conversionKgaG.gramos();
                        break;
                default:
                    break;
            }


            
        }while(opcion != 0);
    }
}