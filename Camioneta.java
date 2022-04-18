/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author NEXO-MAX
 */
public class Camioneta extends Vehiculo {
    
    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    @Override
     public double calcCostoCombustibles(double distancia){
        
         return ((distancia *10) /100) * this.getCombustible().precioCombustible;
    }
    
}
