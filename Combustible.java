/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author NEXO-MAX
 */
public class Combustible {
    String tipoCombustible;
    double precioCombustible;

    public Combustible(String tipoCombustible, double precioCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.precioCombustible = precioCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }
    
    public void setPrecioCombustible(double precioCombustible){
        this.precioCombustible = precioCombustible;
    }

   
     
    
     
}
