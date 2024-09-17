/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Nilai {
    String nim;
    String nama;
    int absen;
    int tugas;
    int uts;
    int uas;
    int akhir;
    
    
    void info(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Nilai Absen[10%]: "+absen);
        System.out.println("Nilai Tugas[20%]: "+tugas);
        System.out.println("Nilai UTS[30%]: "+uts);
        System.out.println(uas+"Nilai UAS[40%]: ");
        System.out.println("Nilai Akhir: "+akhir);
    }
    
}
