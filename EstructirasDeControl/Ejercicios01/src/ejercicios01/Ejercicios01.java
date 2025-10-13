/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicios01 {
    //funciones
    
    //dado
    public static int numerosDados(){
        Random random = new Random();
        int valor;
        valor = random.nextInt(6);
      return  (valor +1); 
    };
    
    //programa
    public static void main(String[] args) {
    //Crear un programa que dado un número determine si es par o impar.
    //Variables
    int valor;
    double resto;
    //codigo
    
    valor = numerosDados();
    System.out.println("valor de la cara del dado: "+valor);
    resto = valor % 2 ;
    //condicional
    if (resto == 0){
        System.out.println("valor es par");
    } 
    else {
        System.out.println("valor impar");
    }
}


  
}
