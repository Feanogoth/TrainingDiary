package trainingdiary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.plaf.basic.ComboPopup;


public class NewTraining extends JFrame implements WindowListener
{
     
    
    JPanel panel = new JPanel();
    JLabel time = new JLabel(getTime());
    private JLabel labelDate = new MyLabel("Wybierz datę treningu ");
    private JLabel labelCount = new MyLabel("Liczba treningów w wybranym dniu ");
    private JLabel labelTName = new MyLabel("Typ treningu ");
    String[] names =  {"Inny", "Rozbieganie(BC1)", "Rozbieganie + rytmy", "Rozruch", "Siła biegowa", "Sprawdzian", "Szybkość", "Tempo(BC3)", "Wycieczka", "Zabawa Biegowa", "Zakres(BC2)", "ZAWODY"};
    private JLabel labelPlace = new MyLabel("Miejsce ");
    String[] places = {"Dom", "Obóz"};
    private JLabel labelCampPlace = new MyLabel("Miejscowość ");
    JSpinner spinner1 = new JSpinner();
    JSpinner spinner2 = new JSpinner();
    MyComboBox comboTName = new MyComboBox();
    MyComboBox comboTPlace = new MyComboBox();
    JTextField textCampPlace = new JTextField();
    Font font = comboTName.getFont();;
    JPanel trainingDescriptionsPanel = new JPanel();
    
    JSeparator separator1 = new MySeparator();
    JSeparator separator2 = new MySeparator();
    JSeparator separator3 = new MySeparator();
    JSeparator separator4 = new MySeparator();
    JSeparator separator5 = new MySeparator();
    JSeparator separator6 = new MySeparator();
    JSeparator separator7 = new MySeparator();
    JSeparator separator8 = new MySeparator();
    JSeparator separator9 = new MySeparator();
    JSeparator separator10 = new MySeparator();
    JSeparator separator11 = new MySeparator();
    
    //zamisat tak to dodac frupa dwóch el i separator i tak dalej, bediz elepiej wygladac
    
    
    
    int verticalGapAfter = 20;
    int verticalGapBefore = 5;
    
    public NewTraining()
    {
       // new HelloMenu().setVisible(true);
        
        JFrame frame = new MyFrame(this, "Dzienniczek Treningowy");
        
        this.addWindowListener(this);
        
        
        frame.getContentPane().add(new MyScroll().makeUI(trainingDescriptionsPanel));
        
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
     
        
        
        
    }

    public void initComponents()
    {
//        new Menu(this);
        initActions();
        modifyDate(spinner1);
        modifyTCount(spinner2);
        modifyComboTName(comboTName);
        modifyComboTPlace(comboTPlace);
        modifyTextCampPlace(textCampPlace);
        
        
        
        
        labelCampPlace.setVisible(false);
        textCampPlace.setVisible(false);
        separator6.setVisible(false);
        
        
        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        
        this.getContentPane().setLayout(layout);
        this.getContentPane().setBackground(new Colors().getColorBackground());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
       
        panel.setBackground(new Colors().getColorBackground());
        trainingDescriptionsPanel.setBackground(new Colors().getColorBackground());
        JComponent scroll = new MyScroll().makeUI(trainingDescriptionsPanel);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        

        int h = panel.getSize().height;
        int height = (Toolkit.getDefaultToolkit().getScreenSize().height)/2;
        int p = height - h;
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(panel)
                        .addComponent(scroll)
                )
                
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(panel)
                        .addComponent(scroll,height,height,height)
                        .addGap(Short.MAX_VALUE)
                );
        
        GroupLayout layoutTop = new GroupLayout(panel);
        panel.setLayout(layoutTop);

        
        layoutTop.setHorizontalGroup(
                layoutTop.createParallelGroup()
                        .addGap(20)
                        .addComponent(this.time)
                        .addComponent(separator1)
                        .addGap(20)
                        .addGroup(
                        layoutTop.createSequentialGroup()
                                .addComponent(labelDate, 350,350,350)
                                .addComponent(spinner1)
                                .addGap(20)
                        )
                        .addComponent(separator2)
                        .addGap(20)
                        .addGroup(
                        layoutTop.createSequentialGroup()
                                .addComponent(labelCount, 350,350,350)
                                .addComponent(spinner2)
                                .addGap(20)
                        )
                        .addComponent(separator3)
                        .addGap(20)
                        .addGroup(
                        layoutTop.createSequentialGroup()
                                .addComponent(labelTName, 350,350,350)
                                .addComponent(comboTName)
                                .addGap(20)
                        )
                        .addComponent(separator4)
                        .addGap(20)
                        .addGroup(
                        layoutTop.createSequentialGroup()
                                .addComponent(labelPlace, 350,350,350)
                                .addComponent(comboTPlace)
                                .addGap(20)
                        )
                        .addComponent(separator5)
                        .addGap(20)
                        .addGroup(
                        layoutTop.createSequentialGroup()
                                .addComponent(labelCampPlace, 350,350,350)
                                .addComponent(textCampPlace, 100, 150, Short.MAX_VALUE)
                                .addGap(20)
                        )
                        .addComponent(separator6)
                        .addGap(20)
                
//                        .addGap(50, 1000, 1000)
        );
//               layoutTop.setHorizontalGroup(         
//                layoutTop.createSequentialGroup()
//                .addGroup(
//                layoutTop.createParallelGroup()
//                        
//                        .addComponent(this.time)
//                           // .addComponent(separator1)
//                        .addComponent(labelDate)
//                           // .addComponent(separator2)
//                        .addComponent(labelCount)
//                           // .addComponent(separator3)
//                        .addComponent(labelTName)
//                           // .addComponent(separator4)
//                        .addComponent(labelPlace)
//                           // .addComponent(separator5)
//                        .addComponent(labelCampPlace)  
//                          //  .addComponent(separator6)
//                )
//                       
//               
//                .addGroup(
//                layoutTop.createParallelGroup()
//                        .addComponent(spinner1)
//                            //.addComponent(separator2)
//                        .addComponent(spinner2)
//                           // .addComponent(separator8)
//                        .addComponent(comboTName)
//                          //  .addComponent(separator9)
//                        .addComponent(comboTPlace)
//                           // .addComponent(separator10)
//                        .addComponent(textCampPlace, 100, 150, Short.MAX_VALUE)
//                           // .addComponent(separator11)
//                        
//                )
////                          .addComponent(separator1)
////                          .addComponent(separator2)
////                          .addComponent(separator3)
////                          .addComponent(separator4)
////                          .addComponent(separator5)
////                          .addComponent(separator6)
//                .addGap(50, 1000, 1000)
//                
//
//                );
               
        
        layoutTop.setVerticalGroup(
                layoutTop.createSequentialGroup()
                        .addComponent(this.time)
                        .addGap(verticalGapBefore)
                        .addComponent(separator1)
                        .addGap(verticalGapAfter)
                        .addGap(30)
                .addGroup(
                layoutTop.createParallelGroup()
                        .addComponent(labelDate)
                        .addComponent(spinner1)    
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator2)
                        .addGap(verticalGapAfter)
                .addGroup(
                layoutTop.createParallelGroup()
                        .addComponent(labelCount)
                        .addComponent(spinner2)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator3)
                        .addGap(verticalGapAfter)
                .addGroup(
                layoutTop.createParallelGroup()
                        .addComponent(labelTName)
                        .addComponent(comboTName)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator4)
                        .addGap(verticalGapAfter)
                .addGroup(
                layoutTop.createParallelGroup()
                        .addComponent(labelPlace)
                        .addComponent(comboTPlace)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator5)
                        .addGap(verticalGapAfter)
                .addGroup(
                layoutTop.createParallelGroup()
                        .addComponent(labelCampPlace)
                        .addComponent(textCampPlace, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator6)
                        .addGap(verticalGapAfter)
                .addGap(20)
                );
        
    
        pack(); 

        
       
        
        ActionListener stoper = new Watch();
        Timer watch = new Timer(100, stoper);
        watch.start();
        
        
     
        
        
            
        
        
        
        
        
        trainingDescriptionsPanel.addMouseListener(new PopClickListener());
        
        ContextMenu contextMenu = new ContextMenu(this);
        
//        new ContextMenu(trainingDescriptionsPanel);
//       new Menu(this);
        
    }
    
    public JFrame getFrame()
    {
        return this;
    }
    
    public void initActions()
    {
        
        comboTPlace.addActionListener(new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {


                if (comboTPlace.getSelectedItem().equals("Obóz"))
                {
                    labelCampPlace.setVisible(true);
                    textCampPlace.setVisible(true);
                    separator6.setVisible(true);
                }
                else
                {
                    labelCampPlace.setVisible(false);
                    textCampPlace.setVisible(false);
                    separator6.setVisible(false);
                }
            }
        });
         
        comboTName.addActionListener(new AbstractAction() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(comboTName.getSelectedItem().equals("Rozbieganie(BC1)"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelRozbieganie(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Wycieczka"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelWycieczka(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Rozbieganie + rytmy"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelRozbieganieRytmy(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Inny"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelInny(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Rozruch"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelRozruch(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Siła biegowa"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelSilaB(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Sprawdzian"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelSprawdzian(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Szybkość"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelSzybkosc(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Tempo(BC3)"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelTempo(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Zabawa Biegowa"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelZabawaB(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("Zakres(BC2)"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelZakres(trainingDescriptionsPanel);
                }
                if(comboTName.getSelectedItem().equals("ZAWODY"))
                {
                    trainingDescriptionsPanel.removeAll();
                    new PanelZawody(trainingDescriptionsPanel);
                }
            }
        });
        
    }
    
    
    
    
    private class Watch implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
           
                
            time.setText(getTime());
            time.setForeground(new Colors().getColorOrnamentations());
            time.setFont(new Font("Dialog", Font.BOLD, 25));
        }
        
    }
    public String getTime()
    {
         GregorianCalendar calendar = new GregorianCalendar();
            String year = ""+ calendar.get(Calendar.YEAR);
            int month =  calendar.get(Calendar.MONTH)+1;
            String day = ""+ calendar.get(Calendar.DAY_OF_MONTH);
            int dayW = (calendar.get(Calendar.DAY_OF_WEEK));
            
            String h = ""+ calendar.get(Calendar.HOUR_OF_DAY);
            String m = ""+calendar.get(Calendar.MINUTE);
            String s = ""+calendar.get(Calendar.SECOND);
            String ms = ""+calendar.get(Calendar.MILLISECOND);
            String monthString = "";
            String dayWString = "";
            switch (month) {
            case 1:  monthString = "stycznia";
                     break;
            case 2:  monthString = "lutego";
                     break;
            case 3:  monthString = "marca";
                     break;
            case 4:  monthString = "kwietnia";
                     break;
            case 5:  monthString = "maja";
                     break;
            case 6:  monthString = "czerwca";
                     break;
            case 7:  monthString = "lipca";
                     break;
            case 8:  monthString = "sierpnia";
                     break;
            case 9:  monthString = "września";
                     break;
            case 10: monthString = "października";
                     break;
            case 11: monthString = "listopada";
                     break;
            case 12: monthString = "grudnia";
                     break;
            }
            switch (dayW) {
            case 1:  dayWString = "Niedziela";
                     break;
            case 2:  dayWString = "Poniedziałek";
                     break;
            case 3:  dayWString = "Wtorek";
                     break;
            case 4:  dayWString = "Środa";
                     break;
            case 5:  dayWString = "Czwartek";
                     break;
            case 6:  dayWString = "Piatek";
                     break;
            case 7:  dayWString = "Sobota";
                     break;
            
            }
//            if (h.length() < 2)
//            h = "0"+h;
//            if (m.length() < 2)
//            m = "0"+m;
//            if (s.length() < 2)
//            s = "0"+s;
//            if (ms.length() < 3)
//            ms = "0"+ms;
//            if (Integer.parseInt(ms) < 100)
//                ms = "0" + ms;
        System.out.println(dayW);
        return "Dziś jest: "+dayWString+", " +day +" "+ monthString +" "+year;
    }

    @Override
    public void windowOpened(WindowEvent we) 
    {
        //JOptionPane.showMessageDialog(rootPane, "Witaj!");
    }

    @Override
    public void windowClosing(WindowEvent we)    
    {
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
   
    
    public void modifyDate(JSpinner spinner1)
    {
        
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime(); 
        calendar.add(Calendar.DAY_OF_MONTH, -200000);    
        Date backDay = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, 400000);
        Date futureDay = calendar.getTime(); 

        SpinnerDateModel modelDat = new SpinnerDateModel(currentDate, backDay, futureDay, Calendar.DAY_OF_MONTH);
        
        spinner1.getInsets().set(20, 20, 20, 20);
        spinner1.setModel(modelDat);
        JSpinner.DateEditor ar = new JSpinner.DateEditor(spinner1, "dd MMMMM yyyy  EEEEE");
        spinner1.setEditor(ar);
        
        spinner1.setFont(font);
        spinner1.setFont(new Font(spinner1.getFont().getFamily(), Font.PLAIN, 18));
        spinner1.setBackground(new Colors().getColorCompBackN());
       
        Component c = spinner1.getEditor().getComponent(0);
        c.setForeground(new Colors().getColorForeground());
        c.setBackground(new Colors().getColorCompBackN());
        c.setFocusable(false);
        
        setButtonColors(spinner1, new Colors().getColorCompBackN());
        spinner1.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        spinner1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
          
    }
    public void modifyTCount(JSpinner spinner)
    {
        SpinnerNumberModel modelLiczb = new SpinnerNumberModel(1, 0, 5, 1);  // to co poczatkowo sie wyswietla, wartosc minimalna, wartosc maksymalna, skok
        
        
        
        
        
        
        spinner.setModel(modelLiczb);
        
        spinner.setFont(font);
        spinner.setFont(new Font(spinner.getFont().getFamily(), Font.PLAIN, 18));
        spinner.setBackground(new Colors().getColorCompBackN());

        JComponent editor = spinner.getEditor();
        
        if (editor instanceof JSpinner.DefaultEditor)
        {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
            spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT); 
            
        }
        Component c = spinner.getEditor().getComponent(0);
        c.setForeground(new Colors().getColorForeground());
        c.setBackground(new Colors().getColorCompBackN());
        c.setFocusable(false);
        setButtonColors(spinner, new Colors().getColorCompBackN());
        spinner.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        spinner.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
    }
        
    private static void setButtonColors(JSpinner spinner, Color background)
    {
        int n = spinner.getComponentCount();
        for (int i=0; i<n; i++)
        {
            Component c = spinner.getComponent(i);
            if (c instanceof JButton)
            {
                
                c.setFocusable(false);
                c.setBackground(background);
                ((JButton) c).setBorder(BorderFactory.createSoftBevelBorder(0));
                
            }
        }
    }
    public void modifyComboTName(MyComboBox combo)
    {
        
        
        setButtonComboColors(combo, new Colors().getColorCompBackN());
        combo.setEditable(true);
        combo.addItems(names);
        combo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       
//        
//        combo.setUI(new BasicComboBoxUI() {
//            @Override
//            protected ComboPopup createPopup() {
//                return new BasicComboPopup(comboBox) {
//                    @Override
//                    protected JScrollPane createScroller() {
//                        JScrollPane scroller = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
//                                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//                        scroller.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
//                            @Override
//                            protected JButton createDecreaseButton(int orientation) {
//                                JButton tmp = createZeroButton();
//                                tmp.setBackground(Color.BLACK);
//                                tmp.setForeground(Color.white);
//                                return tmp;
//                            }
//
//                            @Override
//                            protected JButton createIncreaseButton(int orientation) {
//                                JButton tmp = createZeroButton();
//                                tmp.setBackground(Color.BLACK);
//                                tmp.setForeground(Color.white);
//                                return tmp;
//                            }
//
//                            @Override
//                            public Dimension getPreferredSize(JComponent c) {
//                                return new Dimension(10, super.getPreferredSize(c).height);
//                            }
//
//                            private JButton createZeroButton() {
//                                return new JButton() {
//                                    @Override
//                                    public Dimension getMinimumSize() {
//                                        return new Dimension(new Dimension(0, 0));
//                                    }
//
//                                    @Override
//                                    public Dimension getPreferredSize() {
//                                        return new Dimension(new Dimension(0, 0));
//                                    }
//
//                                    @Override
//                                    public Dimension getMaximumSize() {
//                                        return new Dimension(new Dimension(0, 0));
//                                    }
//                                };
//                            }
//                        });
//                        return scroller;
//                    }
//                };
//            }
//        });
        
        
        
    }
    
    private static void setButtonComboColors(MyComboBox combo, Color background)
    {
        int n = combo.getComponentCount();
        for (int i=0; i<n; i++)
        {
            Component c = combo.getComponent(i);
            if (c instanceof JButton)
            {
                
                c.setBackground(background.brighter());
                ((JButton) c).setBorder(BorderFactory.createSoftBevelBorder(0));
            }
        }
    }
    
    
    public void modifyComboTPlace(MyComboBox combo)
    {
        setButtonComboColors(combo, new Colors().getColorCompBackN());
        combo.setEditable(true);
        combo.addItems(places);
        combo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
    public void modifyTextCampPlace(JTextField text)
    {
        
        text.setFont(font);
        text.setFont(new Font(text.getFont().getFamily(), Font.PLAIN, 18));
        text.setBackground(new Colors().getColorCompBackN());
        text.setForeground(new Color(130, 130, 130).darker());
        text.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        text.setText("Wpisz miejscowość zgrupowania");
        text.setHorizontalAlignment(JTextField.LEFT);
        text.addFocusListener(new FocusAdapter() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                textIsActive(text);
            }
            @Override
            public void focusLost(FocusEvent fe) 
            {
                textIsDisActive(text);
            }
            
        });
    }
    public void textIsActive(JTextField text)
    {
        if(text.getText().equals("Wpisz miejscowość zgrupowania"))
        {
            text.setText("");
            text.setForeground(new Colors().getColorForeground());
        }
    }
    public void textIsDisActive(JTextField text)
    {
        if(text.getText().equals(""))
        {
            text.setText("Wpisz miejscowość zgrupowania");
            text.setForeground(new Color(130, 130, 130).darker());
        }
    }
}

class PopClickListener extends MouseAdapter {
    public void mousePressed(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
    }

    public void mouseReleased(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
    }

    private void doPop(MouseEvent e){
        ContextMenu menu = new ContextMenu(new NewTraining().getFrame());
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
}




