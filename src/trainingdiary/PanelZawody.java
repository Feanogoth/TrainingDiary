package trainingdiary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class PanelZawody extends JFrame
{
    JLabel labelType = new MyLabel("Rodzaj zawodów");
    String[] namesType = {"Bieżnia", "Hala", "Przełaj", "Ulica", "Inne"};
    MyComboBox comboType = new MyComboBox();
    
    JLabel labelShoes = new MyLabel("Obuwie");
    String[] names = {"Buty", "Kolce"};
    MyComboBox comboShoes = new MyComboBox();
    
    JLabel labelDistance = new MyLabel("Dystans [m]");
    JSpinner spinnerDistance = new JSpinner();
    
    JLabel labelTime = new MyLabel("Czas");
    JLabel labelMin = new MyLabel("[minuty]");
    JSpinner spinnerMin = new JSpinner();
    JLabel labelS = new MyLabel("[sekundy]");
    JSpinner spinnerS = new JSpinner();
    JLabel labelSS = new MyLabel("[setne sekundy]");
    JSpinner spinnerSS = new JSpinner();
    JLabel labelSpeed = new MyLabel("Twoje tempo [min/km]");
    JTextField textFieldSpeed = new JTextField();
    
    JLabel labelRank = new MyLabel("Ranga zawodów");
    String[] namesRank = {"Mistrzostwa Świata", "Mistrzostwa Polski itd. uzupełnic"};
    MyComboBox comboRank = new MyComboBox();
    
    JLabel labelCampPlace = new MyLabel("Miejscowość ");
    JTextField textCampPlace = new JTextField();
    
    JLabel labelDescription = new MyLabel("Opis");
    JTextArea textDescription =  new JTextArea();
    
    
    JLabel labelComments = new MyLabel("Uwagi");
    JTextArea textComments =  new JTextArea();
    
    JLabel labelTotalRunKm = new MyLabel("Suma km (dstans + rozgrzewka itp.)");
    JSpinner spinnerTotalKm = new JSpinner();
    
    
    
    
    
    
    
    
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
    double seconds = 0;
    double minutes = 0;
    
    
    
    public PanelZawody(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        
        modifyTCount(spinnerS);
        modifyTCount(spinnerMin);
        modifyTCount(spinnerTotalKm);
        modifyTCount(spinnerDistance);
        modifyTCount(spinnerSS);
        modifyTextCampPlace2(textComments);
        modifyTextCampPlace(textDescription);
        modifyTextCampPlace(textFieldSpeed);
        modifyComboTName(comboShoes);
        modifyComboType(comboType);
        modifyComboRank(comboRank);
        modifyTextStartPlace(textCampPlace);
        
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelType, 350,350,350)
                            .addComponent(comboType)
                            .addGap(20)
                    )
                    .addComponent(separator1)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelShoes, 350,350,350)
                            .addComponent(comboShoes)
                            .addGap(20)
                    )
                    .addComponent(separator2)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelDistance, 350,350,350)
                            .addComponent(spinnerDistance)
                            .addGap(20)
                    )
                    .addComponent(separator3)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                                    .addComponent(labelTime, 350,350,350)
                                    .addComponent(labelMin).addGap(20)
                                    .addComponent(spinnerMin).addGap(30)
                                    .addComponent(labelS).addGap(20)
                                    .addComponent(spinnerS).addGap(30)
                                    .addComponent(labelSS).addGap(20)
                                    .addComponent(spinnerSS)
                                    .addGap(20)       
                    )
                    .addComponent(separator4)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                                    .addComponent(labelSpeed, 350,350,350)
                                    .addComponent(textFieldSpeed)
                                    .addGap(20)   
                    )
                    .addComponent(separator5)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelRank, 350,350,350)
                            .addComponent(comboRank)
                            .addGap(20)
                    )
                    .addComponent(separator6)
                    .addGap(20)
                    .addGroup(
                        layout.createSequentialGroup()
                            .addComponent(labelCampPlace, 350,350,350)
                            .addComponent(textCampPlace, 100, 150, Short.MAX_VALUE)
                            .addGap(20)  
                    )
                    .addComponent(separator7)
                    .addGap(20) 
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelDescription, 350,350,350)
                            .addComponent(textDescription, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator8)
                    .addGap(20)    
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelComments, 350,350,350)
                            .addComponent(textComments, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator9)
                    .addGap(20)    
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelTotalRunKm, 350,350,350)
                            .addComponent(spinnerTotalKm)
                            .addGap(20)
                    )
                    .addComponent(separator10)
                    .addGap(20)    
                    );    
                        

        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelType)
                        .addComponent(comboType)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator1)
                       .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelShoes)
                        .addComponent(comboShoes)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator2)
                       .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelDistance)
                        .addComponent(spinnerDistance)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator3)
                       .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelTime)
                        .addComponent(spinnerMin)
                        .addComponent(labelMin)
                        .addComponent(labelS)
                        .addComponent(spinnerS)
                        .addComponent(labelSS)
                        .addComponent(spinnerSS)
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator4)
                        .addGap(verticalGapAfter)
                        .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelSpeed)
                        .addComponent(textFieldSpeed)      
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator5)
                        .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelRank)
                        .addComponent(comboRank)      
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator6)
                        .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelCampPlace)
                        .addComponent(textCampPlace)      
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator7)
                        .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelDescription)
                        .addComponent(textDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator8)
                        .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelComments)
                        .addComponent(textComments, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator9)
                        .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelTotalRunKm)
                        .addComponent(spinnerTotalKm)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator10)
                        .addGap(verticalGapAfter)
                .addGap(Short.MAX_VALUE)
                );
        
        spinnerMin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) 
            {
//                minutes = (int) spinnerMin.getValue();
//                double km = (int) spinnerKm.getValue();
//                double speed = minutes/km;
//                textFieldSpeed.setText("" + speed);
            }
        });
                
        
        
    }

    
    
    
    
    
    
    public void modifyTCount(JSpinner spinner)
    {
        SpinnerNumberModel modelNumbers = new SpinnerNumberModel(0, 0, 1000, 1);  
        spinner.setModel(modelNumbers);
        spinner.setFont(new Font("Dialog", Font.PLAIN, 18));
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
    
    
    
    
    
     public void modifyTextCampPlace(JTextArea text)
    {
        text.setFont(new Font("Dialog", Font.PLAIN, 18));
        text.setBackground(new Colors().getColorCompBackN());
        text.setForeground(new Color(130, 130, 130).darker());
        text.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        
        
        textDescription.setText("Tutaj napisz opis treningu");
        
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
     public void modifyTextCampPlace2(JTextArea text)
    {
        text.setFont(new Font("Dialog", Font.PLAIN, 18));
        text.setBackground(new Colors().getColorCompBackN());
        text.setForeground(new Color(130, 130, 130).darker());
        text.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        
        textComments.setText("Tutaj napisz uwagi do treningu");
        textDescription.setText("Tutaj napisz opis treningu");
        
        text.addFocusListener(new FocusAdapter() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                textIsActive2(text);
            }
            @Override
            public void focusLost(FocusEvent fe) 
            {
                textIsDisActive2(text);
            }
        });
    }
    public void textIsActive(JTextArea text)
    {
      
        if(text.getText().equals("Tutaj napisz opis treningu"))
        {
            text.setText("");
            text.setForeground(new Colors().getColorForeground());
        }
    }
    public void textIsDisActive(JTextArea text)
    {
        if(text.getText().equals(""))
        {
           
            text.setText("Tutaj napisz opis treningu");
            text.setForeground(new Color(130, 130, 130).darker());
        }
    }
    public void textIsActive2(JTextArea text)
    {
      
        if(text.getText().equals("Tutaj napisz uwagi do treningu"))
        {
            text.setText("");
            text.setForeground(new Colors().getColorForeground());
        }
    }
    public void textIsDisActive2(JTextArea text)
    {
        if(text.getText().equals(""))
        {
            textComments.setText("Tutaj napisz uwagi do treningu");
            
            text.setForeground(new Color(130, 130, 130).darker());
        }
    }
     public void modifyTextCampPlace(JTextField text)
    {
        text.setFont(new Font("Dialog", Font.PLAIN, 18));
        text.setBackground(new Colors().getColorCompBackN());
        text.setForeground(new Colors().getColorForeground());
        text.setBorder(BorderFactory.createLineBorder(new Colors().getColorCompBackN(), 4));
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.LEFT);
       
    }  
      public void modifyComboTName(MyComboBox combo)
    {
        setButtonComboColors(combo, new Colors().getColorCompBackN());
        combo.setEditable(true);
        combo.addItems(names);
        combo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
      public void modifyComboType(MyComboBox combo)
    {
        setButtonComboColors(combo, new Colors().getColorCompBackN());
        combo.setEditable(true);
        combo.addItems(namesType);
        combo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }
      public void modifyComboRank(MyComboBox combo)
    {
        setButtonComboColors(combo, new Colors().getColorCompBackN());
        combo.setEditable(true);
        combo.addItems(namesRank);
        combo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
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
        public void modifyTextStartPlace(JTextField text)
    {
        text.setFont(new Font(text.getFont().getFamily(), Font.PLAIN, 18));
        text.setBackground(Colorss.colorCompBackNormal);
        text.setForeground(new Color(130, 130, 130).darker());
        text.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
        text.setText("Wpisz miejscowość zawodów");
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
        if(text.getText().equals("Wpisz miejscowość zawodów"))
        {
            text.setText("");
            text.setForeground(new Colors().getColorForeground());
        }
    }
    public void textIsDisActive(JTextField text)
    {
        if(text.getText().equals(""))
        {
            text.setText("Wpisz miejscowość zawodów");
            text.setForeground(new Color(130, 130, 130).darker());
        }
    } 
}
