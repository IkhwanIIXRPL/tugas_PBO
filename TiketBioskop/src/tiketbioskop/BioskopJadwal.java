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
public class BioskopJadwal {
    public static void main(String[] args){
        KelasBioskop kb=new KelasBioskop ();
        
        System.out.println("Deskripsi konser;");
        kb.judul ("Demon Slayer:Kimetsu no Yaiba The Movie:mugen Train");
        kb.tempat_duduk("VVIP");
        kb.harga(599000);
        kb.pembelian(1);
        
    }
}
