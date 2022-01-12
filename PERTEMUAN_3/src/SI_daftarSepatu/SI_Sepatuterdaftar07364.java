/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI_daftarSepatu;

/**
 *
 * @author Acer
 */
import Controller.GudangController07364;
import Entity.GudangEntity07364;

public class SI_Sepatuterdaftar07364 {
    public static GudangController07364 Gudang = new GudangController07364();
    public static void main(String[] args){
        showData();
    }
    
    static void showData(){
        for( GudangEntity07364 GudangEntity : Gudang.getDatagudang()){
            System.out.println("---------showData();-----------------------------------------");
            System.out.println(" Merek        = " + GudangEntity.getMerek07364());
            System.out.println(" ukuran       = " + GudangEntity.getUkuran07364());
            System.out.println(" tahun        = " + GudangEntity.getTahun07364());
        
            System.out.println(" STATUS    = ");
            if(GudangEntity.getStatus()==0){
                System.out.println("Unverified");
            } else {
                System.out.println("Verified");
            }
        }
    }
}
