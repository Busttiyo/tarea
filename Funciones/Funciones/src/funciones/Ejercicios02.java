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

public class Ejercicios02 {
    
    //Import
   
    
    
    public static void main(String[] args){
        
        //Diseñe una función que pida el nombre y la edad de N personas e
        //imprima los datos de las personas ingresadas por teclado e indique si
        //son mayores o menores de edad. Después de cada persona, el programa
        //debe preguntarle al usuario si quiere seguir mostrando personas y frenar
        //cuando el usuario ingrese la palabra “No”.
        
        procedimiento();
    }
    
    //Funciones
    
    //NOMBRE
    public static String nombre(){
        Scanner leer = new Scanner(System.in);
        String n;
        System.out.println("ingrese su nombre:");
        n = leer.nextLine();
        return n;
    }
    
    //EDAD
    public static int edad(){
        Scanner leer = new Scanner(System.in);
        int d;
        System.out.println("ingrese su edad");
        d = leer.nextInt();
        return d;
    }
    
    //procedimiento
    public static void procedimiento(){
        Scanner leer = new Scanner(System.in);
        int d;
        String n,r;
        
        do{
            n = nombre();
            d = edad();
            System.out.println("Nombre: "+n);
            System.out.println("Edad: "+d);
            System.out.println("Desea ingresar otro nombre(si/no)");
            r = leer.nextLine();
        }while(r.equals("si"));
    }
}
