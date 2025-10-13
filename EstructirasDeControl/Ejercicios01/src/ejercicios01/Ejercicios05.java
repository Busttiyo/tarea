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
public class Ejercicios05 {
    public static void main(String[] args){
        ///Escriba un programa en el cual se ingrese un valor límite positivo, y a
        ///continuación solicite números al usuario hasta que la suma de los
        ///números introducidos supere el límite inicial.
        
        //Import
        Scanner leer = new Scanner(System.in);
        
        //variables
        int valor, contador, pregunta;
        
        System.out.println("Ingrese el valor limite para almacenar");
        contador = leer.nextInt();
        
        valor = 0;
        
        do{
            System.out.println("ingrese un valor");
            pregunta = leer.nextInt();
            valor = valor + pregunta;
            System.out.println("valor: "+valor);
        }while(valor<contador);
        System.out.println("valor de almacenamiento alcanzado");
    }    
}
