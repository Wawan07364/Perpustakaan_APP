/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Acer
 */
public abstract class UserEntityAbstract07364 {
    protected int id;
    protected String merek07364, ukuran07364, tahun07364;
    
    public UserEntityAbstract07364() {
      
    }
    
    public UserEntityAbstract07364 (String merek07364, String ukuran07364, String tahun07364) {
        this.merek07364 = merek07364;
        this.ukuran07364 = ukuran07364;
        this.tahun07364 = tahun07364;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerek07364() {
        return merek07364;
    }

    public void setMerek07364(String merek07364) {
        this.merek07364 = merek07364;
    }

    public String getUkuran07364() {
        return ukuran07364;
    }

    public void setUkuran07364(String ukuran07364) {
        this.ukuran07364 = ukuran07364;
    }

    public String getTahun07364() {
        return tahun07364;
    }

    public void setTahun07364(String tahun07364) {
        this.tahun07364 = tahun07364;
    }
}
