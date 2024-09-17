/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        double celcius = 25;
        System.out.println("Celsius to Fahrenheit: " + konversi.celciusToFahrenheit(celcius));
        System.out.println("Celsius to Reamur: " + konversi.celciusToReamur(celcius));
        double fahrenheit = 77;
        System.out.println("Fahrenheit to Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
    }
}

