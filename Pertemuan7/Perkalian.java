/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            if(i>0){
                System.out.print(i+"\t");
            }else{
                System.out.print("\t");
            }
        }
        System.out.println();
        for(int i=1; i<6; i++){
            System.out.print(i+"\t");
            for(int j=1; j<6; j++){
                System.out.print((i*j)+"\t");
                }
                System.out.println();
            }
        }

    }
    

