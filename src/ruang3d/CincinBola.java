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
public class CincinBola extends Bola{
    public double luas, volume, pTaliBusur, t, rAtas, rDasar;
    
    public CincinBola(double r, double pTaliBusur, double t, double rAtas, double rDasar){
        super(r);
        this.pTaliBusur = pTaliBusur;
        this.t = t;
        this.rAtas = rAtas;
        this.rDasar = rDasar;
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }
    
    @Override
    public double hitungLuas(){
        double lLuar = 2 * phi * r * t;
        double lDalam = phi * pTaliBusur * (rDasar + rAtas);
        return lLuar + lDalam;
    }
    
    @Override
    public double hitungVolume(){
        return (phi * t * Math.pow(pTaliBusur,2))/6;
    }
}
