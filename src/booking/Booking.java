/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.util.Scanner;

/**
 *
 * @author halimtuhu
 */
public class Booking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //array 
       String[] film = {"Doraemon", "Spongebob", "Boboboy", "Upin Ipin", "Bapak yang Tertukar"};
       int[] harga = {5000, 4000, 1000, 500, 3000};
       
       System.out.println("Selamat Datang X RPL 2");
       System.out.println("List Tiket");
       
        //perulangan
       for (int i = 0; i < harga.length; i++){
           System.out.println(i+". "+film[i]+" => "+harga[i]);
       }
      
        //scanner
       System.out.println("Silahkan masukkan nomor tiket ");
       
       Scanner input = new Scanner(System.in);
       
       int pilihan = input.nextInt();
       
       System.out.println("input pilihan : "+film[pilihan]);
       
       //percabangan
       System.out.println("Silahkan masukkan uang anda ");
       
       int uang = input.nextInt();
       
       if (uang > harga[pilihan]){
           System.out.println("Kembalian "+(uang - harga[pilihan]));
       }else if (uang == harga[pilihan]){
           System.out.println("Uang anda pas maka silahkan menonton ");
       }else{
           System.out.println("Uang anda kurang "+(harga[pilihan]-uang));
       }
    }
    
}
