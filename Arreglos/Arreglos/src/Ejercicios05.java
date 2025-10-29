/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios05 {
    
    public static void main(String[] ars){
        //Realice un programa que compruebe si una matriz dada es antisimétrica.
        //Se dice que una matriz A es antisimétrica cuando ésta es igual a su
        //propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
        //A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
        //obtiene cambiando sus filas por columnas (o viceversa).
        
        mostrar(matris());
        mostrar(matrisTraspuesta());
        System.out.println("");
        comparar(matris(),matrisTraspuesta());
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
    
    //matris inversa
    public static int[][] matrisTraspuesta(){
      int [][] matris = new int[4][4];
      
      for (int i =0;i<4;i++){
          for (int j =0;j<4;j++){
              matris[j][i]=(i+1)*(-1);
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
    
    //comparar
    public static void comparar(int[][] n, int[][] m){
        boolean valor = false;
        for(int i= 0;i<4;i++){
            for(int j=0;j<4;j++){
                if(n[i][j]==(m[j][i])*(-1)){
                    valor= true;
                }else{
                    valor= false;
                }
            }
        }
        
        System.out.println("valor de traspuesto: "+valor);
    }
}
