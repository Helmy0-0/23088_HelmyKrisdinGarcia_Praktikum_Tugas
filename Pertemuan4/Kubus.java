/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Kubus extends BangRung {
    public Kubus(double sisi){
        super(sisi, sisi, sisi);
    }
    
    @Override
    public double LP(){
        return 6*Math.pow(panjang, 2);
    }
}
    
