/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class programKalkulator07364 {
       public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        float result07364;
        int a07364;
        float 
                b07364;
        int pilih07364;
        boolean pil07364;
        
        
            System.out.println("program kalkulator ");
            do{
            System.out.println("\n\nMenu Pengoperasian = ");
            System.out.println("[1] Penambahan ");
            System.out.println("[2] Pengurangan ");
            System.out.println("[3] Perkalian ");
            System.out.println("[4] Pembagian ");
            System.out.println("\n [-] Pilih Operasi = ");
            pilih07364 = input.nextInt();
            System.out.println ("========================");
        
            switch (pilih07364){
                case 1 -> {
                    System.out.println("Masukkan Angka Pertama = ");
                    a07364 = input.nextInt();
                    System.out.println("Masukkan Angka Kedua = ");
                    b07364 = input.nextInt();
                    result07364 = a07364 + b07364;
                    System.out.println("Hasil = " + result07364);
                }
                case 2 -> {
                    System.out.println("Masukkan Angka Pertama = ");
                    a07364 = input.nextInt();
                    System.out.println("Masukkan Angka Kedua = ");
                    b07364 = input.nextInt();
                    result07364 = a07364 - b07364;
                    System.out.println("Hasil = " + result07364);
                }
                case 3 -> {
                    System.out.println("Masukkan Angka Pertama = ");
                    a07364 = input.nextInt();
                    System.out.println("Masukkan Angka Kedua = ");
                    b07364 = input.nextInt();
                    result07364 = a07364 * b07364;
                    System.out.println("Hasil = " + result07364);
                }
                case 4 -> {
                    System.out.println("Masukkan Angka Pertama = ");
                    a07364 = input.nextInt();
                    System.out.println("Masukkan Angka Kedua = ");
                    b07364 = input.nextFloat();
                    result07364 = a07364 / b07364;
                    System.out.println("Hasil = " + result07364);
                }
                default -> {
                    System.out.println("Pengoperasian Tidak Tersedia ! ");
                    System.out.println("\n\n");
                }
        }
        System.out.println("Apakah Anda Ingin Menginput lagi 1/2?");
        System.out.println("1. YA \n2. TIDAK \nInput angka= \n");
        pilih07364 = input.nextInt();
        
        if(pilih07364 == 1){
            pil07364 = true;
        }else{
            pil07364 = false;
        }
    }while(pil07364);
  }
}
