package trainingdiary;
import javax.swing.*;
import java.awt.event.*;

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
    private JFrame calculator = new JFrame();
    
    public Menu(){}
    
    public Menu(JFrame parent)
    {
       parent.setJMenuBar(menuBar); 
       JMenu menuFile = menuBar.add(new JMenu("Plik"));
       JMenu menuMenu= menuBar.add(new JMenu("Menu"));
       JMenu menuTools = menuBar.add(new JMenu("Narzędzia"));
       JMenu menuHelp = menuBar.add(new JMenu("Pomoc"));
       JMenu menuSettings = menuBar.add(new JMenu("Ustawienia"));
       
       //menuFile items
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
       
       //menuMenu items
       JMenuItem itemStart = new JMenuItem("Otwórz MENU");
       menuMenu.add(itemStart);
       
       //menuTools items
       JMenuItem itemCalendar = new JMenuItem("Kalendarz");
       JMenuItem itemCalculator = new JMenuItem("Kalkulator tradycyjny");
       JMenuItem itemCalculatorRunner = new JMenuItem("Kalkulator biegacza");
       JMenuItem itemTmpNote = new JMenuItem("Tymczasowa notatka");
       menuCalculator.add(itemCalculator);
       menuCalculator.add(itemCalculatorRunner);
       menuTools.add(itemCalendar);
       menuTools.add(itemTmpNote);
       menuTools.add(menuCalculator);
       
       //menuHelp items
       JMenuItem itemDictionary = new JMenuItem("Słowniczek biegacza");
       JMenuItem itemTutorial = new JMenuItem("Samouczek");
       JMenuItem itemQuestion = new JMenuItem("Zgłoś problem/uwagi");
       menuHelp.add(itemDictionary);
       menuHelp.add(itemTutorial);
       menuHelp.add(itemQuestion);
       
       //menuSettings items
       JMenuItem itemFullScreen = new JMenuItem("Tryb pełnoekranowy");
       JMenuItem itemFullScreenExit = new JMenuItem("Tryb okna");
       JMenuItem itemSettings = new JMenuItem("Panel ustawień");
       menuSettings.add(itemFullScreen);
       menuSettings.add(itemFullScreenExit);
       menuSettings.add(itemSettings);
       
       
       //items events
       itemCalculator.addActionListener((ActionEvent ae) -> 
       {
           new Calc(calculator).setVisible(true);
       });
       itemStart.addActionListener((ActionEvent ae) -> 
       {
           new HelloMenu().setVisible(true);
       });
       subMenu.addActionListener((ActionEvent ae)->
        {
            System.out.println("Tu jest kod, który tworzy nowy plik");
        });
       
       
       
      
       
       

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
