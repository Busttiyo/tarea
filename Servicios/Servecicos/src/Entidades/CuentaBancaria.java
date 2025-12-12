/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author David
 */
public class CuentaBancaria {
    //Realizar una clase llamada CuentaBancaria en el paquete Entidades con
    //los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
    //saldoActual. Agregar constructor vacío, con parámetros, getters y
    //setters.
    
    //Atributos
    
    private int numeroCuenta;
    private int dniCliente; 
    private int saldoActual;
    
    //constructores
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    //gettets and setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
