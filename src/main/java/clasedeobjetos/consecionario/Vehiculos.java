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
    
    public Vehiculos(String marca, int año, double precio) {

        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    public Vehiculos(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }
    
    public Vehiculos (String marca, int año, boolean disponible){
        this.marca = marca;
        this.año = año;
        this.disponible = disponible;
    }
    
    public Vehiculos (int año, double precio){
        this.año = año;
        this.precio = precio;
    }
    
    public Vehiculos (double precio, boolean disponible){
        this.precio = precio;
        this.disponible = disponible;
    }
    
    public String getmarca (){
            return marca;
        }
        
        public void setmarca (String marca){
            this.marca = marca;
        }
        
        public int getaño (){
            return año;
        }
        
        public void setaño (int año){
            this.año = año;
        }
        
        public double getprecio (){
            return precio;
        }
        
        public void setprecio ( double precio){
            this.precio = precio;
        }
        
        public boolean getdisponible (){
            return disponible;
        }
        
        public void setdisponible (boolean disponible){
            this.disponible = disponible;
        }
        
}


