/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Circunferencia {
        //Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
        //tipo real. A continuación, se deben crear los siguientes métodos:
        //a) Método constructor que inicialice el radio pasado como parámetro.
        //b) Métodos get y set para el atributo radio de la clase Circunferencia.
        //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
        //objeto.
        //d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
        //e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
    
    //ATRIBUTOS
    private int radio;
    
    //CONSTRUCTORES

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }
    
    //GETTERS AND SETTERS

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    //METODOS
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el Radio de la circunferencia");
        setRadio(leer.nextInt());
    }
    
    public void area(){
        float area;
        area = (float) (PI * (getRadio()*getRadio()));
        System.out.println("Area de la Circunferencia: "+area);
    }
    
    public void perimetro(){
        float perimetro;
        perimetro = (float) (2*PI*getRadio());
        System.out.println("Perimetro de la Circunferencia: "+perimetro);
    }
    
}
