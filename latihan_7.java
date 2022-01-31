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
public class latihan_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner masukan = new Scanner (System.in);
        System.out.println("silahkan pilih angka 1-3 : ");
        int bil = masukan.nextInt();
        switch (bil) {
            case 1 : System.out.println("satu");
              break;
            case 2 : System.out.println("dua");
            break;
            case 3 : System.out.println("tiga");
        }
    }
    
}
