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
public class KeratanBola extends Bola{
    public double luas, volume, t, rDasar, rAtas;
    
    public KeratanBola(double t, double r, double rDasar, double rAtas){
        super(r);
        this.t = t;
        this.rAtas = rAtas;
        this.rDasar = rDasar;
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }
    
    public double hitungLuas(){
        return phi * 2 *(r * t + Math.pow(rDasar,2) + Math.pow(rAtas,2));
    }
    
    public double hitungVolume(){
        return 1/2.0 *( phi * Math.pow(rDasar,2) + Math.pow(rAtas,2) + phi * Math.pow(t,3)/3);
    }
}
