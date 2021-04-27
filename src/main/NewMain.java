/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import bidang2d.*;
import ruang3d.*;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran object1 = new Lingkaran(4);
        System.out.println("Jari-jari Lingkaran = 4");
        System.out.println("Luas lingkaran\t\t: "+ object1.hitungLuas());
        System.out.println("Keliling lingkaran\t: "+ object1.hitungKll());
        
        Bola bolamerah = new Bola(10);
        System.out.println("\n\nJari-jari Bola = 10");
        System.out.println("Luas bola\t: " + bolamerah.hitungLuas());
        System.out.println("Volume bola\t: " + bolamerah.hitungVolume());
        
        CincinBola object2 = new CincinBola(10, 5, 6, 3, 2);
        System.out.println("\n\tJari-jari Cincin Bola dasar = 2, atas = 3 | Tali Busur = 5 | Tinggi = 6 | ");
        System.out.println("\tLuas cincin bola\t: " + object2.hitungLuas());
        System.out.println("\tVolume cincin bola\t: " + object2.hitungVolume());        
        
        JuringBola object3 = new JuringBola(10, 7, 6);
        System.out.println("\n\tJari-jari Juring Bola dasar = 6 | Tinggi = 7 | ");
        System.out.println("\tLuas juring bola\t: " + object3.hitungLuas());
        System.out.println("\tVolume juring bola\t: " + object3.hitungVolume());    
        
        KeratanBola object4 = new KeratanBola(8, 10, 6, 4);
        System.out.println("\n\tJari-jari Keratan Bola dasar = 6, atas = 4 | Tinggi = 8 | ");
        System.out.println("\tLuas keratan bola\t: " + object4.hitungLuas());
        System.out.println("\tVolume keratan bola\t: " + object4.hitungVolume());    
        
        TemberengBola object5 = new TemberengBola(10, 6, 4, 3);
        System.out.println("\n\tJari-jari Tembereng Bola dasar = 4, atas = 3 | Tinggi = 6 | ");
        System.out.println("\tLuas tembereng bola\t: " + object4.hitungLuas());
        System.out.println("\tVolume tembereng bola\t: " + object4.hitungVolume());    
        
        Tabung tabung1 = new Tabung(2,9);
        System.out.println("\n\nJari-jari Tabung = 2 | Tinggi Tabung = 9");
        System.out.println("Luas tabung\t: "+tabung1.hitungLuas());
        System.out.println("Volume tabung\t: "+tabung1.hitungVolume());
        
        Kerucut kerucut1 = new Kerucut(2,2);
        System.out.println("\nJari-jari Kerucut = 9 | Tinggi Kerucut = 2");
        System.out.println("Luas kerucut\t: "+kerucut1.hitungLuas());
        System.out.println("Volume kerucut\t: "+kerucut1.hitungVolume());
        
    }
    
}
