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
        //EJERCICIO
        
        //Escribir un programa que lea un número entero por teclado y muestre
        //por pantalla el doble, el triple y la raíz cuadrada de ese número.
        //Nota: investigar la función Math.sqrt().
        
        //VARIABLE 
        
        int valor;
        int doble;
        int triple;
        double raiz;
        //programa
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor: ");
        valor = leer.nextInt();
        
        doble = valor * 2;
        triple = valor * 3;
        raiz = Math.sqrt(valor);
        
        System.out.println("valor inicial: "+valor);
        System.out.println("doble del valor: "+doble);
        System.out.println("triple del valor: "+triple);
        System.out.println("raiz del valor: "+raiz);
    }
}
