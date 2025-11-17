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
public class Cafetera {
        //Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
        //(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
        //cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
        //métodos:
        //*Constructor predeterminado o vacío
        //*Constructor con la capacidad máxima y la cantidad actual
        //*Métodos getters y setters.
        //*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
        //máxima.
        //* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el  
        //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        //cuanto quedó la taza.
        //* Método vaciarCafetera(): pone la cantidad de café actual en cero.
        //* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        //recibe y se añade a la cafetera la cantidad de café indicada.
    
    //ATRIBUTOS
    
    private int capasidadMaxima = 100;
    private int cantidadActual;
    private int cafe;
    private int taza;
    
    //CONSTRUCTORS

    public Cafetera() {
    }

    public Cafetera(int cantidadActual, int cafe, int taza) {
        this.cantidadActual = cantidadActual;
        this.cafe = cafe;
        this.taza = taza;
    }
    
    
    //GETTERS AND SETTERS

    public int getCapasidadMaxima() {
        return capasidadMaxima;
    }

    public void setCapasidadMaxima(int capasidadMaxima) {
        this.capasidadMaxima = capasidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getTaza() {
        return taza;
    }

    public void setTaza(int taza) {
        this.taza = taza;
    }
    
    
    //METODOS
    
    
    //*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        setCantidadActual(getCapasidadMaxima());
    }
    
    //* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el  
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.
    
    public void servirTaza(int i){
        if(i>getCantidadActual()){
            System.out.println("Solo sepudo servir "+getCantidadActual()+" ml. de cafe");
            
        }else{
            setCantidadActual(getCantidadActual()-i);
        }
    }
    
    //* Método vaciarCafetera(): pone la cantidad de café actual en cero.
    
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    
    //* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    
    public void agregarCafe(int i){
        setCantidadActual(i);
    }
    
    public int taza(){
        int taza;
        Scanner leer = new Scanner(System.in);
        System.out.println("indique el tamaño de la taza/ml:");
        taza = leer.nextInt();
        return taza;
    }
    
    public int cafe(){
        int cafe;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantodad de cafe para agregar");
        cafe = leer.nextInt();
        return cafe;
    }
}
