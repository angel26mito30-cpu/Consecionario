/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Camiones {
    
    private int numeroRuedas = 0;
    protected String carroceria = "";
    private double carga = 0;
    private boolean Camarote = true;
    
    public int getnumeroRuedas (){
        return numeroRuedas;
        
    }
    
    public void setnumeroRuedas (int numeroRuedas){
        this.numeroRuedas = numeroRuedas;
        
    }
    
    public String getcarroceria (){
        return carroceria;
        
    }
    
    public void setcaarroceria (String carroceria){
        this.carroceria = carroceria;
    }
    
    public double getcarga (){
        return carga;
    }
    
    public void setcarga (double carga){
        this.carga = carga;
        
    }
    
    public boolean getcamarote (){
        return camarote;
        
    }
    
    
    
    
}
