package trainingdiary;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyLabel extends JLabel
{
    private Color normalColor = new Color(45, 45, 45);

    public MyLabel(String text) 
    {
        super(text);
       // setOpaque(true);
       // setBackground(normalColor);
        setForeground(new Colors().getColorForeground());
        setFont(new Font("Dialog", Font.BOLD, 20));
       // setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        
    }
    
    
    
    
}
