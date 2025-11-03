
import Entidades.Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Ejercicios01 {
    public static void main(String[] ars){
        //Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        //Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        //constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        //luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
        //numero de páginas.
        
        //programa
        
        Libro libro = new Libro();
        
        
        libro.crearLibro();
        
        libro.mostrarLibro();
    }

   
}
