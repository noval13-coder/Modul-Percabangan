/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nomor3 {
     public static void main(String[] args) {
       int angka;
        System.out.println("\nProgram Barang");
        
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Pilih dengan mengetikkan angka dibawah");
        angka = scan.nextInt();
        
       
       switch(angka){
    case 1:
        System.out.println("Alat Olahraga");
        break;
    case 2:
        System.out.println("Alat Elektronik");
        break;
    case 3:
        System.out.println("Alat Masak");
        break;
    default:
        System.out.println("Anda salah memasukkan kode");
        break;
    
       }
    }
}
