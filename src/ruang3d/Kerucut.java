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
    double tkerucut, luaskerucut, volumekerucut, sisimiring;
    
    public void countApotema(){
        sisimiring = Math.sqrt( Math.pow(r,2) + Math.pow(tkerucut,2) );
    }
    @Override
    public void countLuas(){
        luaskerucut = super.luas + (phi * r * sisimiring);
    }
    
    public void countVolume(){
        volumekerucut = super.luas * tkerucut / 3;
    }
}
