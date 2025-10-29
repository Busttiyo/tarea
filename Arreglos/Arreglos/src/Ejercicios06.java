
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios06 {
    public static void main(String[] ars){
        
        //Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
        //1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
        //idénticas. Crear un programa que permita introducir un cuadrado por
        //teclado y determine si este cuadrado es mágico o no. El programa
        //deberá comprobar que los números introducidos son correctos, es decir,
        //están entre el 1 y el 9.
        
        mostrar(matris());
    }
    
    
    //correco
    public static int valor(){
        Scanner leer = new Scanner(System.in);
        boolean valor = false;
        int ar;
        do{
            System.out.println("Ingresa un valor entre 1/9:");
            ar = leer.nextInt();
            if(ar<10 && ar>0){
                valor = true;
            }else{
                System.out.println("incorrecto");
            }
        }while(valor== false);
        return ar;
    }
    
    //matris
    public static int[][] matris(){
      int [][] matris = new int[3][3];
      for (int i =0;i<3;i++){
          for (int j =0;j<3;j++){
              
              matris[i][j]=valor();
          }
      }
      return matris;
    };
    
    //mostrar
    public static void mostrar(int[][] ars){
        for (int i =0;i<3;i++){
            System.out.println("");
          for (int j =0;j<3;j++){
              System.out.print(ars[i][j]);
          }
        }
        System.out.println("");
        cuadradoMagico(ars);
    } 
    
    
    //cuadrado magico
    public static void cuadradoMagico(int[][] ars){
        int valor1,valor2,valor3,valor4,valor5,valor6,valor7,valor8;
        valor1=ars[0][0]+ars[0][1]+ars[0][2];
        valor2=ars[1][0]+ars[1][1]+ars[1][2];
        valor3=ars[2][0]+ars[2][1]+ars[2][2];
        valor4=ars[0][0]+ars[1][0]+ars[2][0];
        valor5=ars[0][1]+ars[1][1]+ars[2][1];
        valor6=ars[0][2]+ars[1][2]+ars[2][2];
        valor7=ars[0][0]+ars[1][1]+ars[2][2];
        valor8=ars[2][0]+ars[1][1]+ars[0][2];
        
        if(valor1==valor2&& valor1==valor3&& valor1==valor4&& valor1==valor5&& valor1==valor6&& valor1==valor7&& valor1==valor8){
            System.out.println("es un cuadrado magico");
        }else{
            System.out.println("no es un cuadrado magico");
        }
    }
    
}
