
package trainingdiary;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Colors extends JFrame 
{
    public Colors()
    {
        super("zmienaicz kolorow");
        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(3);
    }
    
    public Color getColorForeground()
    {
        return new Color(255, 255, 255);
    }
    public Color getColorBackground()
    {
        return Color.BLACK;
    }
    public Color getColorOrnamentations()
    {
        return new Color(255, 149, 1);
    }
    public Color getColorCompBackN()
    {
        return new Color(51, 51, 51);
    }
    public Color getColorCompCh()
    {
        return new Color(115, 115, 115);
    }
}
