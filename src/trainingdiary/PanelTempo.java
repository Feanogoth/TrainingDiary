package trainingdiary;
import javax.swing.*;


public final class PanelTempo 
{
    private JLabel labelKm = new MyLabel("Km przed (BC1)");
    private JSpinner spinnerKm = new JSpinner();
    
    private JLabel labelShoes = new MyLabel("Obuwie");
    private MyComboBox comboShoes = new MyComboBox();
    private String[] names = {"Buty", "Kolce", "Buty i kolce"};
    private JLabel labelShoesDistance = new MyLabel("Dystans tempa w butach [m]");
    private JLabel labelSpikesDistance = new MyLabel("Dystans tempa w kolcach [m]");
    private JSpinner spinnerShoesDistance = new JSpinner();
    private JSpinner spinnerSpikesDistance = new JSpinner();
    
    private JLabel labelDescription = new MyLabel("Opis");
    private JTextArea textDescription =  new JTextArea("Tutaj napisz opis treningu");
    
    private JLabel labelComments = new MyLabel("Uwagi");
    private JTextArea textComments =  new JTextArea("Tutaj napisz uwagi do treningu");
    
    private JLabel labelTotalKm = new MyLabel("Suma km całego treningu");
    private JSpinner spinnerTotalKm = new JSpinner();
    
    private JSeparator separator1 = new MySeparator();
    private JSeparator separator2 = new MySeparator();
   private  JSeparator separator3 = new MySeparator();
    private JSeparator separator4 = new MySeparator();
   private  JSeparator separator5 = new MySeparator();
    
    public PanelTempo(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        
        new PanelMods().modifyTCount(spinnerKm);
        new PanelMods().modifyTCount(spinnerShoesDistance);
        new PanelMods().modifyTCount(spinnerSpikesDistance);
        new PanelMods().modifyTCount(spinnerTotalKm);
        new PanelMods().modifyText(textComments);
        new PanelMods().modifyText(textDescription);
        new PanelMods().modifyComboTName(comboShoes, names);
        
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
                                .addComponent(labelShoes, 350,350,350)
                                .addComponent(comboShoes).addGap(30)   
                                .addComponent(labelShoesDistance).addGap(20)   
                                .addComponent(spinnerShoesDistance).addGap(30)   
                                .addComponent(labelSpikesDistance).addGap(20)   
                                .addComponent(spinnerSpikesDistance)  
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
                                .addGroup
                                (
                                    layout.createSequentialGroup()
                                        .addGroup
                                        (
                                            layout.createParallelGroup()
                                                .addComponent(labelShoes)
                                                .addComponent(comboShoes)      
                                        )
                                        .addGroup
                                        (
                                            layout.createParallelGroup()
                                                .addComponent(labelShoesDistance)
                                                .addComponent(spinnerShoesDistance)
                                                .addComponent(labelSpikesDistance)
                                                .addComponent(spinnerSpikesDistance) 
                                        )
                                )
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
