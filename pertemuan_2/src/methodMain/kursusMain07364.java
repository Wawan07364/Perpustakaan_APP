/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodMain;

import Pendaftaran07364.Kursus07364;
import process.pesertaProcess07364;
import java.util.Scanner;
public class kursusMain07364 {
   
    private static Scanner input = new Scanner(System.in);
    private static pesertaProcess07364 prosesPeserta = new pesertaProcess07364();
    private static int pilKursus;
    public static void main(String[] args) {
        
        int pil;
        do{
            System.out.println("Jumlah Peserta : "+pesertaProcess07364.jumPeserta);
            System.out.println("1. Daftarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Lihat Peserta Terdaftar");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log Out");
            
            pil = input.nextInt();
            input.nextLine();
            switch (pil){
                case 1 :
                    insertPeserta07364();
                    break;
                case 2 :
                    prosesPeserta.update07364();
                    break;
                case 3 :
                    prosesPeserta.view07364();
                    break;
                case 4 :
                    prosesPeserta.delete07364();
                    break;
            }
        }while(pil!=0);
    }
    
    static void insertPeserta07364(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Input Umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No.Telp : ");
        String noTelp = input.nextLine();
        prosesPeserta.insert07364(nama,umur, alamat,noTelp);
        insertKursus07364();
    }
    
    static void insertKursus07364(){
        System.out.println("Kursus : ");
        for (int i=0; i< Kursus07364.kursus.length; i++){
            System.out.println(i+ "." + Kursus07364.kursus[i]);
        }
            System.out.println("Pilih Kursus : ");
            pilKursus = input.nextInt();
            System.out.println("Input Kode Peserta : ");
            String kodePeserta = input.next();
            prosesPeserta.insert07364(prosesPeserta.getPeserta07364()[prosesPeserta.jumPeserta], pilKursus, kodePeserta);
        }
}
