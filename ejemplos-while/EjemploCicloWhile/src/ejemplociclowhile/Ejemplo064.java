/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejemplo064 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String pais;
        String capital = "";
        String mensaje;
        String salir;
        int contador = 0;

        while (bandera == true) {
            System.out.println("Países disponibles: Chile, Perú, Ecuador, México, Argentina");
            System.out.println("Ingrese el nombre del país:");
            pais = entrada.nextLine();
            contador = contador + 1;

            if (pais.equalsIgnoreCase("Chile")) {
                capital = "Santiago";
                mensaje = String.format("La capital de %s es %s.", pais, capital);
            } else if (pais.equalsIgnoreCase("Peru") || pais.equalsIgnoreCase("Perú")) {
                capital = "Lima";
                mensaje = String.format("La capital de %s es %s.", pais, capital);
            } else if (pais.equalsIgnoreCase("Ecuador")) {
                capital = "Quito";
                mensaje = String.format("La capital de %s es %s.", pais, capital);
            } else if (pais.equalsIgnoreCase("Mexico") || pais.equalsIgnoreCase("México")) {
                capital = "Ciudad de México";
                mensaje = String.format("La capital de %s es %s.", pais, capital);
            } else if (pais.equalsIgnoreCase("Argentina")) {
                capital = "Buenos Aires";
                mensaje = String.format("La capital de %s es %s.", pais, capital);
            } else {
                mensaje = String.format("El país \"%s\" no está en la lista.", pais);
            }

            System.out.println(mensaje);

            System.out.println("¿Desea salir del ciclo? Ingrese si:");
            salir = entrada.nextLine();

            if (salir.equalsIgnoreCase("si")) {
                bandera = false;
            }
        }

        mensaje = String.format("Cantidad de países ingresados: %d", contador);
        System.out.println(mensaje);
    }
}