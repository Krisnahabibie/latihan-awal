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
public class latihan_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int nilai;
        System.out.println("masukkan nilai akhir PBO : ");
        nilai = masukan.nextInt();
        if (nilai < 70)
            System.out.println("siswa tidak lulus");
        if (nilai > 70)
            System.out.println("siswa lulus");
    }
    
}
