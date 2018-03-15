package trainingdiary;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


public class Menu 
{
    private JMenuBar menuBar = new JMenuBar();
    private boolean flagTextArea = false;
    
    private JMenu  menuCalculator = new JMenu("Kalkulator");
    
    private JRadioButtonMenuItem radioButton = new JRadioButtonMenuItem("Radio button");
    private JCheckBoxMenuItem readOnly = new JCheckBoxMenuItem("Tylko do odczytu");
    private JTextArea textArea = new JTextArea();
    private String beforeChangeTextArea = "";
    
    private JPopupMenu contextMenu = new JPopupMenu(); 
    public Menu(){}
    private JFrame calculator = new JFrame();
    
    
    public Menu(JFrame parent)
    {
       parent.setJMenuBar(menuBar); 
       JMenu menuFile = menuBar.add(new JMenu("Plik"));
       JMenu menuMenu= menuBar.add(new JMenu("Menu"));
       JMenu menuTools = menuBar.add(new JMenu("Narzędzia"));
       JMenu menuHelp = menuBar.add(new JMenu("Pomoc"));
       JMenu menuSettings = menuBar.add(new JMenu("Ustawienia"));
       
       
       JMenuItem subMenu = menuFile.add(new JMenuItem("Nowy trening"));
       menuFile.add(new JMenuItem("Otwórz trening"));
       menuFile.addSeparator();
       Action actionSave = new ActionSave("Zapisz", "Zapisanie pliku na dysku", "ctrl S", new ImageIcon("iconsave.gif"), KeyEvent.VK_S);
       JMenuItem save = menuFile.add(actionSave);
       actionSave.setEnabled(false);
       menuFile.addSeparator();
       menuFile.add(new JMenuItem("Wyczyść"));
       menuFile.add(new JMenuItem("Wyjdź"));
       menuFile.setMnemonic('P');
       
       
       JMenuItem itemStart = new JMenuItem("Otwórz MENU");
       menuMenu.add(itemStart);
       
       
       JMenuItem itemCalendar = new JMenuItem("Kalendarz");
       JMenuItem itemCalculator = new JMenuItem("Kalkulator tradycyjny");
       JMenuItem itemCalculatorRunner = new JMenuItem("Kalkulator biegacza");
       JMenuItem itemTmpNote = new JMenuItem("Tymczasowa notatka");
       menuCalculator.add(itemCalculator);
       menuCalculator.add(itemCalculatorRunner);
       menuTools.add(itemCalendar);
       menuTools.add(itemTmpNote);
       menuTools.add(menuCalculator);
       
       
       JMenuItem itemDictionary = new JMenuItem("Słowniczek biegacza");
       JMenuItem itemTutorial = new JMenuItem("Samouczek");
       JMenuItem itemQuestion = new JMenuItem("Zgłoś problem/uwagi");
       menuHelp.add(itemDictionary);
       menuHelp.add(itemTutorial);
       menuHelp.add(itemQuestion);
       
       JMenuItem itemFullScreen = new JMenuItem("Tryb pełnoekranowy");
       JMenuItem itemFullScreenExit = new JMenuItem("Tryb okna");
       JMenuItem itemSettings = new JMenuItem("Panel ustawień");
       menuSettings.add(itemFullScreen);
       menuSettings.add(itemFullScreenExit);
       menuSettings.add(itemSettings);
       
       
       
       
       
        itemCalculator.addActionListener((ActionEvent ae) -> 
        {
            new Calc(calculator).setVisible(true);
       });
       
       
       
       
      
       
       
       
      
//       menuHelp.add(radioButton);
//       menuSettings.add(readOnly);
       
       readOnly.addActionListener((ActionEvent ae)->{
            if(readOnly.isSelected())
                actionSave.setEnabled(false);
            else
                actionSave.setEnabled(flagTextArea);
        });
       parent.getContentPane().add(textArea);
       
       
       
       textArea.addKeyListener(new KeyAdapter() 
        {
             @Override
             public void keyTyped(KeyEvent ke)
             {
                 if(readOnly.isSelected())
                     ke.consume();
             }
             @Override
             public void keyPressed(KeyEvent ke)
             {
                 
                 //if(ke.isControlDown() && ke.getKeyCode() == KeyEvent.VK_V && read.isSelected())
                 if(readOnly.isSelected())
                 {
                     ke.consume();
                 }
                 else if (!(textArea.getText() + ke.getKeyChar()).equals(beforeChangeTextArea) && czyToAscii(ke.getKeyChar()))
                 {
                     
                     beforeChangeTextArea = textArea.getText()+ ke.getKeyChar();
                     actionSave.setEnabled(flagTextArea = true);
                 }
             }
        });
       
       subMenu.addActionListener((ActionEvent ae)->
        {
            System.out.println("Tu jest kod, który tworzy nowy plik");
        });
       
       
       
       
       
//       contextMenu.add(new JMenuItem(new AbstractAction("Kalkulator") {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            new Calculator(calculator).setVisible(true);   
//            }
//            }));
//       contextMenu.add(new JMenuItem(new AbstractAction("Zamknij") {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            int opcja = JOptionPane.showConfirmDialog(parent.getContentPane(), "Czy na pewno chcesz zamknąć?");
//            if (opcja == 0)
//            {
//                parent.dispose();  
//                calculator.dispose();
//            }   
//            }
//    }));
//    contextMenu.add(new JMenuItem("Copy"));
//    contextMenu.add(new JMenuItem("paste"));
//    contextMenu.add(new JMenuItem("delete"));
//    textArea.addMouseListener(new MouseAdapter() 
//    {
//        @Override
//            public void mouseReleased(MouseEvent me) 
//            {
//                if(me.getClickCount() == 3 && me.getButton() == MouseEvent.BUTTON1 && me.isShiftDown())
//                    JOptionPane.showMessageDialog(parent.getContentPane(), "Click 3 times");
//                if(me.isPopupTrigger())
//                    contextMenu.show(me.getComponent(), me.getX(), me.getY());
//            }
//    });
       
       
       
    }
    
   
    
       
    
    
    
    
    
    
    
    
    private boolean czyToAscii(char zn)
    {
        
        for(int i =0; i < 255; i++)
            if(zn == i)
                return true;
        return false;
    }
    
    
    private class ActionSave extends AbstractAction
    {

        public ActionSave(String name, String prompt, String shortcut, Icon icon, int memonicKey)
        {
            this.putValue(Action.NAME, name);
            this.putValue(Action.SHORT_DESCRIPTION, prompt);
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(shortcut));
            this.putValue(Action.SMALL_ICON, icon);
            this.putValue(Action.MNEMONIC_KEY, memonicKey);
            
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
          this.setEnabled(flagTextArea = false);
          System.out.println("zapisano");  
        }
        
    }
     
   
    
   
    
}
