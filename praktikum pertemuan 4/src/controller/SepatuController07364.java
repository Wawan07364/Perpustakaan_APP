/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Wawan Saputra
 */
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Entity.SepatuEntity07364;

public class SepatuController07364 implements controllerInterface {

    public void Insert(String merek, String size, String warna){
        SepatuEntity07364 sepatu = new  SepatuEntity07364();
            sepatu.setMerek(merek);
            sepatu.setSize(size);
            sepatu.setWarna(warna);
        AllObjectSepatu07364.sepatumodel.insertData(sepatu);
    }


    public void updateData(int urut, String data, int id){
        switch(urut){
            case 1:
                AllObjectSepatu07364.sepatumodel.updateMerek(data, id);
                break;
            case 2:
                AllObjectSepatu07364.sepatumodel.updateSize(data, id);
                break;
            case 3:
                AllObjectSepatu07364.sepatumodel.updateWarna(data, id);
                break;
        }


    }
    public void updatePassword(String pass, int id){
        AllObjectSepatu07364.sepatumodel.updatePassword(pass, id);
    }  
public void deleteData(int id){
        AllObjectSepatu07364.sepatumodel.deleteData(id);
    }

    public ArrayList<SepatuEntity07364> getDataSepatu(){
        return AllObjectSepatu07364.sepatumodel.getSepatu();
    } 
    
    public DefaultTableModel daftarSepatu(){

        DefaultTableModel dataDaftarSepatu = new DefaultTableModel();
        Object[] kolom = {"ID","MEREK","SIZE","WARNA"};
    
        dataDaftarSepatu.setColumnIdentifiers(kolom);
        int size=getDataSepatu().size();
        for(int i = 0; i< size ;i++){
            Object []data=new Object[4];
    
        data[0]=AllObjectSepatu07364.sepatumodel.getSepatu().get(i).getId();
        data[1]=AllObjectSepatu07364.sepatumodel.getSepatu().get(i).getMerek();    
        data[2]=AllObjectSepatu07364.sepatumodel.getSepatu().get(i).getSize();
        data[3]=AllObjectSepatu07364.sepatumodel.getSepatu().get(i).getWarna();
       
    
        dataDaftarSepatu.addRow(data);
    
        }
        return dataDaftarSepatu;
    
    
    }


   
}