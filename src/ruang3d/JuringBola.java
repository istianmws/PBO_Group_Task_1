/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

/**
 *
 * @author User
 */
public class JuringBola extends Bola{
    public double luas, volume, t, rDasar;
    
    public JuringBola(double r, double t, double rDasar){
        super(r);
        this.t = t;
        this.rDasar = rDasar;
        this.luas = hitungLuas();
        this.volume = hitungVolume(); 
    }
    
    public double hiungLuas(){
        return phi * r *(2*t + rDasar);
    }
    
    public double hitungVolume(){
        return (2/3.0) * phi * Math.pow(r,2) * t;
    }
}
