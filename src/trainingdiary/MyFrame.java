package trainingdiary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyFrame extends JFrame
{

   
    public MyFrame(JFrame parent, String nazwa)
    {
//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//            SwingUtilities.updateComponentTreeUI(this);   

        parent.setTitle(nazwa);
        
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        parent.setBounds(width/4, height/4, width/2, height/2);
        parent.setExtendedState(JFrame.MAXIMIZED_BOTH);
        parent.setBackground(new Colors().getColorBackground());
        
        parent.setResizable(true);
                
        
    }
        

   
}
