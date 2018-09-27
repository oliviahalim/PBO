/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int jam;
    int menit;
    int detik;
    int totdet;
    
    System.out.print("Input Jam : ");
    jam = input.nextInt();
    System.out.print("Input Menit : ");
    menit =input.nextInt();
    System.out.print("Input Detik : ");
    detik =input.nextInt();
    
    totdet = (jam*3600)+(menit*60)+detik;
    
    System.out.println(jam + " Jam " + menit + " Menit="+ detik + " Detik =" + totdet + " Detik");
    }
    
}
