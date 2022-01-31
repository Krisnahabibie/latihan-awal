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
public class latihan_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int a=0, total=0,bil=7;
        while (bil!=0)  {
            a++;
            System.out.println("masukan bilangan ke- "+a+" : ");
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.println("total jumlah "+(a-1)+"bilangan : ");
        System.out.println(total);
    }
    
}
