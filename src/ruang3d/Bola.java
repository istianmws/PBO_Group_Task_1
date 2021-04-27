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
public class Bola extends Lingkaran{
    public double luas, volume;
    
    public Bola(double r){
        super(r);
        this.luas = hitungLuas();
        this.volume = hitungVolume();
    }
    
    @Override
    public double hitungLuas() {
        return (4) * super.hitungLuas();
    }

    public double hitungVolume() {
        return (4 / 3.0) * super.hitungLuas()* r;
    }
}
