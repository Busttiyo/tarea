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
        ///Escriba un programa que pida una frase o palabra y valide si la primera
        ///letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        ///imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        ///contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
        ///Substring y equals() de Java.
        
        //Impor
        Scanner leer = new Scanner(System.in);
        //Variables
        String palabra;
        String letra;
        
        System.out.println("Ingrese una palabra que su primera letra sea a");
        palabra = leer.nextLine();
        letra = palabra.substring(0, 1);
        System.out.println(letra);
        if(letra.equals("A") || letra.equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("incorecto");
        }
  
        
    }
}
