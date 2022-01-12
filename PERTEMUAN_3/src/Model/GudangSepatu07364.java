/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity .GudangEntity07364;
import helper.koneksiDb07364;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class GudangSepatu07364 {
    private String sql;
    public Connection conn = koneksiDb07364.getconnection();
    
    public ArrayList<GudangEntity07364> getDataGudang(GudangEntity07364 GudangEntity07364) {
    ArrayList<GudangEntity07364> listDataGudang= new ArrayList<>();
    try {
        Statement stat = conn.createStatement();
        sql="SELECT * FROM admin ";
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            
        GudangEntity07364 DataGudang = new GudangEntity07364();
            
        DataGudang.setId(rs.getInt("id"));
        DataGudang.setMerek07364(rs.getString("merek"));
        DataGudang.setNomor07364(rs.getString("nomor"));
        DataGudang.setUkuran07364(rs.getString("ukuran"));
        DataGudang.setTahun07364(rs.getString("tahun"));
        listDataGudang.add(GudangEntity07364);

       }
    }catch (SQLException e) {
        System.out.println(e);
    }
    return listDataGudang;
    }

    public ArrayList<GudangEntity07364> getgudang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
    