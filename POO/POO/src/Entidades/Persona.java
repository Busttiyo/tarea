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
public class Persona {
    //Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    //sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
    //atributo, puede hacerlo. Los métodos que se implementarán son:
    //-Un constructor por defecto.
    //-Un constructor con todos los atributos como parámetro.
    //-Métodos getters y setters de cada atributo.
    //-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    //al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    //Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    //O. Si no es correcto se deberá mostrar un mensaje
    //-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    //significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    //Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    //persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    //de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    //función devuelve un 1.
    //-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.
    
    //ATRIBUTOS
    private String Nombre;
    private int Edad;
    private String sexo;
    private int peso;
    private double altura;
    //CONSTRUCTORS
    public Persona() {
    }

    public Persona(String Nombre, int Edad, String sexo, int peso, double altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    //SETTERS AND GETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //METODOS
    //-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    //al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    //Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    //O. Si no es correcto se deberá mostrar un mensaje
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        setNombre(leer.nextLine());
        System.out.println("Ingreser la edad de la persona");
        setEdad(leer.nextInt());
        System.out.println("Ingrese el Sexo de la persona('H=Hombre/M=mujer')");
        setSexo(leer.next());
        if(validar(getSexo())== false){
            System.out.println("el sexo ingresado es invalido");
        }
        System.out.println("ingrese la altura");
        setAltura(leer.nextDouble());
        System.out.println("ingrese el peso");
        setPeso(leer.nextInt());
    }
    private boolean validar(String h){
        boolean v = false;
        if(h.equals("h") || h.equals("H")){
            v= true; 
        }else if(h.equals("m")|| h.equals("M")){
            v = true;
        }
        
        return v;
    }
    
    //-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.
    public void esMayorDeEdad(){
        if(getEdad()>= 18){
            System.out.println("es mayor de edad");
        }else
            System.out.println("No es mayor de edad");
    }
    //-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    //significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    //Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    //persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    //de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    //función devuelve un 1.
    public void calculoIMC(){
        
    }        
}
