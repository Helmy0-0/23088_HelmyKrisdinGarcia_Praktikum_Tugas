/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

public class Prima {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

