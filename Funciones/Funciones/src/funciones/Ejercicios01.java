/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejercicios01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que le pida dos números al usuario y este pueda
        //elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
        //una función para cada operación matemática y deben devolver sus
        //resultados para imprimirlos en el main.
        
        //Inport
        Scanner leer = new Scanner(System.in);
        //Variable
        int a,b,menu,resp;
        
        //datos
        System.out.println("INGRESE DOS NUMEROS");
        a = leer.nextInt();
        b = leer.nextInt();
        
        //menu
        do{
            System.out.println(" ");
            System.out.println("******MENU********");
            System.out.println("1.SUMAR.");
            System.out.println("2.RESTAR.");
            System.out.println("3.MULTIPLICAR.");
            System.out.println("4.DIVIDIR.");
            System.out.println("5.SALIR.");
            menu = leer.nextInt();
            
            switch (menu){
                case(1):
                    resp = suma(a,b);
                    System.out.println("resultado de la suma: "+resp);
                    break;
                case(2):
                    resp = resta(a,b);
                    System.out.println("resultado de la resta: "+resp);
                    break;
                case(3):
                    resp = multi(a,b);
                    System.out.println("resultado de la multiplicacion: "+resp);
                    break;
                case(4):
                    resp = dividir(a,b);
                    System.out.println("resultado de la divicion: "+resp);
                    break;
                case(5):
                    System.out.println("Adios");
                    continue;
                default:
                    System.out.println("Ingrese una valor valido");
                    break;
            }    
        }while(menu!=5);
        System.out.println("Fin del Programa");
    }
    
    //Funciones
    
    //SUMA
    public static int suma(int a, int b){
        int resp;
        resp = a+b;
        return resp;
    }
    
    //RESTA
    public static int resta(int a, int b){
        int resp;
        resp = a -b;
       return  resp;
    }
    
    //MULTIPLICAR
    public static int multi(int a, int b){
        int resp;
        resp = a *b;
        return resp;
    }
    
    //DIVIDIR
    public static int  dividir(int a, int b){
        int resp;
        resp = a +b;
        return resp;
    }
}
