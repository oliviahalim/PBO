/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmbyrnpln;

/**
 *
 * @author ASUS
 */
public class hitung extends input {
    protected String nama,alamat;
    protected int bayar = 0;
    protected int kembalian,harga;
    
    public hitung(String nama,String alamat,String blok,char tipe){
        this.nama=nama;
        this.alamat=alamat;
        this.harga=getHarga(blok,tipe);
        
    }
    public void cetakKembalian(int bayar){
        kembalian=bayar-harga;
        System.out.println("Kembalian = " + kembalian);
        
    }
    public void input(int bayar){
        if (bayar<harga){
            System.out.println("uang anda kurang");
            System.exit(0);
        }
        else {
            cetakKembalian(bayar);
        }
    }
}

