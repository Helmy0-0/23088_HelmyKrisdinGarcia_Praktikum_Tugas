/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Balok extends BangRung{

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }
    @Override
    public double LP(){
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
