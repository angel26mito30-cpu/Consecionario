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
    
        public Carros (String marca, int año, double precio, double cilindraje, int numeroPuertas){
            
            super (marca, año, precio);
            this.numerosPuertas = 4;
            this.tipoGasolina = "Diesel";
            this.cilindraje = cilindraje;
            this.automatico = false;
        }
        
        public Carros (String marca, double precio, boolean automatico){
            
            super (marca, precio);
            this.numerosPuertas = 2;
            this.tipoGasolina = "electricidad";
            this.cilindraje = 0;
            this.automatico = true;
        }
        
        public int getnumeroPuertas (){
            return numerosPuertas;
        }
        
        public void setnumerosPuertas (int numerosPuertas){
            this.numerosPuertas = numerosPuertas;
        }
        
        public String gettipoGasolina (){
            return tipoGasolina;
        }
        
        public void settipoGasolina (String tipoGasolina){
            this.tipoGasolina = tipoGasolina;
        }
        
        public double getcilindraje (){
            return cilindraje;
        }
        
        public void setcilindraje ( double cilindraje){
            this.cilindraje = cilindraje;
        }
        
        public boolean getautomatico (){
            return automatico;
        }
        
        public void setautomatico (boolean automatico){
            this.automatico = automatico;
        }
}


