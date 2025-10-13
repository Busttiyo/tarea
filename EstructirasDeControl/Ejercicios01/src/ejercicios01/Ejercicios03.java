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
        ///Realizar un programa que solo permita introducir solo frases o palabras
        ///de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
        ///deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
        ///caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
        ///función Lenght() en Java.
        
        //Imports
        Scanner leer = new Scanner(System.in);
        
        //variables
        String palabra;
        int valor;
        
        //codigo
        
        System.out.println("ingrese una palabra con solo 8 letras");
        palabra = leer.next();
        valor = palabra.length();
        
        if(valor == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    }
}
