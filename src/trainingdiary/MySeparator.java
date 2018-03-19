package trainingdiary;
import javax.swing.JSeparator;


public class MySeparator extends JSeparator implements Colorss
{
    public MySeparator() 
    {
        setOpaque(true);
        setForeground(Colorss.colorOrnamentations);
        setBackground(Colorss.colorOrnamentations);
        setEnabled(false);
        setFocusable(false); 
    }   
}
