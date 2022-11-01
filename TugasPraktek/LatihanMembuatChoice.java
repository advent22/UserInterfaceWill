package TugasPraktek;
import java.awt.*;
public class LatihanMembuatChoice {
    
    public static void main(String[]args){
        Frame objek_frame = new Frame("Latihan Membuat Choice");
        Choice choice = new Choice();
        
        choice.setBounds(30, 50, 70, 50);
        choice.add("1");
        choice.add("2");
        choice.add("3");
        choice.add("4");
        
        objek_frame.add(choice);
        objek_frame.setSize(100, 100);
        objek_frame.setLayout(null);
        objek_frame.setVisible(true);
       
   }
}
