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
public class latihan_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("masukan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i=1; i<=batas; i++)
            hasil += i;
        System.out.println("total jumlahnya adalah : " + hasil);
        
    }
    
}
