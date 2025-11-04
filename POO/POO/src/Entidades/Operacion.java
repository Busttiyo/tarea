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
public class Operacion {
    //Crear una clase llamada Operacion que tenga como atributos privados numero1 y
    //numero2. A continuación, se deben crear los siguientes métodos:
    //a) Método constructor con todos los atributos pasados por parámetro.
    //b) Metodo constructor sin los atributos pasados por parámetro.
    //c) Métodos get y set.
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    
    //ATRIBUTOS
    private int numero1;
    private int numero2;
    
    //CONSTRUCTORES

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //GETTERS AND SETTERS

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //METODOS
    
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un valor:");
        setNumero1(leer.nextInt());
        System.out.println("Ingrese un valor:");
        setNumero2(leer.nextInt());
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void suma(){
        int valor1=getNumero1();
        int valor2=getNumero2();
        System.out.println("la suma de los valores ingresados es: "+(valor1+valor2));
    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void resta(){
        int valor1=getNumero1();
        int valor2=getNumero2();
        System.out.println("la resta de los valores ingresados es: "+(valor1-valor2));
    }
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    public void multiplicar(){
        int valor1=getNumero1();
        int valor2=getNumero2();
        
        if(valor1!=0 && valor2!=0){
            System.out.println("la multiplicacion de los valores de los valores ingresados es: "+(valor1*valor2));
        }else{
            System.out.println("Uno de los valores ingresados era 0 por lo que el valor de la multiplicacion es: 0");
        }
        
    }
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public void dividir(){
        int valor1=getNumero1();
        int valor2=getNumero2();
        
        if(valor1!=0 && valor2!=0){
            System.out.println("la divicion de los valores de los valores ingresados es: "+(valor1/valor2));
        }else{
            System.out.println("Uno de los valores ingresados era 0 por lo que el valor de la divicion es: 0");
        }
    }
   
}
