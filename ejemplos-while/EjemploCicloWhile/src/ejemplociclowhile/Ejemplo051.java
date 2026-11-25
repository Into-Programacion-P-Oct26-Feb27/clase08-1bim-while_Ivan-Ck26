/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 3;
        int contador = 1;
        double suma_total = 0;

        double promedio_final;
        double calificacion;
        String nombre_apellido;

        String cadena_final = "Las notas ingresadas son:\n";

        System.out.println("Ingrese nombre y apellido del estudiante:");
        nombre_apellido = entrada.nextLine();

        System.out.println("Ingrese las notas del estudiante:");

        while (contador <= limite) {
            System.out.printf("Ingrese calificación "
                    + "número %d\n", contador);
            calificacion = entrada.nextDouble();
            suma_total = suma_total + calificacion;

            cadena_final = String.format("%s%.2f\n",
                    cadena_final, calificacion);

            // contador
            contador = contador + 1;
        }

        cadena_final = String.format("Estudiante: %s\n%s\nLa suma de notas es: %.1f\n",
                nombre_apellido, cadena_final, suma_total);

        promedio_final = suma_total / limite;

        cadena_final = String.format("%sPromedio es: %.2f\n",
                cadena_final, promedio_final);

        System.out.printf("El promedio final es %f\n", promedio_final);
        System.out.printf("%s\n", cadena_final);
    }
}
/*
 La cadena estaria guardando el historial de cada nota ingresada y al final 
le pega la suma y el promedio para presentar un único texto limpio 
al terminar el programa.
*/