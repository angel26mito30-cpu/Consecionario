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
                
        // Se usa el primer constructor para crear un carro con todos sus atributos.
        Carros carro3 = new Carros ("Ford", 2015, 40000000, true, 5, "corriente", 3000, true);
        
        //Usamos el tercer constructor para crear una moto con marca, oprecio, tipo de moto y si es elctrica
        Motos mato1 = new Motos ("Ducati", 48000000, "Deportiva", false);
        
        //Usamos primer constrcutor para crear otra moto con la marca,año,precio, si esta disponible,llantas, tipo de moto, kilometraje y si es electrica
        Motos moto2 = new Motos ("Suzuki", 2000, 12000000, false, 2, "Todoterreno", 102000, false);
        
        //el segundo constrcutor para crear la ultima moto con marca,año,disponible y numero de llantas
        Motos moto3 = new Motos ("Yamaha", 2025, true, 0, 2);
        
        //Creamos un camion con el primer constructor que contiene todos los atributos
        Camiones camion1 = new Camiones ("Mercedes", 2010, 130000000, true, 3, "Estacas", 20, false);
        
        //Usamos el segundo constructor para crear un segundo camion con año, precio, numro de ejes, toneladas y si tiene camarote
        Camiones camion2 = new Camiones (2026, 72000000, 2, 12, false);
        
        //Con el tercer constrcutro creamos el ultimo camion con marca, año, precio, si esta disponible, numero de ejes y carroceria
        Camiones camion3 = new Camiones ("kenworth", 2019, 60000000, true, 4, "Volqueta ");
        
        
        
        
        
        
        
        
        
        
    }
}

Productos produc1 = new Productos("Laptop Gamer", 101, 3500.0, true);