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
    private double cargaToneladas = 0;
    private boolean camarote = true;
    
    public Camiones (String marca, int año, double precio, boolean disponible, 
           int numeroEjes, String carroceria, double cargaToneladas, boolean camarote){
        
        super (marca, año, precio, disponible);
            this.numeroEjes = numeroEjes;
            this.carroceria = carroceria;
            this.cargaToneladas = cargaToneladas;
            this.camarote = camarote;
        }
        
        public Camiones (int año, double precio, int numeroEjes, double cargaToneladas, boolean camarote){
            
            super (año, precio);
                this.numeroEjes = numeroEjes;
                this.carroceria = "Estacas";
                this.cargaToneladas = cargaToneladas;
                this.camarote = camarote;        
        }
        
        public Camiones (String marca, int año, double precio, boolean disponible, int numeroEjes, String carroceria){
            
            super (marca, año, precio, disponible);
                this.numeroEjes = numeroEjes;
                this.carroceria = carroceria;
                this.cargaToneladas = cargaToneladas;
                this.camarote = true;
        }
    
        public int getnumeroEjes (){
            return numeroEjes;
        }
        
        public void setnumeroEjes (int numeroEjes){
            this.numeroEjes = numeroEjes;
        }
        
        public String getcarroceria (){
            return carroceria;
        }
        
        public void setcarroceria (String carroceria){
            this.carroceria = carroceria;
        }
        
        public double getcargaToneladas (){
            return cargaToneladas;
        }
        
        public void setcargaToneladas ( double cargaToneladas){
            this.cargaToneladas = cargaToneladas;
        }
        
        public boolean getcamarote (){
            return camarote;
        }
        
        public void setcamarote (boolean camarote){
            this.camarote = camarote;
        }
}
