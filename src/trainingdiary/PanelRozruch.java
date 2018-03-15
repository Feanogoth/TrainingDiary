package trainingdiary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public final class PanelRozruch 
{
    JLabel labelDescription = new MyLabel("Opis");
    JLabel labelComments = new MyLabel("Uwagi");
    JLabel labelTotalKm = new MyLabel("Suma km całego treningu");
    JTextArea textDescription =  new JTextArea();
    JTextArea textComments =  new JTextArea();
    JSpinner spinnerTotalKm = new JSpinner();
    JSeparator separator1 = new MySeparator();
    JSeparator separator2 = new MySeparator();
    JSeparator separator3 = new MySeparator();

    public PanelRozruch(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        modifyTCount(spinnerTotalKm);
        modifyTextCampPlace2(textComments);
        modifyTextCampPlace(textDescription);


        layout.setHorizontalGroup(
                layout.createParallelGroup()
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelDescription, 350, 350, 350)
                            .addComponent(textDescription, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator1)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelComments, 350,350,350)
                            .addComponent(textComments, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator2)
                    .addGap(20)
                    .addGroup(
                    layout.createSequentialGroup()
                            .addComponent(labelTotalKm, 350,350,350)
                            .addComponent(spinnerTotalKm)
                            .addGap(20)
                    )
                    .addComponent(separator3)
                    .addGap(20)    
                );
                        

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelDescription)
                        .addComponent(textDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator1)
                       .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelComments)
                        .addComponent(textComments, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator2)
                       .addGap(verticalGapAfter)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(labelTotalKm)
                        .addComponent(spinnerTotalKm)
                )
                        .addGap(verticalGapBefore)
                        .addComponent(separator3)
                        .addGap(verticalGapAfter)
                        .addGap(Short.MAX_VALUE)
            ); 
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
        text.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
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
        text.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
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
        text.setBackground(Colorss.colorCompBackNormal);
        text.setForeground(Colorss.colorForeground);
        text.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.LEFT);
    }   
    
}
