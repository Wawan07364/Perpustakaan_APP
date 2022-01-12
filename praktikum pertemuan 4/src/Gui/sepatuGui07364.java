/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import Entity.SepatuEntity07364;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;



import java.nio.file.Files; 
import java.nio.file.StandardCopyOption; 
import java.util.logging.Level; 
import java.util.logging.Logger;




public class sepatuGui07364 extends ComponentGui {
    JTable tabelsepatu = new JTable();
    JScrollPane spsepatu = new JScrollPane(tabelsepatu);
    JTextField textpilih = new JTextField();
    int id;

  
    String merek;
    String size;
    String warna;






    public sepatuGui07364(int cek){
        initComponent(cek);
        

    }





    void initComponent(final int cek) {
        for ( SepatuEntity07364 sepatuEntity : allobjectcontroller07364.sepatumodel.getDataSepatu()) {
        this.id = sepatuEntity.getId();
        this.merek = sepatuEntity.getMerek();
        this.size =sepatuEntity.getSize();
        this.warna = sepatuEntity.getWarna();
  
        }



setTitle("GUDANG SEPATU");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800,480); 
setLocationRelativeTo(null); 
getContentPane().setBackground(Color.red);
 setLayout(null); setVisible(true);



 labeldatagudang.setBounds (200,0,400,40);
 labeldatagudang.setHorizontalAlignment(JLabel.CENTER);
 labeldatagudang.setFont(new Font("calibri", Font.PLAIN, 20));
 labeldatagudang.setForeground (Color.white);
 add(labeldatagudang);


labelmerek.setBounds (25,60,100,25);
labelmerek.setFont(new Font("calibri", Font.PLAIN, 16));
labelmerek.setForeground (Color.white);
add(labelmerek);

fieldmerek.setBounds (120,60,300,25);
fieldmerek.setText("");
fieldmerek.setEditable(true);
add(fieldmerek);

// size
labelsize.setBounds(25,95,40,25);
labelsize.setFont(new Font("calibri", Font.PLAIN, 16));
labelsize.setForeground (Color.white);
add(labelsize);

fieldsize.setBounds(120,95,300,25);
fieldsize.setText("");
fieldsize.setEditable(true);
add(fieldsize);

//warna
labelwarna.setBounds(25,135,80,25);
labelwarna.setFont(new Font("calibri", Font.PLAIN, 16));
labelwarna.setForeground (Color.white);
add(labelwarna);

fieldwarna.setBounds (120,130,300,25);
fieldwarna.setText("");
fieldwarna.setEditable(true);
add(fieldwarna);

btnaddnew.setBounds(500,60,100,25);
btnupdate.setBounds(500,100,100,25);
btndelete.setBounds(500,140,100,25);


add(btnaddnew);
add(btnupdate);
add(btndelete);





//  tabel
spsepatu.setBounds(100, 200, 600, 200);
tabelsepatu.setModel(allobjectcontroller07364.sepatumodel.daftarSepatu());
add(spsepatu);



// untuk insert
btnaddnew.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        String merek = fieldmerek.getText();
        String size = fieldsize.getText();
        String warna = fieldwarna.getText();
     
        if(merek.length() != 0 && size.length() != 0 && warna.length() != 0){
            allobjectcontroller07364.sepatumodel.Insert(merek, size, warna);
            JOptionPane.showMessageDialog(null, "data sudah masuk");
            dispose();
            //new sepatuGui().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            kosong();
        }
    }
});


//string untuk hapus
tabelsepatu.addMouseListener(new MouseAdapter(){
    @Override
    public void mouseClicked(MouseEvent e){
        int i = tabelsepatu.getSelectedRow();
        textpilih.setText(allobjectcontroller07364.sepatumodel.daftarSepatu().getValueAt(i, 0).toString());
    }
});

btndelete.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        id= Integer.parseInt(textpilih.getText());
        allobjectcontroller07364.sepatumodel.deleteData(id);
        tabelsepatu.setModel(allobjectcontroller07364.sepatumodel.daftarSepatu());
        JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
    }
});

    }
    
}
