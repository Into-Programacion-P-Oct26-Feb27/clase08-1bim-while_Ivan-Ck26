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
public class Ejemplo062 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        while(bandera==true){ //true == true // false == true 
            System.out.println("Estoy en ciclo");
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")){
                   bandera = false;
            }
        }
    }
}

/*
En este ejercicio estamos haciendo un ciclo while controlado por una variable
banderay una condición de salida ingresada por el usuario. 
El bucle se repite mientras sea true y termina cuando el usuario escribe -100.
*/