/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;

public class IMT {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("TB(cm): ");
        float tb = inp.nextFloat();
        System.out.print("BB(kg): ");
        float bb = inp.nextFloat();
        float tbm = tb/100;
        float imt = bb / (tbm * tbm);
        String hasil;
        if (imt <= 18.4){
            hasil = "BeratBadanKurang";
        }
        else if (imt >= 18.5 && imt <= 24.9){
            hasil = "BeratBadanIdeal";
        }
        else if (imt >= 25 && imt <= 29.9){
            hasil = "BeratBadanLebih";
        }
        else if (imt >= 30 && imt <= 39.9){
            hasil = "BeratBadanGemuk";
        }
        else {
            hasil = "SangatGemuk";
        }
        System.out.println("IMT: " + imt + " Kriteria: " + hasil);
    }

}
