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
public class Libro{
    //Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    //Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    //constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    //luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    //numero de páginas.
    
    //Atributos
    private String ISBM;
    private String Titulo;
    private String Autor;
    private Integer N_pagina;
    
    //Contructores;

    public Libro() {
    }

    public Libro(String ISBM, String Titulo, String Autor, Integer N_pagina) {
        this.ISBM = ISBM;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.N_pagina = N_pagina;
    }
    
    //Seters y Getters

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setN_pagina(Integer N_pagina) {
        this.N_pagina = N_pagina;
    }

    public String getISBM() {
        return ISBM;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public Integer getN_pagina() {
        return N_pagina;
    }
    
    
    //Metodos
    public void crearLibro(){
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBM:");
        setISBM(leer.nextLine());
        System.out.println("Ingrese el autor del libro:");
        setAutor(leer.nextLine());
        System.out.println("Igrese el Nombre del libro:");
        setTitulo(leer.nextLine());
        System.out.println("Ingrese el numero de Paginas");
        setN_pagina(leer.nextInt());
        
    }
    
    public void mostrarLibro(){
        
        System.out.println("Titulo del libro: "+getTitulo());
        System.out.println("Nombre del Autor: "+getAutor());
        System.out.println("Nombre de la Distribuidoras: "+getISBM());
        System.out.println("Cantidad de paginas: "+getN_pagina());
    }
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBM=" + ISBM + ", Titulo=" + Titulo + ", Autor=" + Autor + ", N_pagina=" + N_pagina + '}';
    }
    
    
    
}