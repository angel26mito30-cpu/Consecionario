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
    
        public Buses (String marca, int año, double precio, int numeroPasajeros, String tipoServicio, boolean wifi){
        
            super (marca, año, precio);
                this.numeroPasajeros = 46;
                this.tipoServicio = "turismo";
                this.velMax = 80;
                this.wifi = true;
        }
        
        public Buses (double precio, boolean disponible, boolean wifi,String tipoServicio, int numeroPasajeros){
               
            super (precio, disponible);
                this.numeroPasajeros = 30;
                this.tipoServicio = "escolar";
                this.velMax = 50;
                this.wifi = false;
                
        }
     
        public int getnumeroPasajeros (){
            return numeroPasajeros;
        }
        
        public void setnumeroPasajeros (int numeroPasajeros){
            this.numeroPasajeros = numeroPasajeros;
        }
        
        public String gettipoServicio (){
            return tipoServicio;
        }
        
        public void settipoServicio (String tipoServicio){
            this.tipoServicio = tipoServicio;
        }
        
        public double getvelMax (){
            return velMax;
        }
        
        public void setvelMax ( double velMax){
            this.velMax = velMax;
        }
        
        public boolean getwifi (){
            return wifi;
        }
        
        public void setwifi (boolean wifi){
            this.wifi = wifi;
        }
}
