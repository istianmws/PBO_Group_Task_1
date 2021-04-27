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
public class Kerucut_Terpancung extends Kerucut{
    public double rAtas, luasKerucutTerpancung, volumeKerucutTerpancung;
    
    public Kerucut_Terpancung(double r, double tKerucut, double rAtas) {
        super(r, tKerucut);
        this.rAtas = rAtas;
        this.luasKerucutTerpancung = hitungLuas();
        this.volumeKerucutTerpancung = hitungVolume();
    }
    
    @Override
    public double hitungApotema(){
        return Math.sqrt(Math.pow(r-rAtas,2) + Math.pow(tKerucut,2));
    }
    
    @Override
    public double hitungLuas(){
        return phi * (Math.pow(r,2) + r * hitungApotema());
    }
    
    @Override
    public double hitungVolume(){
        return phi * tKerucut * (Math.pow(r,2) * Math.pow(rAtas,2) + r*rAtas) / 3;
    }
}
