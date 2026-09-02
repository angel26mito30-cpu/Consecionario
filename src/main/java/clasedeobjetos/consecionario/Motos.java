/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Motos extends Vehiculos{
    
    protected int numeroRuedas = 0;
    private String tipoMotos = "";
    private double kilometraje = 0;
    private boolean electrica = false;
    
    public Motos (String marca, int año, double precio, boolean disponible, 
           int numeroRuedas, String tipoMotos, double kilometraje, boolean electrica){
        
        super(marca, año, precio, disponible);
            this.numeroRuedas = numeroRuedas;
            this.tipoMotos = tipoMotos;
            this.kilometraje = kilometraje;
            this.electrica = electrica;
            
    }
    
}



