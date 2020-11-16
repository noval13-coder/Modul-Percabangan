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
public class nomor2 {
    public static void main(String[] args) {
        float uangPendapatan,uangYangAndaDapat1 = 0,uangYangAndaDapat2 = 0,uangYangAndaDapat3 = 0;
        System.out.println("\n ==== Menghitung Komisi Sales ==== \n");
         Scanner scan = new Scanner(System.in);
         System.out.print("Masukkan Uang Pendapatan Anda Hari ini = ");
         uangPendapatan = scan.nextInt();
         
          if ( uangPendapatan == 200000 ) {
            uangYangAndaDapat1 = 10000+((10*uangPendapatan)/100);
            System.out.println("Komisi anda hari ini adalah "+uangYangAndaDapat1);
            } else if ( uangPendapatan >= 200000 && uangPendapatan <=500000 ){
            uangYangAndaDapat2 = 20000+((15*uangPendapatan)/100);
            System.out.println("Komisi anda hari ini adalah "+uangYangAndaDapat2);
             } else if ( uangPendapatan >= 500000 ){
            uangYangAndaDapat3 = 30000+((20*uangPendapatan)/100);
            System.out.println("Komisi anda hari ini adalah "+uangYangAndaDapat3);
             }else 
            System.out.println("Sales Tidak mendapat komisi");  
        } 
}
