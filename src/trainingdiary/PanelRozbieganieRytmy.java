package trainingdiary;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class PanelRozbieganieRytmy extends JFrame
{
    private MyComboBox combo = new MyComboBox();
    private Font font = combo.getFont();
    private JLabel labelKm = new MyLabel("Km");
    private JLabel labelTime = new MyLabel("Czas");
    private JLabel labelMin = new MyLabel("[minuty]");
    private JLabel labelS = new MyLabel("[sekundy]");
    private JLabel labelSpeed = new MyLabel("Twoje tempo [min/km]");
    private JLabel labelRunCount = new MyLabel("Ilość rytmów");
    private JLabel labelRunDist = new MyLabel("Dystans [m]");
    private JLabel labelRunDistB = new MyLabel("Dystans powrotu [m]");
    private JLabel labelDescription = new MyLabel("Opis");
    private JLabel labelComments = new MyLabel("Uwagi");
    private JLabel labelTotalKm = new MyLabel("Suma km całego treningu");
    private JLabel labelTotalRunKm = new MyLabel("Suma km rytmów");
    private JSpinner spinnerKm = new JSpinner();
    private JSpinner spinnerMin = new JSpinner();
    private JSpinner spinnerS = new JSpinner();
    private JSpinner spinnerRunCount = new JSpinner();
    private JSpinner spinnerRunDist = new JSpinner();
    private JSpinner spinnerRunDistB = new JSpinner();
    private JTextField textFieldSpeed = new JTextField();
    private JTextField textFieldRunDist = new JTextField();
    private JTextArea textDescription =  new JTextArea("Tutaj napisz opis treningu");
    private JTextArea textComments =  new JTextArea("Tutaj napisz uwagi do treningu");
    private JSpinner spinnerTotalKm = new JSpinner();
    private JSeparator separator1 = new MySeparator();
    private JSeparator separator2 = new MySeparator();
    private JSeparator separator3 = new MySeparator();
    private JSeparator separator4 = new MySeparator();
    private JSeparator separator5 = new MySeparator();
    private JSeparator separator6 = new MySeparator();
    private JSeparator separator7 = new MySeparator();
    private double seconds = 0;
    private double minutes = 0;
    
    public PanelRozbieganieRytmy(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        new PanelMods().modifyTCount(spinnerS);
        new PanelMods().modifyTCount(spinnerKm);
        new PanelMods().modifyTCount(spinnerMin);
        new PanelMods().modifyTCount(spinnerTotalKm);
        new PanelMods().modifyTCount(spinnerRunDist);
        new PanelMods().modifyTCount(spinnerRunDistB);
        new PanelMods().modifyTCount(spinnerRunCount);
        new PanelMods().modifyText(textComments);
        new PanelMods().modifyText(textDescription);
        new PanelMods().modifyTextCampPlace(textFieldSpeed);
        new PanelMods().modifyTextCampPlace(textFieldRunDist);
        
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
                            .addComponent(labelTime, 350,350,350)
                            .addComponent(labelMin).addGap(20)
                            .addComponent(spinnerMin)
                            .addGap(20)
                            .addGroup
                            (
                                layout.createSequentialGroup()
                                    .addComponent(labelS).addGap(20)
                                    .addComponent(spinnerS)
                                    .addGap(20)
                                    .addGroup
                                    (
                                        layout.createSequentialGroup()
                                            .addComponent(labelSpeed).addGap(20)
                                            .addComponent(textFieldSpeed)
                                            .addGap(20)
                                    )
                            )      
                    )
                    .addComponent(separator2)
                    .addGap(20)
                    .addGroup
                    (
                        layout.createSequentialGroup()
                            .addComponent(labelRunCount, 350,350,350)
                            .addComponent(spinnerRunCount).addGap(20)
                            .addGap(20)
                            .addGroup
                            (
                                layout.createSequentialGroup()
                                    .addComponent(labelRunDist).addGap(20)
                                    .addComponent(spinnerRunDist)
                                    .addGap(20)
                                    .addGroup
                                    (
                                        layout.createSequentialGroup()
                                            .addComponent(labelRunDistB).addGap(20)
                                            .addComponent(spinnerRunDistB)
                                            .addGap(20)
                                    )
                            )
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
                            .addComponent(labelTotalRunKm, 350,350,350)
                            .addComponent(textFieldRunDist)
                            .addGap(20)
                    )
                    .addComponent(separator6)
                    .addGap(20)    
                    .addGroup
                    (
                        layout.createSequentialGroup()
                            .addComponent(labelTotalKm, 350,350,350)
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
                        .addComponent(labelKm)
                        .addComponent(spinnerKm)
                )
                .addGap(verticalGapBefore)
                .addComponent(separator1)
                .addGap(verticalGapAfter)
                .addGroup
                (
                    layout.createParallelGroup()
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(labelTime)
                                        .addComponent(spinnerMin)
                                        .addComponent(labelMin)      
                                )
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(spinnerS)
                                        .addComponent(labelS)      
                                )
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(labelSpeed)
                                        .addComponent(textFieldSpeed)      
                                )
                        )
                )
                .addGap(verticalGapBefore)
                .addComponent(separator2)
                .addGap(verticalGapAfter)
                .addGroup
                (
                    layout.createParallelGroup()
                        .addGroup
                        (
                            layout.createSequentialGroup()
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(labelRunCount)
                                        .addComponent(spinnerRunCount)      
                                )
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(labelRunDist)
                                        .addComponent(spinnerRunDist)      
                                )
                                .addGroup
                                (
                                    layout.createParallelGroup()
                                        .addComponent(labelRunDistB)
                                        .addComponent(spinnerRunDistB)      
                                )
                        )
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
                        .addComponent(labelTotalRunKm)
                        .addComponent(textFieldRunDist)
                )
                .addGap(verticalGapBefore)
                .addComponent(separator6)
                .addGap(verticalGapAfter)
                .addGroup
                (
                    layout.createParallelGroup()
                        .addComponent(labelTotalKm)
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
                minutes = (int) spinnerMin.getValue();
                double km = (int) spinnerKm.getValue();
                double speed = minutes/km;
                textFieldSpeed.setText("" + speed);
            }
        }); 
    }
}
