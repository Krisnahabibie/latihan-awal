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
public class latihan_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner masukan = new Scanner (System.in);
        System.out.println("masukkan nilai WEB : ");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
            System.out.println("nilai a");
        else if (nilai >= 75)
            System.out.println("nilai b");
        else if (nilai >=50)
            System.out.println("nilai c");
        else if (nilai >=35)
            System.out.println("nilai d");
        else 
            System.out.println("nilai e");
    }
    
}
