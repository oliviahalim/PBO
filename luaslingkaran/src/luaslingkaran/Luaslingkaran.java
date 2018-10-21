/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaran;
import java.util.Scanner;
class lingkaran{
    int jari;
}

/**
 *
 * @author ASUS
 */
public class Luaslingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int luas;
        lingkaran a = new lingkaran ();
        Scanner input = new Scanner(System.in);
        System.out.println("Jari-jari lingakaran : ");
        int jari = input.nextInt();
        
        luas = (int) (3.14 * (jari*jari));
        System.out.println("luas lingkaran : "+ luas);
    }
    
}
