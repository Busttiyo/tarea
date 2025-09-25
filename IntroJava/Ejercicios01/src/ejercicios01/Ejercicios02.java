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
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo
        //muestre por pantalla.
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = null;
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("el nombre ingresado es: "+nombre);
    }
    
}
