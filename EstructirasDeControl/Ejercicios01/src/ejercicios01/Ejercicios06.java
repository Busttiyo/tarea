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
public class Ejercicios06 {
    public static void main(String[] args){
        ///Realizar un programa que pida dos números enteros positivos por
        ///teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        ///una opción y el programa deberá mostrar el resultado por pantalla y
        ///luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        ///opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        ///vez de salir del programa directamente, se debe mostrar el siguiente
        ///mensaje de confirmación: ¿Está seguro que desea salir del programa
        ///(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        ///contrario se vuelve a mostrar el menú.
        
        
        //inport
        Scanner leer = new Scanner(System.in);
        //variables
        int valor1, valor2, resp;
        String salir;
        
        System.out.println("Ingrese 2 valores positivos");
        valor1 = leer.nextInt();
        valor2 = leer.nextInt();
        
        //menu
        do{
            System.out.println("*******MENU*******");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            resp = leer.nextInt();
            
            switch(resp){
                case(1):
                    
                    System.out.println("resultado de la Suma: "+(valor1+valor2));
                    break;
                case(2):
                    System.out.println("Resultado de la Resta: "+(valor1-valor2));
                    break;
                case(3):
                    System.out.println("Resultado de la Multiplicacion: "+(valor1*valor2));
                    break;
                case(4):
                    System.out.println("Resultado de la Divicion: "+(valor1/valor2));
                    break;
                case(5):
                    System.out.println("Desea Salir¿(S/N)?");
                    salir = leer.next();
                    if(salir.equals("S")||salir.equals("s")){
                        System.out.println("Adios");
                        continue;
                    }else{
                        break;
                    }
                default:
                    System.out.println("Elija un valor dentro de las opciones de menu");
                    break;
            }
        }while(resp != 5);
        System.out.println("Fin del programa.");
    }
    
}
