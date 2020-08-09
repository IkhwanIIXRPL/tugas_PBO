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
public class Manga {
    private String nama;
    private String  karya;
   
    public Manga(String nama,String karya){
        this.nama = nama;
        this.karya = karya;
        System.out.println("Inisialisasi Atribut");
    }
    void arti (){
        System.out.println("Manga adalah komik atau novel grafik yang dibuat di jepang atau menggunakan bahasa jepang");
    }
    void mangaka (){
        System.out.println("mangaka adalah istilah bahasa jepang untuk orang yang menggambar manga");
    }
 void tampilData(){
     System.out.println("nama :"+this.nama);
     System.out.println("karya :"+this.karya);
 }   
} 


