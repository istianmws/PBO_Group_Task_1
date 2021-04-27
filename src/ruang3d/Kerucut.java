/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3d;

import bidang2d.Lingkaran;

/**
 *
 * @author User
 */
public class Kerucut extends Lingkaran{
    double tKerucut, luasKerucut, volumeKerucut;

    public Kerucut(double r, double tKerucut) {
        super(r);
        this.tKerucut = tKerucut;
        this.luasKerucut = hitungLuas();
        this.volumeKerucut = hitungVolume();
    }
    
    public double hitungApotema(){
        return Math.sqrt( Math.pow(r,2) + Math.pow(tKerucut,2) );
    }
    
    @Override
    public double hitungLuas(){
        return  super.luas + (phi * r * hitungApotema());
    }
    
    public double hitungVolume(){
        return super.luas * tKerucut / 3;
    }
    
   
}
