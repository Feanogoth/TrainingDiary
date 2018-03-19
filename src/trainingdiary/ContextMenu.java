package trainingdiary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.plaf.PopupMenuUI;



public class ContextMenu extends JPopupMenu
{
    private MyButton copy = new MyButton();
    private MyButton paste = new MyButton();
    private MyButton delete = new MyButton();
    private MyButton calc = new MyButton();
    private MyButton calendar = new MyButton();
    private MyButton close = new MyButton();
    private JPopupMenu contextMenu = new JPopupMenu(); 
    private JFrame calculator = new JFrame();
    
   
    
    public ContextMenu(JFrame parent)
    {
        // Context menu options 
        copy.setText("Kopiuj");
        paste.setText("Wklej");
        delete.setText("Usuń");
        calc.setText("Kalkulator");
        calendar.setText("Kalendarz");
        close.setText("Zamknij");

        contextMenu.setBackground(Colorss.colorCompBackNormal);
        contextMenu.setBorderPainted(false);
        GroupLayout layout = new GroupLayout(contextMenu);
        contextMenu.setLayout(layout);
      
        int min = 70;
        int prefer = 70;
        int max = 70;
  
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(copy, min, prefer, max)
                        .addComponent(paste, min, prefer, max)
                        .addComponent(delete, min, prefer, max)
                        .addComponent(calc, min, prefer, max)
                        .addComponent(calendar, min, prefer, max)
                        .addComponent(close, min, prefer, max)      
                ));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(copy)
                        .addComponent(paste)
                        .addComponent(delete)
                        .addComponent(calc)
                        .addComponent(calendar)
                        .addComponent(close)
                );

        
        copy.addActionListener((ActionEvent ae) -> 
        {
         
        });
        paste.addActionListener((ActionEvent ae) -> 
        {
         
        });
        delete.addActionListener((ActionEvent ae) -> 
        {
         
        });
        calc.addActionListener((ActionEvent ae) -> 
        {
            new Calc(calculator).setVisible(true);   
            
        });
        calendar.addActionListener((ActionEvent ae) -> 
        {
         
        });
        close.addActionListener((ActionEvent ae) -> 
        {
            new OptionPane(parent, "Czy chcesz zamknąć program?").setVisible(true);  
        });
    
       
        



        
       
    }
    // ContextMenu uses in components
    public ContextMenu(JFrame parent, JPanel panel)
    {
        copy.setText("Kopiuj");
        paste.setText("Wklej");
        delete.setText("Usuń");
        calc.setText("Kalkulator");
        calendar.setText("Kalendarz");
        close.setText("Zamknij");

        contextMenu.setBackground(Colorss.colorCompBackNormal);
        contextMenu.setBorderPainted(false);  
        GroupLayout layout = new GroupLayout(contextMenu);
        contextMenu.setLayout(layout);
      
        int min = 70;
        int prefer = 70;
        int max = 70;
    
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(copy, min, prefer, max)
                        .addComponent(paste, min, prefer, max)
                        .addComponent(delete, min, prefer, max)
                        .addComponent(calc, min, prefer, max)
                        .addComponent(calendar, min, prefer, max)
                        .addComponent(close, min, prefer, max)        
                ));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(copy)
                        .addComponent(paste)
                        .addComponent(delete)
                        .addComponent(calc)
                        .addComponent(calendar)
                        .addComponent(close)
                );
       
        copy.addActionListener((ActionEvent ae) -> 
        {
         
        });
        paste.addActionListener((ActionEvent ae) -> 
        {
         
        });
        delete.addActionListener((ActionEvent ae) -> 
        {
         
        });
        calc.addActionListener((ActionEvent ae) -> 
        {
            new Calc(calculator).setVisible(true);   
            
        });
        calendar.addActionListener((ActionEvent ae) -> 
        {
         
        });
        close.addActionListener((ActionEvent ae) -> 
        {
            new OptionPane(parent, "Czy chcesz zamknąć program?").setVisible(true);  
        });    
    }
    
   

    public static void main(String[] args) 
    {
        
    }
}

