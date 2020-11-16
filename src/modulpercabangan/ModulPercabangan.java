/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpercabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ModulPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String identitas = "Noval Akbar Ramadhany/ X RPL 3/28";
        System.out.println("Identitas : "+identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Bahan Pertama : ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Pilih Nomor untuk bahan pertama : ");
        int bahan1 = scan.nextInt();
        
          if(bahan1 == 1 || bahan1 == 2){
        
         if(bahan1 == 1){
             System.out.println("1. Susu");
             System.out.println("2. Minyak Goreng");
             System.out.println("3. Tidak Tersedia");
        }else{
             System.out.println("1. Minyak Goreng");
             System.out.println("2. Roti");
             System.out.println("3. Tidak Tersedia");
        }
          }else{
            System.out.println("Mohon maaf pilihan anda tidak dapat ditemukan, " + " tidak dapat memberikan saran resep");
        }
      System.out.print("Pilih nomor untuk bahan kedua: ");
      int bahan2 = scan.nextInt();
     if(bahan2 >= 1 && bahan2 <= 3){
         if(bahan1==1){
             switch(bahan2){
                 case 1:
                     System.out.println("Anda dapat membuat milk shake banana");break;
                 case 2:
                     System.out.println("Anda dapat membuat pisang goreng");break;
                 case 3:
                     System.out.println("Anda dapat membuat pisang rebus");
                 
             }
         }else{
             switch(bahan2){
                 case 1:
                     System.out.println("Anda dapat membuat telur mata sapi");break;
                 case 2:
                     System.out.println("Anda dapat membuat sandwich telur");break;
                 case 3:
                     System.out.println("Anda dapat membuat telur rebus");
             }
         }
        
        }else{
         System.out.println("Mohon maaf pilihan tidak ditemukan" + "tidak dapat memberikan saran resep");
     }
    }   
    }
    
    

