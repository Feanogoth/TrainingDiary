//Test gita

package trainingdiary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TrainingDiary extends JFrame implements WindowListener
{
    private JPopupMenu contextMenu = new JPopupMenu();
    private JTextArea textArea = new JTextArea();
    public TrainingDiary()
    {
        JFrame frame = new MyFrame(this, "Dzienniczek Treningowy");
        initComponents();
        this.addWindowListener(this);
        
        JScrollPane scroll = new JScrollPane();
        
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
              contextMenu.add(new JMenuItem(new AbstractAction("Kalkulator") {
        @Override
        public void actionPerformed(ActionEvent ae) {
            new Calculator(calculator).setVisible(true);   
            }
            }));
       contextMenu.add(new JMenuItem(new AbstractAction("Zamknij") {
        @Override
        public void actionPerformed(ActionEvent ae) {
            int opcja = JOptionPane.showConfirmDialog(frame, "Czy na pewno chcesz zamknąć?");
            if (opcja == 0)
            {
                frame.dispose();  
                calculator.dispose();
            }   
            }
    }));
    contextMenu.add(new JMenuItem("Copy"));
    contextMenu.add(new JMenuItem("paste"));
    contextMenu.add(new JMenuItem("delete"));
    textArea.addMouseListener(new MouseAdapter() 
    {
        @Override
            public void mouseReleased(MouseEvent me) 
            {
                if(me.getClickCount() == 3 && me.getButton() == MouseEvent.BUTTON1 && me.isShiftDown())
                    JOptionPane.showMessageDialog(frame, "Click 3 times");
                if(me.isPopupTrigger())
                    contextMenu.show(me.getComponent(), me.getX(), me.getY());
            }
    });
    }

    public void initComponents()
    {
        panel.add(full);
        panel.add(full2);
        panel.add(test);
        test.setPreferredSize(new Dimension(300, 300));
        full.addActionListener((ActionEvent ae) -> {
         device.setFullScreenWindow(this);
        });
        full2.addActionListener((ActionEvent ae) -> {
            device.setFullScreenWindow(null);
        });
       
       
        panel.add(buttonTestLook);
        panel.add(buttonCalculator);
       
        buttonTestLook.addActionListener((ActionEvent ae) -> 
        {
         buttonAction(ae);
        });
        buttonCalculator.addActionListener((ActionEvent ae) -> 
        {
            //new Calculator(calculator).setVisible(true);
            new Calc(calculator).setVisible(true);
           
        });
        
        test.addActionListener((ActionEvent ae) -> 
        {
            Color color = new Colors().getColorBackground();
            
            panel.setBackground(color);
        });
        
        buttonCalculator.setBackground(new Color(45, 45, 45));
        buttonCalculator.setForeground(new Color(139, 90, 60));
        buttonCalculator.setFocusPainted(false);
        
        
        
        buttonTestLook.setFocusPainted(false);
        full.setFocusPainted(false);
        full2.setFocusPainted(false);
        
        
        
        this.getContentPane().setLayout(new GridLayout(2, 1));

        this.getContentPane().add(panel);
        new ContextMenu(this);
        new Menu(this);
        
    }
    
    
    
  
   private JButton buttonTestLook = new JButton("TEST");
   private JButton buttonCalculator = new JButton("Kalkulator");
   private JPanel panel = new JPanel();
   private JFrame calculator = new JFrame();
   private JButton full = new JButton("Full");
   private JButton full2 = new JButton("BAck");
   private JButton test = new MyButton("TEST");
   // Color color =new Colors().getColor();
    
    
    static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    
    private void buttonAction(ActionEvent ae)
    {
        System.out.println(((JButton)ae.getSource()).getText());
        String lookName = "";
       if(((JButton)ae.getSource()).getText().equals("TEST"))
           lookName = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
       
       try 
        {
            UIManager.setLookAndFeel(lookName);
            SwingUtilities.updateComponentTreeUI(this);   
        }
        catch (Exception ex) 
        {
             System.out.println(ex.getMessage());
        } 
    }
    
   
//    public JPanel getPanel() {
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Java Technology Dive Log");
//        ImageIcon image = null;
//        try {
//            image = new ImageIcon(ImageIO.read(
//                    new URL("http://i.imgur.com/6mbHZRU.png")));
//        } catch(MalformedURLException mue) {
//            mue.printStackTrace();
//        } catch(IOException ioe) {
//            ioe.printStackTrace();
//        } 
//        JButton  tt = new MyButton("dsadsdd");
//        panel.add(tt);
//        label.setIcon(image);
//        panel.add(label);
//
//        return panel;
//    }
    
    
    public static void main(String[] args) 
    {
        new HelloMenu().setVisible(true);
      // new TrainingDiary().setVisible(true);
    }

    
    
    @Override
    public void windowOpened(WindowEvent we) 
    {
        //JOptionPane.showMessageDialog(rootPane, "Witaj!");
    }

    @Override
    public void windowClosing(WindowEvent we)    
    {
//       
//        button.setFocusPainted(false);
//        button.setContentAreaFilled(false);
//        button.setOpaque(true);
        
//        UIManager.put("OptionPane.background", new Color(102, 102, 102));
//        UIManager.put("Panel.background", new Color(102, 102, 102));
//        UIManager.put("OptionPane.cancelButtonText", "Anuluj");
//        UIManager.put("OptionPane.okButtonText", "Tak");
//        UIManager.put("Button.okButtonTextSize", 12);
//        UIManager.put("Button.buttonAreaBorder", BorderFactory.createSoftBevelBorder(0));
//        UIManager.put("OptionPane.yesButtonText", "TAK");
//        UIManager.put("OptionPane.noButtonText", "NIE");
//        UIManager.put("OptionPane.buttonFont", new Font("Tahoma", Font.BOLD, 14));
//        UIManager.put("OptionPane.font", new Font("Tahoma", Font.BOLD, 14));
//        
//        UIManager.put("Button.background", new Color(45, 45, 45));
//        UIManager.put("Button.foreground", new Color(139, 90, 60));
//        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz wyjść z aplikacji?", "Wybierz opcję",
//                        JOptionPane.YES_NO_OPTION);
//        
//        
//        
//        
//        
//       
        
       new OptionPane(this, "Czy chcesz zamknąć program?").setVisible(true);
       
       
    }

    @Override
    public void windowClosed(WindowEvent we)  
    {
        System.out.println("Instrukcje zapisania danych na dysku");
    }

    @Override
    public void windowIconified(WindowEvent we)  
    {
        System.out.println("instrukcja gdy zminimalizowane");
    }

    @Override
    public void windowDeiconified(WindowEvent we)  
    {
        System.out.println("instrukcja gdy zmaksymalizowany");
    }

    @Override
    public void windowActivated(WindowEvent we)  
    {
        System.out.println("instrukcje gdy okno aktywne");
    }

    @Override
    public void windowDeactivated(WindowEvent we) 
    {
        System.out.println("Instrukcje gdy okno nie jest aktywne");
    }
    
}





//Container kontener = this.getContentPane();  //robimy kontener i do niego dodajemy komponenty zamist prosto do szybki 
//kontener.setLayout(null);
//kontener.add(centrum, BorderLayout.CENTER);

//panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);  // zeby przyciski nie znikaly tylko zmienialy polozenie jak zmieniamy wielkosc okna
//JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));

