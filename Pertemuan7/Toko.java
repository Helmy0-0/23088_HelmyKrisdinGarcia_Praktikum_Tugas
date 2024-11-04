/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;
import java.util.Scanner;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class Toko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kodeBarang = new String[10];
        String[] namaBarang = new String[10];
        int[] hargaBarang = new int[10];
        int[] jumlahBeli = new int[10];
        int[] jumlahBayar = new int[10];
        initializeData(kodeBarang, namaBarang, hargaBarang);
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan Item Barang : ");
        int jumlahItem = input.nextInt();
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode       : ");
            String kode = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
            
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j] != null && kodeBarang[j].equals(kode)) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    break;
                }
            }
        }
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("********************");
        System.out.println("No  Kode Barang  Nama Barang  Harga    Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");
        
         int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            String kode = "";
            String nama = "";
            int harga = 0;
            
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j] != null && kodeBarang[j].equals(kode)) {
                    kode = kodeBarang[j];
                    nama = namaBarang[j];
                    harga = hargaBarang[j];
                    break;
                }
            }
            System.out.printf("%-4d%-12s%-12s%-9d%-12d%-12d\n",
                    (i + 1), kode, nama, harga, jumlahBeli[i], jumlahBayar[i]);
            
            totalBayar += jumlahBayar[i];
        }
        System.out.println("==============================================================");
        System.out.println("Total Bayar" + "                                      " + totalBayar);
        System.out.println("==============================================================");
        
        input.close();
    }
     private static void initializeData(String[] kodeBarang, String[] namaBarang, int[] hargaBarang) {
        kodeBarang[0] = "a001";
        namaBarang[0] = "Buku";
        hargaBarang[0] = 3000;
        
        kodeBarang[1] = "a002";
        namaBarang[1] = "Pensil";
        hargaBarang[1] = 4000;
        
        kodeBarang[2] = "a003";
        namaBarang[2] = "Pulpen";
        hargaBarang[2] = 5000;
     }
}
