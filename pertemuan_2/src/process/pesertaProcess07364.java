/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;
import Pendaftaran07364.Kursus07364;
import Pendaftaran07364.PesertaKursus07364;
import Pendaftaran07364.PesertaTerdaftarEntity07364;
import java.util.Scanner;


public class pesertaProcess07364 implements Interface07364 {
 
    private static Scanner input = new Scanner(System.in);
    private static PesertaKursus07364[] peserta = new PesertaKursus07364[100];
    private static PesertaTerdaftarEntity07364[] pesertaTerdaftar = new PesertaTerdaftarEntity07364[100];
    
    
    public static int jumPeserta = 0;
    
    public PesertaKursus07364[] getPeserta07364(){
        return peserta;
    }
    
    public PesertaTerdaftarEntity07364[] getPesertaTerdaftar07364(){
        return pesertaTerdaftar;
    }
    
    public void insert07364(String nama, String umur, String alamat, String noTelp){
        
        peserta[jumPeserta] = new PesertaKursus07364(umur, nama, noTelp,alamat);
    }
    
    public void insert07364(PesertaKursus07364 peserta, int index, String kodePeserta){
         pesertaTerdaftar[jumPeserta] = new PesertaTerdaftarEntity07364(peserta, index, kodePeserta);
         jumPeserta = jumPeserta+1;
    }
    
    public void view07364(){
        if (jumPeserta==0){
            System.out.println("Belum ada peserta terdaftar");
        }else{
            for (int i=0; i<jumPeserta; i++){
                System.out.println("==================================================");
                System.out.println("Kode Peserta : "+pesertaTerdaftar[i].getKodePeserta07364());
                System.out.println("==================================================");
                System.out.println("Nama : "+peserta[i].getNama07364()+ "\n Umur : "+peserta[i].getUmur07364()+"\n Alamat : "+peserta[i].getAlamat07364()+"\n No.Telp : "+peserta[i].getNoTelp07364()+"\n Lomba : "+Kursus07364.kursus[pesertaTerdaftar[i].getIndexLomba07364()]);
                System.out.println("==================================================");
            }
        }
    }
    
    public void update07364(){
        System.out.println("Masukkan Kode Peserta yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do{
            if (cari==jumPeserta){
                System.err.println("Tidak Ada Data");
                break;
            }else if(pesertaTerdaftar[cari].getKodePeserta07364().equals(search)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. No.Telp");
                    System.out.println("5. Umur");
                    System.out.println("6. Lomba");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("==================================================");
                        System.out.println("Kode Peserta : "+pesertaTerdaftar[cari].getKodePeserta07364());
                        System.out.println("==================================================");
                        System.out.println("Nama : "+peserta[cari].getNama07364()+ "\n Umur : "+peserta[cari].getUmur07364()+"\n Alamat : "+peserta[cari].getAlamat07364()+"\n No.Telp : "+peserta[cari].getNoTelp07364()+"\n Lomba : "+Kursus07364.kursus[pesertaTerdaftar[cari].getIndexLomba07364()]);
                        System.out.println("==================================================");
                    }else if(pilEdit==2){
                        System.out.println("Ubah Nama : ");
                        String editNama = input.nextLine();
                        peserta[cari].setNama07364(editNama);
                    }else if(pilEdit==3){
                        System.out.println("Ubah Alamat : ");
                        String editAlamat = input.nextLine();
                        peserta[cari].setAlamat07364(editAlamat);
                    }else if(pilEdit==4){
                        System.out.println("Ubah No.Telp : ");
                        String editNoTelp = input.nextLine();
                        peserta[cari].setNoTelp07364(editNoTelp);
                    }else if(pilEdit==5){
                        System.out.println("Ubah Umur : ");
                        String editUmur = input.nextLine();
                        peserta[cari].setUmur07364(editUmur);
                    }else if(pilEdit==6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i<Kursus07364.kursus.length; i++){
                            System.out.println(i+"."+Kursus07364.kursus[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = input.nextInt();
                        pesertaTerdaftar[cari].setIndexLomba07364(editLomba);
                    }
                }while(pilEdit!=0);
                break;
            }else{
                cari = cari+1;
            }
        }while(true);
    }
    public void delete07364(){
        System.out.println("Masukkan Kode Peserta yang akan diHAPUS : ");
        String search = input.next();
        input.nextLine();
        int cari=0;
        do{
            if (cari==jumPeserta){
                System.err.println("Tidak Ada Data !");
                break;
            }else if(pesertaTerdaftar[cari].getKodePeserta07364().equals(search)){
                if (cari==jumPeserta -1){
                    jumPeserta = jumPeserta-1;
                }else{
                    for(int i=cari; i<jumPeserta; i++){
                        pesertaTerdaftar[i]= pesertaTerdaftar[i+1];
                        peserta[i]= peserta[i+1];
                    }
                    jumPeserta=jumPeserta-1;
                }
                break;
            }else{
                cari = cari+1;
            }
        }while(true);
    }

   
}
