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
public class Ejercicios07 {
    public static void main(String[] args){
    
        ///Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        ///Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        //lo siguiente:
        
        //imports.
        Scanner leer = new Scanner(System.in);
        //variables
        int valor;
        
        System.out.print("Ingrese el valor de del tamaño del cuadrado: ");
        valor= leer.nextInt();
        
        
        for(int i = 0; i< valor; i++){
            for(int j= 0; j< valor;j++){
                if(i == 0 || i == (valor-1)){
                    System.out.print("*");
                }else if(j== 0 || j == (valor-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
