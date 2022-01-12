/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendaftaran07364;

public class PesertaTerdaftarEntity07364 {

    protected String nama, noTelp, alamat;
    
    private PesertaKursus07364 pesertaKursus;
    private int indexLomba;
    private String kodePeserta;
    
    public PesertaTerdaftarEntity07364(PesertaKursus07364 pesertaKursus, int indexLomba, String kodePeserta){
        this.pesertaKursus = pesertaKursus;
        this.indexLomba = indexLomba;
        this.kodePeserta = kodePeserta;
    }

    public PesertaKursus07364 getPesertaKursus() {
        return pesertaKursus;
    }

    public void setPesertaKursus07364(PesertaKursus07364 pesertaKursus) {
        this.pesertaKursus = pesertaKursus;
    }

    public int getIndexLomba07364() {
        return indexLomba;
    }

    public void setIndexLomba07364(int indexLomba) {
        this.indexLomba = indexLomba;
    }

    public String getKodePeserta07364() {
        return kodePeserta;
    }

    public void setKodePeserta07364(String kodePeserta) {
        this.kodePeserta = kodePeserta;
    }
    
}

