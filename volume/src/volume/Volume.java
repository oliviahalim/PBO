/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jari;
        int vol = 0;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai jari-jari : ");
        jari = input.nextInt();
        
        bola volbola = new bola(jari,vol);
        
        volbola.TampilJari();
        volbola.getVolume();
    }
    
}
