/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

/**
 *
 * @author ASUS
 */
public class TiketBioskop {

    String judul;
    int harga;
    
    void judul (String jl)
    {
        judul=jl;
        System.out.println("tiket bioskop = "+judul);
    }
    void harga (int hg)
    {
        harga=hg;
        System.out.println("harga tiket = "+harga);
    }
    
}
