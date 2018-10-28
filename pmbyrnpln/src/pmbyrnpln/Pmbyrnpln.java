/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmbyrnpln;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pmbyrnpln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        input a = new input();
        String namaa,alamatt,blokk;
        char tipee;
        int hargaa;
        System.out.print("Masukkan nama : ");
        String nama = input.next();
        System.out.print("Masukkan alamat : ");
        String alamat = input.next();
        System.out.print("Masukkan tipe : ");
        String tipe = input.next();
        System.out.print("Masukkan blok : ");
        String blok = input.next();
        System.out.print("Masukkan jumlah bayar :");
        int bayar = input.nextInt();
        System.out.print("Harga :");
        int harga = 0;
        int kembalian = (int) bayar-harga;
        System.out.println("nama : "+ nama);
        System.out.println("alamat : "+ alamat);
        System.out.println("harga : "+  harga);
        System.out.println("bayar : "+ bayar);
        
        System.out.println("kembalian : "+ kembalian);
        System.out.println();
    }
    
}
