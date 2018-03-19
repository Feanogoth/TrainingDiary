package trainingdiary;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;

public class MyComboBox extends JComboBox 
{
    private DefaultComboBoxModel model;
     
    public MyComboBox() 
    {
        model = new DefaultComboBoxModel();
        setOpaque(true);
        setModel(model);
        setRenderer(new TrainingTypeItemRenderer());
        setEditor(new TrainingTypeItemEditor());
    }

    public void addItems(String[] items) 
    {
        for (String anItem : items) 
        {
            model.addElement(anItem);
        }
    }
}

class TrainingTypeItemRenderer extends JPanel implements ListCellRenderer 
{
    private JLabel labelItem = new JLabel();
     
    public TrainingTypeItemRenderer() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        labelItem.setBorder(BorderFactory.createSoftBevelBorder(0));
        labelItem.setOpaque(true);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setFont(new Font("Dialog", Font.PLAIN, 18));
        add(labelItem, constraints);
        setBackground(Colorss.colorCompBackNormal);
    }
     
    @Override
    public Component getListCellRendererComponent(JList list, Object value,
        int index, boolean isSelected, boolean cellHasFocus) 
    {
        String countryItem = (String) value;
        labelItem.setText(countryItem);
        labelItem.setBorder(BorderFactory.createSoftBevelBorder(0)); 
        if (isSelected) 
        {
            labelItem.setBackground(Colorss.colorForeground);
            labelItem.setForeground(Colorss.colorCompBackNormal);
        }
        else 
        {
            labelItem.setForeground(Colorss.colorForeground);
            labelItem.setBackground(Colorss.colorCompBackNormal);
        }
        return this;
    }
}
class TrainingTypeItemEditor extends BasicComboBoxEditor 
{
    private JPanel panel = new JPanel();
    private JLabel labelItem = new JLabel();
    private String selectedValue;
     
    public TrainingTypeItemEditor() 
    {
        labelItem.setFont(new Font("Dialog", Font.PLAIN, 18));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 5, 2, 2);
        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setForeground(Colorss.colorForeground);
        panel.add(labelItem, constraints);
        panel.setBackground(Colorss.colorCompBackNormal);       
    }
     
    @Override
    public Component getEditorComponent() 
    {
        return this.panel;
    }
     
    @Override
    public Object getItem() 
    {
        return this.selectedValue;
    }
     
    @Override
    public void setItem(Object item) 
    {
        if (item == null) 
        {
            return;
        }
        String countryItem = (String) item;
        selectedValue = countryItem;
        labelItem.setText(selectedValue); 
    }
}