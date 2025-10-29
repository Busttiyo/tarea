/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios04 {
    
    public static void main(String[] ars){
        //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        //y muestre la traspuesta de la matriz.
        System.out.println("normal");
       mostrar(matris());
        System.out.println("");
        System.out.println("inverso");
       mostrarInverso(matris());
        
    }
    
    //matris
    public static int[][] matris(){
      int [][] matris = new int[4][4];
      
      for (int i =0;i<4;i++){
          for (int j =0;j<4;j++){
              matris[i][j]=(i+1);
          }
      }
      return matris;
    };
    
    //mostrar
    public static void mostrar(int[][] ars){
        for (int i =0;i<4;i++){
            System.out.println("");
          for (int j =0;j<4;j++){
              System.out.print(ars[i][j]);
          }
      }
    }
    
    //inverso
    public static void mostrarInverso(int[][] ars){
        for (int i =0;i<4;i++){
            System.out.println("");
          for (int j =0;j<4;j++){
              System.out.print(ars[j][i]);
          }
      }
    }
}
