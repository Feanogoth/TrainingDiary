package trainingdiary;

import javax.swing.*;
import javax.swing.event.*;



public class PanelSprawdzian extends JFrame
{
    private JLabel labelDistance = new MyLabel("Dystans [m]");
    private JLabel labelTime = new MyLabel("Czas");
    private JLabel labelMin = new MyLabel("[minuty]");
    private JLabel labelS = new MyLabel("[sekundy]");
    private JLabel labelSS = new MyLabel("[setne sekundy]");
    private JLabel labelSpeed = new MyLabel("Twoje tempo [min/km]");
    private JLabel labelDescription = new MyLabel("Opis");
    private JLabel labelComments = new MyLabel("Uwagi");
    private JLabel labelShoes = new MyLabel("Obuwie");
    private JLabel labelTotalRunKm = new MyLabel("Suma km całego treningu");
    private JSpinner spinnerDistance = new JSpinner();
    private JSpinner spinnerMin = new JSpinner();
    private JSpinner spinnerS = new JSpinner();
    private JSpinner spinnerSS = new JSpinner();
    private JSpinner spinnerRunCount = new JSpinner();
    private JSpinner spinnerTotalKm = new JSpinner();
    private MyComboBox comboShoes = new MyComboBox();
    private JTextField textFieldSpeed = new JTextField();
    private JTextArea textDescription =  new JTextArea("Tutaj napisz opis treningu");
    private JTextArea textComments =  new JTextArea("Tutaj napisz uwagi do treningu");
    
    private JSeparator separator1 = new MySeparator();
    private JSeparator separator2 = new MySeparator();
    private JSeparator separator3 = new MySeparator();
    private JSeparator separator4 = new MySeparator();
    private JSeparator separator5 = new MySeparator();
    private JSeparator separator6 = new MySeparator();
    private JSeparator separator7 = new MySeparator();
    private double seconds = 0;
    private double minutes = 0;
    
    private String[] names = {"Buty", "Kolce"};
    
    public PanelSprawdzian(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        new PanelMods().modifyTCount(spinnerS);
        new PanelMods().modifyTCount(spinnerMin);
        new PanelMods().modifyTCount(spinnerTotalKm);
        new PanelMods().modifyTCount(spinnerRunCount);
        new PanelMods().modifyTCount(spinnerDistance);
        new PanelMods().modifyTCount(spinnerSS);
        new PanelMods().modifyText(textComments);
        new PanelMods().modifyText(textDescription);
        new PanelMods().modifyTextCampPlace(textFieldSpeed);
        new PanelMods().modifyComboTName(comboShoes, names);
        
        layout.setHorizontalGroup
        (
                layout.createParallelGroup()
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelDistance, 350,350,350)
                                .addComponent(spinnerDistance)
                                .addGap(20)
                    )
                    .addComponent(separator1)
                    .addGap(20)
                    .addGroup
                    (
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
                    .addComponent(separator2)
                    .addGap(20)
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelSpeed, 350,350,350)
                                .addComponent(textFieldSpeed)
                                .addGap(20)   
                    )
                    .addComponent(separator3)
                    .addGap(20)
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelDescription, 350,350,350)
                                .addComponent(textDescription, 100, 150, Short.MAX_VALUE)
                                .addGap(20)
                    )
                    .addComponent(separator4)
                    .addGap(20)    
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelComments, 350,350,350)
                                .addComponent(textComments, 100, 150, Short.MAX_VALUE)
                                .addGap(20)
                    )
                    .addComponent(separator5)
                    .addGap(20)    
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelShoes, 350,350,350)
                                .addComponent(comboShoes)
                                .addGap(20)
                    )
                    .addComponent(separator6)
                    .addGap(20)    
                    .addGroup
                    (
                        layout.createSequentialGroup()
                                .addComponent(labelTotalRunKm, 350,350,350)
                                .addComponent(spinnerTotalKm)
                                .addGap(20)
                    )
                    .addComponent(separator7)
                    .addGap(20)    
        );    
                        
        layout.setVerticalGroup
        (
                layout.createSequentialGroup()
                    .addGroup
                    (
                        layout.createParallelGroup()
                            .addComponent(labelDistance)
                            .addComponent(spinnerDistance)
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator1)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
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
                    .addComponent(separator2)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
                        layout.createParallelGroup()
                                .addComponent(labelSpeed)
                                .addComponent(textFieldSpeed)      
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator3)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
                        layout.createParallelGroup()
                                .addComponent(labelDescription)
                                .addComponent(textDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator4)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
                        layout.createParallelGroup()
                                .addComponent(labelComments)
                                .addComponent(textComments, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator5)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
                        layout.createParallelGroup()
                                .addComponent(labelShoes)
                                .addComponent(comboShoes)
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator6)
                    .addGap(verticalGapAfter)
                    .addGroup
                    (
                        layout.createParallelGroup()
                            .addComponent(labelTotalRunKm)
                            .addComponent(spinnerTotalKm)
                    )
                    .addGap(verticalGapBefore)
                    .addComponent(separator7)
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
}
