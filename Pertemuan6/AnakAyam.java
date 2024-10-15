/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;



/**
 *
 * @author Helmy Krisdin Garcia
 */
public class AnakAyam {
    public static void main(String[] args) {
        for (int n = 20; n > 0; n--) {
            if (n > 1) {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            } else {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
            }
        }
    }
}

