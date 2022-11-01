package TugasPraktek;
import java.awt.*;

public class LatihanMembuatButton {
    public static void main(String[]args){
        // melakukan inisialisasi class objek
        Frame objek_frame = new Frame("Latihan Menggunakan BUTTON 1");
        
        Button objek_button = new Button("Tekan Di sini");
        objek_button.setBounds(50, 100, 80, 30);
        
        objek_frame.add(objek_button);
        objek_frame.setSize(200,200);
        objek_frame.setLayout(null);
        objek_frame.setVisible(true);
        //objek frame
    }
}
