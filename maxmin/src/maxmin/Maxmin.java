/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Maxmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int o,l,a,v,i,max,min;
        
        System.out.print("nilai o : ");
        o = input.nextInt();
        
        System.out.print("nilai l : ");
        l = input.nextInt();
        
        System.out.print("nilai i : ");
        i = input.nextInt();
        
        System.out.print("nilai v :");
        v = input.nextInt();
        
        System.out.print("nilai a : ");
        a = input.nextInt();
        
        max = o;
        min = o;
        
        if (l > max)
            max = l;
        else if (l < min)
            min = l;
        if (i > max)
            max = i;
        else if (i < min)
            min = i;
        if (v > max)
            max = v;
        else if (v < min)
            min = v;
        if (a > max)
            max = a;
        else if (a < min)
            min = a;
        
        System.out.println("Nilai max = "+max+"\nNilai min = "+min);
        
    }
    
}
