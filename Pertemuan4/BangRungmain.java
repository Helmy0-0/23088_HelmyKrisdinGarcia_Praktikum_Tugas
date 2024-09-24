/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class BangRungmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangRung Balok = new Balok (4, 2, 3);
        BangRung Kubus =  new Kubus (5);
        
        System.out.println("Volume Balok: "+Balok.Volume());
        System.out.println("Luas Permukaan Balok: "+Balok.LP());
        
        System.out.println("Volume Kubus: "+Kubus.Volume());
        System.out.println("Luas Permukaan Kubus: "+Kubus.LP());
        
    }
    
}
