/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

/**
 *
 * @author ASUS
 */
public class Anime {

   String nama;
   String genre;
   int eps;
   String studio;
   String tanggal_liris;
   
   void setNilai(String nama, String genre, int eps, String studio){
       this.nama = nama;
       this.genre= genre;
       this.eps = eps;
       this.studio = studio;
       
   }
   void setNilai(String nama, String genre, int eps, String studio,String tanggal_liris){
       this.nama = nama;
       this.genre= genre;
       this.eps = eps;
       this.studio = studio;
       this.tanggal_liris= tanggal_liris;
       
   }
   void cetak(){
       System.out.println("Judul: "+nama);
       System.out.println("Genre: "+genre);
       System.out.println("Total Episode: "+eps);
       System.out.println("Studio: "+studio);
       System.out.println("Tanggal Liris: "+tanggal_liris+"\n");
       
   }

    public static void main(String[] args) {
       Anime x1;
       Anime x2;
       x1 = new Anime();
       x2 = new Anime();
       
       x1.setNilai("Kuroko no Basket","Comedy,School,Shounen,Sport",25,"6 Oct  2013");
       x2.setNilai("Shokugeki no Souma: Gou no Sara","shounen,school",13,"11 Apr 2020");
       x1.cetak();
       x2.cetak();
    }
    
}
