
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
        
        
    }
    //vector
    public static int[] vector(int[] ar){
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i <10; i++){
            System.out.println("ingrese numero aleatorio");
            ar[i]=leer.nextInt();
        }
        return ar;
    }
    
    //buscador
    public static void busqueda(){
        int[] vector = new int[10];
        vector(vector);
        Scanner leer = new Scanner(System.in);
        int valor;
        System.out.println("ingrese un valor a buscar");
        valor = leer.nextInt();
        
        for(int i = 0;i<10;i++){
            if(valor == vector[i]){
                System.out.println("Valor encontrado en la posicion: ");
            }
        }
    }
}
//arreglar