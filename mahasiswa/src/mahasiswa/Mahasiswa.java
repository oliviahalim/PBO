/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.Scanner;

class siswa {
    String nama;
    String jurusan;
    String nim;
    
    void setnama(String namasiswa)
    {
        nama = namasiswa;
    }
    void setjurusan(String jurusansiswa)
    {
        jurusan = jurusansiswa;
    }
    void setnim(String nimsiswa)
    {
        nim = nimsiswa;
    }
    void cetak(){
        System.out.println ("Nama saya adalah " + nama + "Jurusan saya adalah " + jurusan + "dan nim saya adalah " + nim);
    }
}


/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        siswa a = new siswa();
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan nama : ");
        String nama = input.next();
        System.out.print("masukkan jurusan : ");
        String jurusan = input.next();
        System.out.print("masukkan nim : ");
        String nim = input.next();
        System.out.println("");
        
        System.out.println("Nama anda adalah : " + nama);
        System.out.println("Jurusan anda adalah : " + jurusan);
        System.out.println("Dan nim anda adalah : " + nim);
    }
    
}
