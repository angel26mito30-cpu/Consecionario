/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clasedeobjetos.consecionario;

/**
 *
 * @author angel
 */
public class Consecionario {

    public static void main(String[] args) {
        
        // Se usa el segundo constructor para crear un carro con marca, año, precio,cilindraje y número de puertas.
        Carros carro1 = new Carros ("hyunday", 2013, 80000000, 2500, 4);
        
        // Se usa tercer constructor para crear un carro con marca, precio y si es automático.
        Carros carro2 = new Carros ("Toyota", 64000000, true);
                
        // Se usa el primer constructor: para crear un carro con todos sus atributos.
        Carros carro3 = new Carros ("Ford", 2015, 40000000, true, 5, "corriente", 3000, true);
        
        //tercer comns
        Motos mato1 = new Motos ("Ducati", 48000000, "Deportiva", false);
        
        //primer const
        Motos moto2 = new Motos ("Suzuki", 2000, 12000000, false, 2, "Todoterreno", 102000, false);
        
        //segundo constr
        Motos moto3 = new Motos ("Yamaha", 2025, true, 0, 2);
        
        
        
        
        
        
        
        
        
    }
}

Productos produc1 = new Productos("Laptop Gamer", 101, 3500.0, true);