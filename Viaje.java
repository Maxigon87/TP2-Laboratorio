/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author NEXO-MAX
 */
public class Viaje {
        
    private final String origen;
    private final String destino;
    private final String tipoCombustible;
    private final Vehiculo vehiculo;
    private final int cantPeajes;
    private final boolean sobreMismaRuta;
    private float distanciaEntreCiudades;
    private final float costoPeajeChicos = 100;
    private final float costoPeajeGrandes = 150;
    private float kmOrigen;
    private float kmDestino;

    //Si estan sobre la misma ruta
    public Viaje(String origen, String destino, String tipoCombustible, Vehiculo vehiculo, int cantPeajes, float kmOrigen, float kmDestino) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCombustible = tipoCombustible;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        this.sobreMismaRuta = true;
        this.kmOrigen = kmOrigen;
        this.kmDestino = kmDestino;
    }
    // No estan sobre la misma ruta
    public Viaje(String origen, String destino, String tipoCombustible, Vehiculo vehiculo, int cantPeajes, float distanciaEntreCiudades) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCombustible = tipoCombustible;
        this.vehiculo = vehiculo;
        this.cantPeajes = cantPeajes;
        this.sobreMismaRuta = false;
        this.distanciaEntreCiudades = distanciaEntreCiudades;
    }
    
    public float calcDistancia(){
        if (sobreMismaRuta) {
            return kmDestino - kmOrigen;
        } else {
            return distanciaEntreCiudades;
        }
    }
    
    public float calcCostoPeajes() {
        if (vehiculo instanceof Auto || vehiculo instanceof Camioneta) {
            return costoPeajeChicos * cantPeajes;
        } else {
            return costoPeajeGrandes * cantPeajes;
        }
    }
    //diesel, nafta, gnc
    public float calcCostoCombustibles(){
        return 0;
    }
    
    public float calcCostoTotal(){
        return calcCostoPeajes();
    }
}
