package TugasPraktek;
import java.awt.*;

public class LatihanMembuatCheckBox {
    
    public static void main(String[]args){
        // Inisialisasi class objek
        Frame objek_Frame = new Frame("Latihan Membuat Chech Box");
        
        Checkbox checkbox_c = new Checkbox("C++");
        checkbox_c.setBounds(100, 100, 50, 50);
        Checkbox checkbox_d = new Checkbox("Java");
        checkbox_d.setBounds(100, 150, 50, 50);
        Checkbox checkbox_e = new Checkbox("Python");
        checkbox_e.setBounds(100, 200, 50, 50);
        Checkbox checkbox_f = new Checkbox("Php");
        checkbox_f.setBounds(100, 250, 50, 50);
        
        objek_Frame.add(checkbox_c);
        objek_Frame.add(checkbox_d);
        objek_Frame.add(checkbox_e);
        objek_Frame.add(checkbox_f);
        objek_Frame.setSize(400, 400);
        objek_Frame.setLayout(null);
        objek_Frame.setVisible(true);
    }
}
