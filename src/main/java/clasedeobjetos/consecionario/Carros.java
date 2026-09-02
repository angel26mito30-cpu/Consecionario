/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Carros {
    
    private int numerosPuertas = 0;
    private String tipoGasolina = "";
    private double cilindraje = 0;
    private boolean automatico = false;
    
     public int getnumerosPurtas (){
            return numerosPuertas;
        }
        
        public void setnumerosPuertas (int numerosPuertas){
            this.numerosPuertas = numerosPuertas;
        }
        
        public String gettipoGasolina (){
            return tipoGasolina;
        }
        
        public void settipoGasolina (int año){
            this.tipoGasolina = tipoGasolina;
        }
        
        public double getcilindraje (){
            return cilindraje;
        }
        
        public void setcilindraje (double cilindraje){
            this.cilindraje = cilindraje;
        }
        
        public boolean getautomatico (){
            return automatico;
        }
        
        public void setautomatico (boolean automatico){
            this.automatico = automatico;
            
        }
        
    
}
