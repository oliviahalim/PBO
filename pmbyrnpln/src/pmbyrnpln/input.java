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
public class input {
    int harga;
     public int getHarga(String blok,char tipe){
         if ("36".equals(tipe) || blok==("A")){
             harga = 500000;
     }
         else if ("36".equals(tipe) || blok=="B"){
             harga = 300000;
     }
         else if ("37".equals(tipe) || blok=="A"){
             harga = 800000;
                 }
         else if ("37".equals(tipe) || blok=="B"){
             harga = 600000;
                 }
         else{
             System.out.println("Tipe tidak ada");
             System.exit(0);
         }
         return harga;
     }
}
