package programas;

public class opciones {
    static String lista[] = {
        "Suma de dos numeros",
        "Resta de dos numeros",
        "Multiplicacion de dos numeros",
        "Division de dos numeros",
        "Modulo (Residuo de la division)",
        "Promedio de 3 numeros",
        "Numero mayor y menor entre 2 numeros",
        "Numero mayor y menor entre 3 numeros",
        "Conversion de metros a centimetros",
        "Conversion de kilogramos a gramos",

    };

    //Mostrar metodo
    public static void opciones(){
        for(int i = 0 ; i < lista.length ; i++ ){

            System.out.println("["+ (i+1) +"]" +lista[i]);
        }
    }
    
}