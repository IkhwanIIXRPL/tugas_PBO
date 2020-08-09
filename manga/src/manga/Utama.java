/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manga;

/**
 *
 * @author ASUS
 */
public class Utama {
    public static void main(String[] args){
        String nama = "Naruto";
        String karya = "Masashi Kishimoto";
        
        Manga manga = new Manga(nama, karya);
        manga.arti();
        manga.mangaka();
        manga.tampilData();
    }
}
