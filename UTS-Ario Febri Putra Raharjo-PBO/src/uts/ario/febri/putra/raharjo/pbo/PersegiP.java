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
public class PersegiP {
    
    private int p;
    private int l;
    private double luas;
     
    //fungsi set p
    public void setPanjang(int p){
        if (p > 0){
            this.p = p;
        } else {
            this.p = 0;
        }
    }
     
    // setter method untuk lebar
    public void setLebar(int l){
        if (l > 0){
            this.l = l;
        } else {
            this.l = 0;
        }
    }
     
    // getter method untuk luas
    public double getLuas(){
        // hitung luasnya
        this.luas = this.p * this.l;
        return this.luas;
    }
}
