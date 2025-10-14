/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicios04 {
    public static void main(String[] args){
        //Crea una aplicación que nos pida un número por teclado y con una
        //función se lo pasamos por parámetro para que nos indique si es o no un
        //número primo, debe devolver true si es primo, sino false.
        //Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
        //Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
        //17 si es primo.
        primos();
    }
    
    //funciones
    
    //validador
    public static boolean validar(int a){
        boolean resp;
        if(a%1==0 && a%a==0){
            resp = true;
        }else{
            resp = false;
        }
        return resp;
    }
    //ejecutor
    public static void primos(){
        Scanner leer = new Scanner(System.in);
        int valor;
        boolean resp;
        System.out.println("ingrese un valor ");
        valor = leer.nextInt();
        resp = validar(valor);
        if(resp){
            System.out.println(" el valor "+valor+" es primo");
        }else{
            System.out.println("el valor "+valor+" no es primo");
        }
        
    }
}
