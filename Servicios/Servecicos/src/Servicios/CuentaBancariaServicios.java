/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class CuentaBancariaServicios {
    //Agregar la clase CuentaBancariaServicio en el paquete Servicios que
    //contenga:
    //a) Método para crear cuenta pidiéndole los datos al usuario.
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    //c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    //d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    //Validar que el usuario no saque más del 20%.
    //e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    //cuenta.
    //f) Método consultarDatos: permitirá mostrar todos los datos de la
    //cuenta.
    
    // import
    Scanner leer = new Scanner(System.in);
    
    //a) Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuentaBancaria(){
        CuentaBancaria b = new CuentaBancaria();
        System.out.println("Ingrese el Numero De Cuenta");
        b.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese EL DNI del Cliente");
        b.setDniCliente(leer.nextInt());
        System.out.println("Ingrese el saldo Actual de la cuenta");
        b.setSaldoActual(leer.nextInt());
        return b;
    }
    
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    
    //c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    //d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    //Validar que el usuario no saque más del 20%.
    
    //e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    //cuenta.
    
    //f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void mostrarDatos(CuentaBancaria a){
        System.out.println("Numero de Cuenta: "+ a.getNumeroCuenta());
        System.out.println("DNI de la Cuenta: "+a.getDniCliente());
        System.out.println("Saldo Actual de la cuenta: "+a.getSaldoActual());
    }
}
