/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author Wawan Saputra
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.text.BreakIterator;

import javax.swing.JButton;

public class ComponentGui extends JFrame {



protected JButton btnaddnew = new JButton ("ADDNEW");
protected JButton btnupdate = new JButton("UPDATE");
protected JButton btndelete = new JButton("DELETE");

protected JLabel labeldatagudang = new JLabel("DATA SEPATU DI GUDANG HEWAHUNJA");
protected JLabel labelmerek = new JLabel("Merek");
protected JLabel labelsize = new JLabel("Size");
protected JLabel labelwarna = new JLabel("Warna");

protected JTextField fieldmerek  = new JTextField();
protected JTextField fieldsize  = new JTextField();
protected JTextField fieldwarna  = new JTextField();




void kosong(){
    fieldmerek.setText(null);
    fieldsize.setText(null);
    fieldwarna.setText(null);

}
}
