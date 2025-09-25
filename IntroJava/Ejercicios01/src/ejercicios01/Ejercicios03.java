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
public class Ejercicios03 {
    public static void main(String[] args){
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas
        //y después toda en minúsculas.
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        //Variables
        String variable;
        String mayucula;
        String Minuscula;
        Scanner leer = new Scanner (System.in);
        
        //programa
        
        System.out.println("ingrese una frace ");
        variable = leer.next();
        mayucula = variable.toUpperCase();
        Minuscula = variable.toLowerCase();
        
        System.out.println("frace: "+variable);
        System.out.println("frace Mayusculas: "+mayucula);
        System.out.println("frace Minuscula:" +Minuscula);
    }
}
