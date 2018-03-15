package trainingdiary;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class Calculator extends JDialog
{
    public Calculator(){}
    public Calculator(JFrame parent)
    {
        super(parent, false);
        this.setTitle("Kalkulator");
        initComponents();
        this.setBounds(300, 300, 250, 75);
        
        
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void initComponents()
    {
        panel.add(button0);
        this.getContentPane().add(panel);
    }
    
    
    JTextArea tmp = new JTextArea("Tutaj zrobić kalkulator");
    JPanel panel = new JPanel();
    JButton button0 = new JButton("0");
            
    
    
    
    public static void main(String[] args) 
    {
        new Calculator().setVisible(true);
    }
    
}
