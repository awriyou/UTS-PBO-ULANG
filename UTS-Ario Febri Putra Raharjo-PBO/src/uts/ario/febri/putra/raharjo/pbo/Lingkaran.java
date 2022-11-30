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
public class Lingkaran {
        // atribut
    private int jari_jari;
    private double luas;
     
    // setter method untuk jejari
    public void setJari_jari(int r){
        if (r > 0){
            this.jari_jari = r;
        } else {
            this.jari_jari = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = Math.PI * Math.pow(this.jari_jari, 2);
        return this.luas;
    }
}
