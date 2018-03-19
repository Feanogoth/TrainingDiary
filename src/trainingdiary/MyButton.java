package trainingdiary;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyButton extends JButton 
{
    public MyButton (String text) 
    {
        super(text);
        setBorder(BorderFactory.createSoftBevelBorder(0));
        setBorderPainted(true);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setBackground(Colorss.colorCompBackNormal);
        setForeground(Colorss.colorForeground);
        setFont(new Font("Audiowide", Font.BOLD + Font.ITALIC, 18));
        setText(text);

        addChangeListener((ChangeEvent ce) -> 
        {
            if (getModel().isPressed()) 
            {
                setBackground(Colorss.pressedButtonColor);
                setForeground(Color.BLACK);
            } 
            else if (getModel().isRollover()) 
            {
                setBackground(Colorss.colorCompChange);
                setForeground(Colorss.colorForeground);
            }
            else 
            {
                setBackground(Colorss.colorCompBackNormal);
                setForeground(Colorss.colorForeground);
            }
        });
    }
    public MyButton () 
    {
        setBorder(BorderFactory.createSoftBevelBorder(0));
        setBorderPainted(true);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setBackground(Colorss.colorCompBackNormal);
        setForeground(Colorss.colorForeground);
        
        addChangeListener((ChangeEvent ce) -> 
        {
            if (getModel().isPressed()) 
            {
                setBackground(Colorss.pressedButtonColor.darker());
                setForeground(Colorss.colorCompBackNormal);
            }
            else if (getModel().isRollover()) 
            {
                setBackground(Colorss.colorForeground);
                setForeground(Colorss.colorCompBackNormal);
            } 
            else 
            {
                setBackground(Colorss.colorCompBackNormal);
                setForeground(Colorss.colorForeground);
            }
        });
    }
}




