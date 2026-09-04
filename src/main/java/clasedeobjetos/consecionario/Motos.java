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
    
        public Motos (String marca, int año, boolean disponible, double kilometraje, int numeroRuedas){
        
            super (marca, año, disponible);
                this.numeroRuedas = numeroRuedas;
                this.tipoMotos = tipoMotos;
                this.kilometraje = kilometraje;
                this.electrica = false;        
        }
        
        public Motos (String marca, double precio, String tipoMotos, boolean electrica){
            
            super(marca, precio);
                this.numeroRuedas = numeroRuedas;
                this.tipoMotos = tipoMotos;
                this.kilometraje = kilometraje;
                this.electrica = false;        
        }
        
        public int getnumeroRuedas (){
            return numeroRuedas;
        }
        
        public void setnumeroRuedas (int numeroRuedas){
            this.numeroRuedas = numeroRuedas;
        }
        
        public String gettipoMotos (){
            return tipoMotos;
        }
        
        public void settipoMotos (String tipoMotos){
            this.tipoMotos = tipoMotos;
        }
        
        public double getkilometraje (){
            return kilometraje;
        }
        
        public void setkilometraje ( double kilometraje){
            this.kilometraje = kilometraje;
        }
        
        public boolean getelectrica (){
            return electrica;
        }
        
        public void setelectrica (boolean electrica){
            this.electrica = electrica;
        }
}



