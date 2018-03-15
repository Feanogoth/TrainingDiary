//
//package trainingdiary;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.ComponentOrientation;
//import java.awt.Font;
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JSpinner;
//
//
//
//
//public class MySpinner extends JSpinner
//{
//    MyComboBox combo = new MyComboBox();
//    Font font = combo.getFont();
//    public MySpinner(MySpinner spinner) 
//    {
//        setFont(font);
//        setFont(new Font(this.getFont().getFamily(), Font.PLAIN, 18));
//        setBackground(new Color(45, 45, 45));
//        Component c = spinner.getEditor().getComponent(0);
//        c.setForeground(new Color(255, 255, 255));
//        c.setBackground(new Color(45, 45, 45));
//        c.setFocusable(false);
//        setButtonColors(this, new Color(45, 45, 45));
//        setBorder(BorderFactory.createSoftBevelBorder(0));
//        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//        
//    }
//    private static void setButtonColors(JSpinner spinner, Color background)
//    {
//        int n = spinner.getComponentCount();
//        for (int i=0; i<n; i++)
//        {
//            Component c = spinner.getComponent(i);
//            if (c instanceof JButton)
//            {
//                
//                c.setFocusable(false);
//                c.setBackground(background);
//                ((JButton) c).setBorder(BorderFactory.createSoftBevelBorder(0));
//                
//            }
//        }
//    }
//}
