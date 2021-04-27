/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2d;

/**
 *
 * @author User
 */
public class Lingkaran implements Bidang2d{
    public double r , kll , luas ;
    
    public Lingkaran(double r){
        this.r = r;
        this.kll = hitungKll();
        this.luas = hitungLuas();
    }
    
    @Override
    public double hitungKll(){
        return phi * 2 * r; 
    }

    @Override
    public double hitungLuas(){
        return phi * r * r;
    }
}
