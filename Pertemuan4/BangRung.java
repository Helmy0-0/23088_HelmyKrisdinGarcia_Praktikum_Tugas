/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class BangRung {
    double panjang, lebar, tinggi;
    
    public BangRung(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double Volume (){
        return panjang*lebar*tinggi;
    }
    public double LP(){
        return 0;
    }
}
