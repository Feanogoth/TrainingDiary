package trainingdiary;
import java.awt.Font;
import javax.swing.JLabel;


public class MyLabel extends JLabel
{
    public MyLabel(String text) 
    {
        super(text);
        setForeground(Colorss.colorForeground);
        setFont(new Font("Dialog", Font.BOLD, 20));
    }
}
