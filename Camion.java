/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author NEXO-MAX
 */
public class Camion extends Vehiculo {
    
    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    /**
     *
     * @param distancia
     * @return
     */
    @Override
     public double calcCostoCombustibles(double distancia){
        
         return ((distancia *12) /100) * this.getCombustible().precioCombustible;
    }
}
