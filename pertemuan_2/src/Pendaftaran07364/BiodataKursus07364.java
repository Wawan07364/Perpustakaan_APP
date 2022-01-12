/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendaftaran07364;

public abstract class BiodataKursus07364 {
    protected String nama, noTelp, alamat,umur;
    
    public BiodataKursus07364(String nama,String noTelp,String alamat){
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.umur = umur ;
    }
    public String getNama07364(){
        return nama;
    }
     public void setNama07364 (String nama){
        this.nama = nama;
    }
    
    public String getNoTelp07364(){
        return noTelp;
    }
    public void setNoTelp07364(String noTelp){
        this.noTelp = noTelp;
    }
    public String getAlamat07364(){
        return alamat;
    }
    public void setAlamat07364(String alamat){
        this.alamat = alamat;
    }
}
