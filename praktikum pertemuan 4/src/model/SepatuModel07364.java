/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wawan Saputra
 */
import Entity.SepatuEntity07364;




import java.util.ArrayList;
import java.sql.*;


public class SepatuModel07364 extends ModelAbstract07364 {
  
    private String sql;
    public ArrayList<SepatuEntity07364> getSepatu(){
   ArrayList<SepatuEntity07364> Sepatu= new ArrayList<>();
    
    try{
        Statement stat = conn.createStatement();
        sql = "SELECT *FROM sepatu";
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            SepatuEntity07364 spt = new SepatuEntity07364();
            spt.setId(rs.getInt("id"));
            spt.setMerek(rs.getString("merek"));
            spt.setSize(rs.getString("size"));
            spt.setWarna(rs.getString("warna"));
          
            Sepatu.add(spt);
        }
    }catch(SQLException e){
        System.out.println(e);
    }
    return Sepatu;
}

public ArrayList<SepatuEntity07364> getSepatu(int id){
    ArrayList<SepatuEntity07364> sepatu = new ArrayList<>();
    
    try{
        sql = "SELECT * FROM sepatu where id = ?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setInt(1, id);
        ResultSet rs = stat.executeQuery();
        while(rs.next()){
            SepatuEntity07364 spt = new SepatuEntity07364();
            spt.setId(rs.getInt("id"));
            spt.setMerek(rs.getString("merek"));
            spt.setSize(rs.getString("size"));
            spt.setWarna(rs.getString("warna"));
          
            sepatu.add(spt);
        }
    }catch (SQLException e){
        System.out.println(e);
    }
    return sepatu;
}



public void insertData(SepatuEntity07364 sptEntity){
    try{
        sql = "INSERT INTO sepatu (merek, size, warna) Values(?,?,?)";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, sptEntity.getMerek());
        stat.setString(2, sptEntity.getSize());
        stat.setString(3, sptEntity.getWarna());
       
        
        int rows = stat.executeUpdate();
        System.out.println(rows + "row(s) update!");
    }catch (SQLException e){
        System.out.println("GAGAL INPUT DATA");
    }
}



public void updateMerek(String merek, int id){
    try{
        sql = "update sepatu SET merek =? WHERE id =?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, merek);
        stat.setInt(2, id);
        stat.executeUpdate();
    }catch (SQLException e){
        System.out.println("GAGAL UBAH MEREK !!!");
        e.printStackTrace();
    }
}


public void updateSize(String size, int id){
    try{
        sql = "update sepatu SET size =? WHERE id =?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, size);
        stat.setInt(2, id);
        int rows = stat.executeUpdate();
        System.out.println(rows + "row(s) update!");
    }catch (SQLException e){
        System.out.println("GAGAL UBAH SIZE !!!");
        e.printStackTrace();
    }
}


public void updateWarna(String warna, int id){
    try{
        sql = "update sepatu SET warna =? WHERE id =?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, warna);
        stat.setInt(2, id);
        int rows = stat.executeUpdate();
        System.out.println(rows + "row(s) update!");
    }catch (SQLException e){
        System.out.println("GAGAL UBAH WARNA !!!");
        e.printStackTrace();
    }
}

    public void deleteData(int id){
        try{
            sql = "DELETE FROM sepatu WHERE id = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void updatePassword(String pass, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    }   