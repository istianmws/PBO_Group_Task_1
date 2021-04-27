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
public class Tabung extends Lingkaran{
    double tTabung, luasTabung, volumeTabung;

    public Tabung(double r, double tTabung) {
        super(r);
        this.tTabung = tTabung;
        this.luasTabung = hitungLuas();
        this.volumeTabung = hitungVolume();
    }
    
    @Override
    public double hitungLuas(){
        return super.kll * (r+ tTabung);
    }
    
    public double hitungVolume(){
        return super.luas * tTabung;
    }
}
