package trainingdiary;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelMods 
{
        public void modifyTCount(JSpinner spinner)
    {
        SpinnerNumberModel modelNumbers = new SpinnerNumberModel(0, 0, 1000, 1);  
        spinner.setModel(modelNumbers);
        
        spinner.setFont(new Font("Dialog", Font.PLAIN, 18));
        spinner.setBackground(Colorss.colorCompBackNormal);

        JComponent editor = spinner.getEditor();
        
        if (editor instanceof JSpinner.DefaultEditor)
        {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
            spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);   
        }
        Component c = spinner.getEditor().getComponent(0);
        c.setForeground(Colorss.colorForeground);
        c.setBackground(Colorss.colorCompBackNormal);
        c.setFocusable(false);
        setButtonColors(spinner, Colorss.colorCompBackNormal);
        spinner.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
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
    

     public void modifyText(JTextArea text)
    {
        String start = text.getText();
        System.out.println(start);
        text.setFont(new Font("Dialog", Font.PLAIN, 18));
        text.setBackground(Colorss.colorCompBackNormal);
        text.setForeground(new Color(130, 130, 130).darker());
        text.setBorder(BorderFactory.createLineBorder(Colorss.colorCompBackNormal, 4));
        text.addFocusListener(new FocusAdapter() 
        {
            @Override
            public void focusGained(FocusEvent fe) 
            {
                textIsActive(text, start);
            }
            @Override
            public void focusLost(FocusEvent fe) 
            {
                textIsDisActive(text, start);
            }
        });
    }
    public void textIsActive(JTextArea text, String start)
    {
        if(text.getText().equals(start))
        {
            text.setText("");
            text.setForeground(Colorss.colorForeground);
        }
    }
    public void textIsDisActive(JTextArea text, String start)
    {
        if(text.getText().equals(""))
        {
            text.setText(start);
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
    
     
     public void modifyComboTName(MyComboBox combo, String[] names)
    {
        setButtonComboColors(combo, Colorss.colorCompBackNormal);
        combo.setEditable(true);
        combo.addItems(names);
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
            text.setForeground(Colorss.colorForeground);
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