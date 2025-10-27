/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios01 {
    
    public static void main(String[] arg){
        //Realizar un algoritmo que llene un vector con los 100 primeros números
        //enteros y los muestre por pantalla en orden descendente.
        mostrar(llenar());
    }
    
    public static int[] llenar(){
        int[] vector = new int[100];
        for(int i = 0; i<100;i++){
            vector[i] = i+1;
        }
        return vector;
    }
    
    public static void mostrar(int[] abc){
        for(int i = 0; i<100; i++){
            System.out.println("numero: "+abc[i]);
        }
    }
}
