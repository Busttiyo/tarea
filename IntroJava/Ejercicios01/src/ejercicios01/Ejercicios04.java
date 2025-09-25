/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicios04 {
    public static void main(String[] args){
        
        //Ejercicio.
        //Dada una cantidad de grados centígrados se debe mostrar su
        //equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
        //+ (9 * C / 5).
        
        //VARIABLES
        int gradosC;
        int gradosF;
        
        //programa.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados en(C): ");
        gradosC = leer.nextInt();
        
        gradosF = 32+(9 * gradosC / 5);
        
        System.out.println("grados en Celcius: "+gradosC);
        System.out.println("grados en Fahrenheit:"+gradosF);
    }
}
