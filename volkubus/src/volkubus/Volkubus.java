/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volkubus;
import java.util.Scanner;
class volume {
    int sisi;
}

/**
 *
 * @author ASUS
 */
public class Volkubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int volume;
        volume a;
        a = new volume();
        Scanner input = new Scanner(System.in);
        System.out.println("nilai sisi kubus : ");
        int sisi = input.nextInt();
        
        volume = (sisi*sisi*sisi);
        System.out.println("hasil : " + volume);
    }
    
}
