/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktek;

//import javax.swing.JFrame.*;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class LatihanJComboBox {
public static void main (String [] args) {
    JFrame f = new JFrame ("ComboBox Example");
    String Country[] = {"Berlin", "France", "London", "Jakarta", "Madrid"};
    JComboBox cb = new JComboBox (Country);
    cb.setBounds (50,50,90,20);
    f.add(cb);
    f.setLayout(null);
    f.setSize(400,500);
    f.setVisible(true);
}
}   
