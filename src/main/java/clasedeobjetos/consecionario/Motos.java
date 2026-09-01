/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Motos {
    
    protected int numeroRuedas = 0;
    private String tipoMotos = "";
    private double cilindraje = 0;
    private boolean eléctrica = false;
    
     public int getnumerosRuedas (){
            return numeroRuedas;
        }
        
        public void setnumeroRuedas (int numeroRuedas){
            this.numeroRuedas = numeroRuedas;
        }
        
        public String gettipoMotos (){
            return tipoMotos;
        }
        
        public void settipoMotos (int tipoMotos){
            this.tipoMotos = this.tipoMotos;
        }
        
        public double getcilindraje (){
            return cilindraje;
        }
        
        public void setcilindraje (double cilindraje){
            this.cilindraje = cilindraje;
        }
        
        public boolean getelectrica (){
            return eléctrica;
        }
        
        public void setelectrica (boolean electrica){
            this.eléctrica = electrica;
            
        }
}
