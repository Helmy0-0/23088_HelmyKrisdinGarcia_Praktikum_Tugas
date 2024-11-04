/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan8;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class HitungHari {
    public int hitung(int tahun, String bulan) {
        int jumlahHari = 0;
        
        switch(bulan.toLowerCase()) {
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":
            case "desember":
                jumlahHari = 31;
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                jumlahHari = 30;
                break;
            case "februari":
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
        }
        
        return jumlahHari;
    }
}
