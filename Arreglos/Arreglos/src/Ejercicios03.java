/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios03 {
    public static void main(String[] ars){
        //Recorrer un vector de N enteros contabilizando cuántos números son de
        //1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        contador();
    }
    
    
    //Vector lleno
    public static int[] vector(){
        int[] vector = new int[90000];
        for(int i = 0; i<90000;i++){
            vector[i]= i+1;
        }
        return vector;
    }
    
    
    //1 digito
    public static int Undigito(int[] vector){
        int contador = 0;
        
        for(int i = 0; i<90000; i++){
            if((vector[i]/1)<10){
                contador = contador+1;
            }
        }
        
        return contador;
    }
    
    //2 digitos
    public static int Dosdigito(int[] vector){
        int contador = 0;
        
        for(int i = 0; i<90000; i++){
            if((vector[i]/10)<10 && (vector[i]/10) > 0){
                contador = contador+1;
            }
        }
        
        return contador;
    }
    
    //3 digitos
    public static int Tresdigito(int[] vector){
        int contador = 0;
        
        for(int i = 0; i<90000; i++){
            if((vector[i]/100)<10 && (vector[i]/100) > 0){
                contador = contador+1;
            }
        }
        
        return contador;
    }
    
    //4 digitos
    public static int Cuatrodigito(int[] vector){
        int contador = 0;
        
        for(int i = 0; i<90000; i++){
            if((vector[i]/1000)<10 && (vector[i]/1000) > 0){
                contador = contador+1;
            }
        }
        
        return contador;
    }
    
    //5 digitos
    public static int Cincodigito(int[] vector){
        int contador = 0;
        
        for(int i = 0; i<90000; i++){
            if((vector[i]/10000)<10 && (vector[i]/10000) > 0){
                contador = contador+1;
            }
        }
        
        return contador;
    }
    
    //contador
    
    public static void contador(){
       int D1,D2,D3,D4,D5;
       D1 = Undigito(vector());
       D2 = Dosdigito(vector());
       D3 = Tresdigito(vector());
       D4 = Cuatrodigito(vector());
       D5 = Cincodigito(vector());
       System.out.println("de 1 digito:" +D1);
       System.out.println("de 2 digitos:" +D2);
       System.out.println("de 3 digitos:" +D3);
       System.out.println("de 4 digitos:" +D4);
       System.out.println("de 5 digitos:" +D5);
    }
}
