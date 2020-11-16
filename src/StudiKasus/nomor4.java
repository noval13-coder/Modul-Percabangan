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
public class nomor4 {
    public static void main(String[] args) {
       String grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Nilai Anda : ");
        int nilai = scan.nextInt();
        
        if (nilai <=100 && nilai >= 0){
            
        }
        if ( nilai >= 90  ) {
            grade = "(A) Selamat, pertahankan prestasimu!";
            } else if ( nilai >= 80  ){
            grade = "(B+) Selamat, tingkatkan belajarmu!";
             } else if ( nilai >= 70 ){
            grade = "(B) Selamat, Tingkatkan belajarmu dan kurangi bermain!";
            } else{
                 grade = "F";
             }
        System.out.println("Grade = "+grade);
    }

}
