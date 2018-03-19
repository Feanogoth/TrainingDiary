package trainingdiary;
import java.awt.*;
import javax.swing.*;

public final class PanelZabawaB
{
    private MyComboBox combo = new MyComboBox();
    private Font font = combo.getFont();
    private JLabel labelKm = new MyLabel("Km przed (BC1)");
    private JLabel labelKmZB = new MyLabel("Km odcinków zabawy biegowej");
    private JLabel labelDescription = new MyLabel("Opis");
    private JLabel labelComments = new MyLabel("Uwagi");
    private JLabel labelTotalKm = new MyLabel("Suma km całego treningu");
    private JSpinner spinnerKm = new JSpinner();
    private JSpinner spinnerKmZB = new JSpinner();
    private JTextArea textDescription =  new JTextArea("Tutaj napisz opis treningu");
    private JTextArea textComments =  new JTextArea("Tutaj napisz uwagi do treningu");
    private JSpinner spinnerTotalKm = new JSpinner();
    private JSeparator separator1 = new MySeparator();
    private JSeparator separator2 = new MySeparator();
    private JSeparator separator3 = new MySeparator();
    private JSeparator separator4 = new MySeparator();
    private JSeparator separator5 = new MySeparator();
    private double seconds = 0;
    private double minutes = 0;
    
    public PanelZabawaB(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
       
        new PanelMods().modifyTCount(spinnerKm);
        new PanelMods().modifyTCount(spinnerKmZB);
        new PanelMods().modifyTCount(spinnerTotalKm);
        new PanelMods().modifyText(textComments);
        new PanelMods().modifyText(textDescription);

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup
        (
                layout.createParallelGroup()
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                    .addComponent(labelKm, 350,350,350)
                                    .addComponent(spinnerKm)
                                    .addGap(20)
                        )
                        .addComponent(separator1)
                        .addGap(20)
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                    .addComponent(labelKmZB, 350,350,350)
                                    .addComponent(spinnerKmZB)
                                    .addGap(20)
                        )
                        .addComponent(separator2)
                        .addGap(20)
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                    .addComponent(labelDescription, 350,350,350)
                                    .addComponent(textDescription, 100, 150, Short.MAX_VALUE)
                                    .addGap(20)
                        )
                        .addComponent(separator3)
                        .addGap(20)    
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                    .addComponent(labelComments, 350,350,350)
                                    .addComponent(textComments, 100, 150, Short.MAX_VALUE)
                                    .addGap(20)
                        )
                        .addComponent(separator4)
                        .addGap(20)    
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                    .addComponent(labelTotalKm, 350,350,350)
                                    .addComponent(spinnerTotalKm)
                                    .addGap(20)
                        )
                        .addComponent(separator5)
                        .addGap(20)    
        );    
                        

        layout.setVerticalGroup
        (
                layout.createSequentialGroup()
                        .addGroup
                        (
                            layout.createParallelGroup()
                                    .addComponent(labelKm)
                                    .addComponent(spinnerKm)
                        )
                       .addGap(verticalGapBefore)
                       .addComponent(separator1)
                       .addGap(verticalGapAfter)
                        .addGroup
                        (
                            layout.createParallelGroup()
                                    .addComponent(labelKmZB)
                                    .addComponent(spinnerKmZB)
                        )
                       .addGap(verticalGapBefore)
                       .addComponent(separator2)
                       .addGap(verticalGapAfter)
                        .addGroup
                        (
                            layout.createParallelGroup()
                                    .addComponent(labelDescription)
                                    .addComponent(textDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator3)
                        .addGap(verticalGapAfter)
                        .addGroup
                        (
                            layout.createParallelGroup()
                                    .addComponent(labelComments)
                                    .addComponent(textComments, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator4)
                        .addGap(verticalGapAfter)
                        .addGroup
                        (
                            layout.createParallelGroup()
                                    .addComponent(labelTotalKm)
                                    .addComponent(spinnerTotalKm)
                        )
                        .addGap(verticalGapBefore)
                        .addComponent(separator5)
                        .addGap(verticalGapAfter)
                        .addGap(Short.MAX_VALUE)
        ); 
    }
}
