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
    
        public Carros (String marca, int año, double precio, double cilindraje, int numerosPuertas){
            
            super (marca, año, precio);
            this.numerosPuertas = numerosPuertas;
            this.tipoGasolina = "Diesel";
            this.cilindraje = cilindraje;
            this.automatico = true;
        }
        
        public Carros(String marca, double precio, boolean automatico) {

            super(marca, precio);
                this.numerosPuertas = 4;
                this.tipoGasolina = "Gasolina";
                this.cilindraje = 1.6;
                this.automatico = automatico;
        }
        
        public int getnumerosPuertas (){
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
        
        @Override
        
        public String toString(){
            return "Carros {" + "marca = " + marca + "año = " + año + "precio = " + getprecio () + "disponible = "
                    + getdisponible ()+  "numero Puertas = " + numerosPuertas + "tipo Gasolina = " + tipoGasolina +
                    "cilindraje = " + cilindraje + "automatico = " + automatico + "}";
                    
        }
}


