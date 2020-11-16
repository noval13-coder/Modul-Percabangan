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
public class nomor1 {
    public static void main(String[] args) {
        int tas,sepatu,seragam,paketAlatTulis;
    Double harga_tas,harga_sepatu,harga_seragam,harga_paketAlatTulis;
    Double totalhargatas,totalhargasepatu,totalhargaseragam,totalhargapaketAlatTulis;
    Double total,bayar,kembalian;
    Double totalsetelahdiskon,totaltidakdiskon;
    
    harga_tas = 20000.0;
    harga_sepatu = 35000.0;
    harga_seragam = 150000.0;
    harga_paketAlatTulis = 50000.0;
    
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan Jumalah Tas Yang dibeli = ");
    tas = scan.nextInt();
    totalhargatas = tas*harga_tas;
    System.out.println("Total Harga Tas yang dibeli = "+totalhargatas+"\n");
    
   
    System.out.print("Masukkan Jumalah sepatu Yang dibeli = ");
    sepatu = scan.nextInt();
    totalhargasepatu = sepatu*harga_sepatu;
    System.out.println("Total Harga Sepatu yang dibeli = "+totalhargasepatu+"\n");
    
    System.out.print("Masukkan Jumalah Seragam Yang dibeli = ");
    seragam = scan.nextInt();
    totalhargaseragam = seragam*harga_seragam;
    System.out.println("Total Harga seragam yang dibeli = "+totalhargaseragam+"\n");
    
    System.out.print("Masukkan Jumalah Paket Alat Tulis Yang dibeli= ");
    paketAlatTulis = scan.nextInt();
    totalhargapaketAlatTulis = paketAlatTulis*harga_paketAlatTulis;
    System.out.println("Total Harga Paket Alat Tulis yang dibeli = "+totalhargapaketAlatTulis+"\n");
    
    total = totalhargatas + totalhargasepatu + totalhargaseragam + totalhargapaketAlatTulis;
    System.out.println("Total Uang yang harus dibayarkan = "+total);
    
    if( total >= 50000.0 ) {
        totalsetelahdiskon = (total*80)/100;
            System.out.println("Total Pembayaran = "+totalsetelahdiskon);
        } else{
            System.out.println(total);
        }
    
        
       
    }

}
