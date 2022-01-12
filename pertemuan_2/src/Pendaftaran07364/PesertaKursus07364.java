/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendaftaran07364;

/**
 *
 * @author Acer
 */
import java.util.ArrayList;
public class PesertaKursus07364 extends BiodataKursus07364{
    private String umur;
    
    public PesertaKursus07364(String umur, String nama, String noTelp, String alamat){
        super (nama, noTelp, alamat);
        this.umur = umur;
}

    public String getUmur07364() {
        return umur;
    }

    public void setUmur07364(String umur) {
        this.umur = umur;
    }

    
}