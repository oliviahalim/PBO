/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

/**
 *
 * @author ASUS
 */
public class bola extends jari{
    protected int jari;
    protected int vol;
    
    public bola(int jari,int vol){
        super (jari);
        this.jari = jari;
    }
    
    public void TampilJari(){
        System.out.println("Jari-jari : " + jari);
    }
    
    public int getVolume(){
        vol = (int) ((4*3.14*jari*jari*jari)/3);
        System.out.println("Volume bola : "+ vol);
        return 0;
    }
    
}
