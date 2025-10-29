
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios02 {
    public static void main(String[] args){
        //Realizar un algoritmo que llene un vector de tamaño N con valores
        //aleatorios y le pida al usuario un número a buscar en el vector. El
        //programa mostrará dónde se encuentra el numero y si se encuentra
        //repetido
        buscar(vector());
        
    }
    
    
    //vector
    public static int[] vector(){
        int[] ar = new int[10];
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i <10; i++){
            System.out.println("ingrese numero aleatorio");
            ar[i]=leer.nextInt();
        }
        return ar;
    }
    
    //busqueda
    public static void buscar(int[] ars){
        int valor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor a buscar");
        valor = leer.nextInt();
        
        for(int i = 0; i<10;i++){
            if(ars[i]== valor){
                System.out.println("valor encontrado en la posicion:" + i);
            }
        }
    }
    
}