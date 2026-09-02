/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Vehiculos {
    
    protected String marca = "";
    protected int año = 0;
    private double precio = 0;
    private boolean disponible  = true;
    
    public Vehiculos (String marca, int año, double precio, boolean disponible) {
        
    this.marca = marca;
    this.año = año;
    this.precio = precio;
    this.disponible = disponible;
    }
}
