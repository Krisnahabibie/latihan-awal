/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_modul;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class latihan_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("masukan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.println("masukan nilai bahasa inggris :");
        int BahasaInggris = masukan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println("siswa dapat beasiswa");
        else
            System.out.println("siswa tidak dapat beasiswa");
        
    }
    
}
