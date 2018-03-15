package trainingdiary;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;





public class MyButton extends JButton 
{
    private Color pressedColor = new Color(170, 170, 170);
    private Color rolloverColor = new Color(115, 115, 115);
    private Color normalColor = new Color(51, 51, 51);
    private Color textColor = new Color(255, 255, 255);

    public MyButton (String text) {
        super(text);
        setBorder(BorderFactory.createSoftBevelBorder(0));
        setBorderPainted(true);
        setFocusPainted(false);
        
        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(normalColor);
        setForeground(textColor);
        setFont(new Font("Audiowide", Font.BOLD + Font.ITALIC, 18));
        setText(text);

        addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (getModel().isPressed()) {
                    setBackground(pressedColor);
                    setForeground(Color.BLACK);
                } else if (getModel().isRollover()) {
                    setBackground(rolloverColor);
                    setForeground(textColor);
                } else {
                    setBackground(normalColor);
                    setForeground(textColor);
                }
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

        setBackground(new Color(50, 50, 50));
        setForeground(new Color(255, 255, 255));
        
        

        addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (getModel().isPressed()) {
                    setBackground(new Color(150, 150, 150));
                    setForeground(new Color(50, 50, 50));
                } else if (getModel().isRollover()) {
                    setBackground(new Color(255, 255, 255));
                    setForeground(new Color(50, 50, 50));
                } else {
                    setBackground(new Color(50, 50, 50));
                    setForeground(new Color(255, 255, 255));
                }
            }
        });
    }
}




