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
public class TemberengBola extends Bola{
    public double luasTB, volumeTB, rDasar, rAtas, tTB ;

    public TemberengBola(double r, double tTB, double rDasar, double rAtas) {
        super(r);
        this.tTB = tTB;
        this.rDasar = rDasar;
        this.luasTB = hitungLuas();
        this.volumeTB = hitungVolume();
    }
    
    @Override 
    public double hitungLuas(){
        return phi * (2 * r *tTB + Math.pow(rDasar,2));
    }
    
    @Override
    public double hitungVolume(){
        return phi * tTB * (3 * Math.pow(rDasar,2) + 3 * Math.pow(rAtas,2) + Math.pow(tTB,2));
    }
}
