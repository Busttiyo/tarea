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
public class Ejercicios03 {
    
    public static void main(String[] args){
    //Crea una aplicación que a través de una función nos convierta una
    //cantidad de euros introducida por teclado a otra moneda, estas pueden
    //ser a dólares, yenes o libras. La función tendrá como parámetros, la
    //cantidad de euros y la moneda a convertir que será una cadena, este no
    //devolverá ningún valor y mostrará un mensaje indicando el cambio
    //(void).
    //El cambio de divisas es:
    //i. * 0.86 libras es un 1 €
    //ii. * 1.28611 $ es un 1 €
    //iii. * 129.852 yenes es un 1 €
    comvertir();
    }
    
    
    //funciones
    
    //libras
    public static double libra(int a){
        double resp;
        resp = a * 0.86;
        return resp;
    }
    //dolar
    public static double dolar(int a){
        double resp;
        resp = a * 1.28611;
        return resp;
    }
    //yenes
    public static double yenes(int a){
        double resp;
        resp = a * 129.852;
        return resp;
    }
    //menu
    public static double menu(int a, int b){
        double resp = 0;
        switch(a){
            case(1):
                resp = libra(b);
                break;
            case(2):
                resp = dolar(b);
                break;
            case(3):
                resp = yenes(b);
                break;
            default:
                System.out.println("valor no valido");
                break;    
        }
        return resp;
    }
    public static void comvertir(){
        Scanner leer = new Scanner(System.in); 
        int valor,opcion;
        double cambio;
        System.out.println("ingrese la cantidad que desee cambiar");
        valor = leer.nextInt();
        System.out.println("ingrese la opcion que desea cambiar los €:");
        System.out.println("1-Libras");
        System.out.println("2-Dolares");
        System.out.println("3-yenes");
        opcion = leer.nextInt();
        cambio= menu(opcion,valor);
        System.out.println("su tipo cambio de "+valor+" en la opcion: "+opcion+" es de: "+cambio);
    }
}
