/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

import java.util.Scanner;

public class Diskon{
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Total Pembelian = Rp.");
        double tb = inp.nextDouble();
        double dis;
        if (tb < 50000 && tb > 0){
            dis = 0.05;
        }
        else {
            dis = 0.20;
        }
        double p = tb*dis;
        double hargafinal = tb-p;
        System.out.println("Besarnya Potongan = Rp."+p);
        System.out.println("Jumlah yang harus dibayar = Rp."+hargafinal);

    }
}
