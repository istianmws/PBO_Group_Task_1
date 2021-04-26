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
    
    @Override
    public void countKll(){
        kll = phi * 2 * r;
    }

    @Override
    public void countLuas(){
        luas = phi * r * r;
    }
}
