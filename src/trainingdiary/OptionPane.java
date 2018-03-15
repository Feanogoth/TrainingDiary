package trainingdiary;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public final class OptionPane extends JFrame implements WindowListener
{
    private JFrame parent;

    public OptionPane(JFrame parent, String text)
    {
        this.parent = parent;
        label = new JLabel(text);
        initComponents();
        this.setTitle("Wybierz opcję");
        this.setAlwaysOnTop(true);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        this.setBounds((width-280)/2, (height-120)/2, 280, 120);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
        yesButton.addActionListener((ActionEvent ae) -> 
        {
            yesButtonOption();
        });
        noButton.addActionListener((ActionEvent ae) -> 
        {
            noButtonOption();
            parent.setEnabled(true);
        });
        
        parent.setEnabled(false);
        
        
                
        
    }
   
    public void initComponents()
    {
       GroupLayout layout = new GroupLayout(getContentPane());
       
       this.setUndecorated(true);
       getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(255, 149, 1)));
       
       
       this.getContentPane().setBackground(new Color(0,0,0));
       this.getContentPane().setLayout(layout);
       buttonParameters();
       labelParameters();
       
       
       
       layout.setHorizontalGroup(
                layout.createParallelGroup()
                .addComponent(label, 280, 280, 280)
                .addGroup(layout.createSequentialGroup()
                        .addGap(40)
                        .addComponent(yesButton, 80, 80, 80)
                        .addGap(30)
                        .addComponent(noButton, 80, 80, 80)       
                        )
                        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addContainerGap(25, 25)
                        .addComponent(label)
                        .addContainerGap(20, 20)
                .addGroup(
                layout.createParallelGroup()
                        .addGap(30)
                        .addComponent(yesButton, 30, 30, 30)
                        .addComponent(noButton, 30, 30, 30)   
                )
                );
    }
    
    JPanel panel = new JPanel();
    JButton yesButton = new MyButton("TAK");
    JButton noButton = new MyButton("NIE");
    JLabel label; 
    
    
            
    public void buttonParameters()
    {
        yesButton.setFont(new Font("Tahoma", Font.BOLD, 14)); 
        noButton.setFont(new Font("Tahoma", Font.BOLD, 14)); 
        
     
    }
    public void labelParameters()
    {
        
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        label.setForeground(new Color(255, 255, 255));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
    }
    public void yesButtonOption()
    {
        System.exit(0);
    }
    public void noButtonOption()
    {
        parent.setEnabled(true);
        this.dispose();
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
