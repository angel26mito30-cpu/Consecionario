/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Buses extends Vehiculos {
    
    private int numeroPasajeros = 0;
    private String tipoServicio = "";
    protected double velMax = 0;
    private boolean wifi = true;  
    
    public Buses (String marca, int año, double precio, boolean disponible, 
           int numeroPasajeros, String tipoServicio, double velMax, boolean wifi){
    
           super(marca, año, precio, disponible);
            this.numeroPasajeros = numeroPasajeros;
            this.tipoServicio = tipoServicio;
            this.velMax = velMax;
            this.wifi = wifi;
            
    }
}
