/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranpln;

import java.util.Scanner;
class bayar {
        
        int harga =0;
         int bayar ;
        String blok,nama,alamat,tipe;  
}

/**
 *
 * @author ASUS
 */
public class Pembayaranpln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kembalian = 0;
        bayar a = new bayar();
       Scanner input = new Scanner(System.in);
        
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
        
        if ((tipe.equals("36")) && (blok.equals("a"))){
            a.harga = 500000;
        }
        else if ((tipe.equals("36")) || (blok.equals("b"))){
           a.harga = 300000;
        }
        else if ((tipe.equals("37")) || (blok.equals("a"))){
           a.harga = 800000;
        }
        else if ((tipe.equals("37")) || (blok.equals("b"))){
           a.harga = 600000;
        }
        kembalian = (bayar-a.harga);
        System.out.println("nama : "+ nama);
        System.out.println("alamat : "+ alamat);
        System.out.println("harga : "+  a.harga);
        System.out.println("bayar : "+ bayar);
        
        System.out.println("kembalian : "+ kembalian);
        System.out.println();
    }
    
}
