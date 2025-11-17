/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Rectangulo {
        //Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
        //base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
        //con los datos del Rectángulo dados por el usuario. También incluirá un método para
        //calcular la superficie del rectángulo y un método para calcular el perímetro del
        //rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
        //asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
        //setters y constructores correspondientes.
        //Superficie = base * altura / Perímetro = (base + altura) * 2.
    
    //ATRIBUTOS
    private int base;
    private int altura;
    
    //CONSTRUCTORES

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //GETTERS AND SETTERS

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //METODOS
    
    public void crarRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar valor de altura: ");
        setAltura(leer.nextInt());
        System.out.println("ingrese valor base: ");
        setBase(leer.nextInt());
    }
    
    public void superficie(){
        int altura = getAltura();
        int  base= getBase();
        int perimetro = (base+altura)*2;
        System.out.println("La superficie del rectangulo es de: "+((base*altura)/perimetro));
    }
    
   public void mostrarRectangulo(){
       for(int i = 0; i < altura; i++){
           System.out.println("");
           for(int j = 0; j<base; j++){
               if(i == 0|| i == altura-1){
                   System.out.print("*");
               }else
                   if(j == 0 || j == base-1){
                       System.out.print("*");
                   }else
                       System.out.print(" ");
           }
       }
       System.out.println("");
   }
    
}
