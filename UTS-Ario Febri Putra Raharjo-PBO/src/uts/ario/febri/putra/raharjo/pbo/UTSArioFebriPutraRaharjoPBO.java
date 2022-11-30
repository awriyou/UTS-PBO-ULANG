/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts.ario.febri.putra.raharjo.pbo;

/**
 *
 * @author febri
 */
public class UTSArioFebriPutraRaharjoPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Luas PP
        PersegiP pp = new PersegiP();
        pp.setPanjang(12);
        pp.setLebar(7);
        double luaspp = pp.getLuas();
         
        // Luas setengah lingkaran 
        Lingkaran l1 = new Lingkaran();
        l1.setJari_jari(5);
        double luasl = 0.5 * l1.getLuas();
         
        // hitung luas daerah diarsir
        double luasArsir =  luaspp - luasl;
        System.out.println("Luas Area yang diarsir: " + luasArsir + " cm^2");
    }
    
}
