package trainingdiary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Settings extends JFrame
{

    public Settings() 
    {
        JFrame frame = new MyFrame(this, "Ustawienia");
    }
    public void initComponents()
    {
        this.getContentPane().add(panel);
    }
    private JPanel panel = new JPanel();
    
    
    
    
}
