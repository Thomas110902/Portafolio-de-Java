import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int opcion;

        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println(" _____ _                               ");
        System.out.println("|_   _| |__    ___    _ __ ___    __ _ ___ ");
        System.out.println("  | | | '_  \\/ _  \\| '_ ` _ \\/ _` / __|");
        System.out.println("  | | | | | | |(_) | | | | |  | |(_|\\__\\");
        System.out.println("  |_| |_| |_|\\ ___/ | |_| |_ | \\__,_| __/");
        System.out.println("                                             ");
        
        System.out.println("Selecciona una opcion:");
        System.out.println(" Proyecto iniciado  ----> Mar 18 8:40 año 2025 ");
        System.out.println(" ");
        
        
        //Menu
            System.out.println("[1] La suma de 2 numeros");
            System.out.println("[2] ");
            System.out.println("[3]");
            System.out.println("[0] Salir");
            System.out.println("[?]");
             opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros es: " + suma);
                    
                    break;
            
                default:
                    break;
            }


            
        }while(opcion != 0);
    }
}