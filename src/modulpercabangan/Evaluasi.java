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
public class Evaluasi {
    public static void main(String[] args) {
String identitas = "Noval AKbar Ramadhany/28/XRPL3";
        System.out.println("Identitas = "+identitas);
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, harap berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu tidak ditemukan!");
        }
    }

}
