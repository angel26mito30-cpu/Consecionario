/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Carros extends Vehiculos {
    
    private int numerosPuertas = 0;
    private String tipoGasolina = "";
    private double cilindraje = 0;
    private boolean automatico = false;
    
    public Carros (String marca, int año, double precio, boolean disponible, 
           int numerosPuertas, String tipoGasolina, double cilindraje, boolean automatico){
    
    super (marca, año, precio, disponible);
        this.numerosPuertas = numerosPuertas;
        this.tipoGasolina = tipoGasolina;
        this.cilindraje = cilindraje;
        this.automatico = automatico;
    }
}
