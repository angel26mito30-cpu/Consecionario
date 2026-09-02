/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Camiones extends Vehiculos {
    
    private int numeroEjes = 0;
    protected String carroceria = "";
    private double carga = 0;
    private boolean camarote = true;
    
    public Camiones (String marca, int año, double precio, boolean disponible, 
           int numeroEjes, String carroceria, double carga, boolean camarote){
        
        super (marca, año, precio, disponible);
            this.numeroEjes = numeroEjes;
            this.carroceria = carroceria;
            this.carga = carga;
            this.camarote = camarote;
    }
    
}
