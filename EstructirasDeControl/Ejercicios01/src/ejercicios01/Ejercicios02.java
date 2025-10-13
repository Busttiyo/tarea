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
public class Ejercicios02 {
    public static void main(String[] args){
        ///Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        ///programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        ///Incorrecto. Nota: investigar la función equals() en Java.
        
        //Imports
        Scanner leer = new Scanner(System.in);
        //Variables
        String frace = "eureka";
        String valor;
        String correccion;
        //codigo
        
        System.out.println("ingrese la frace correcta");
        valor = leer.next();
        correccion = valor.toLowerCase();
        valor = correccion;
        if(valor.equals(frace)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
