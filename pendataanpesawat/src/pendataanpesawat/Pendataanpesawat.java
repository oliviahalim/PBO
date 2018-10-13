/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataanpesawat;

import java.io.IOException;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author ASUS
 */
public class Pendataanpesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String alamat,nama;
        int harga = 0;
        int bayar = 0;
        int kembalian;
        char idpesawat = 0;
        
        System.out.print("masukkan nama anda :");
        nama=input.next();
        System.out.print("masukkan alamat anda :");
        alamat=input.next();
        System.out.print("masukkan tipe pesawat :");
        try{
            idpesawat = (char)System.in.read();
        }catch(IOException D){
            System.out.println("id pesawat yang anda masukkan salah");
        }
       if (idpesawat == ('A')){
            harga = 5000000;
        }
       if (idpesawat == ('B')){
            harga = 2000000;
        }
       if (idpesawat == ('C')){
            harga = 1000000;
        }
       
       System.out.print("bayar = Rp. ");
       bayar = input.nextInt();
       if (bayar < harga){
           System.out.println("Uang anda tidak mencukupi");
       }else{
       
       kembalian = bayar - harga;
       
       System.out.println("atas nama :"+nama);
       System.out.println("alamat :"+alamat);
       System.out.println("kembalian : Rp. "+kembalian);

    }
}
}