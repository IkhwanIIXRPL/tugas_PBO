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
public class KelasBioskop extends TiketBioskop {
    String tempat_duduk;
    int pembelian;
    
    public void tempat_duduk (String td)
    {
        tempat_duduk=td;
        System.out.println("urutan temat duduk = "+tempat_duduk);
    }
    public void pembelian (int pn)
    {
        pembelian =pn;
        System.out.println("Pembelian Tiket = "+pembelian);
    }
}
