package trainingdiary;

import javax.swing.*;


public final class PanelInny 
{
    private JLabel labelDescription = new MyLabel("Opis");
    private JLabel labelComments = new MyLabel("Uwagi");
    private JLabel labelTotalKm = new MyLabel("Suma km całego treningu");
    private JTextArea textDescription =  new JTextArea("Tutaj napisz opis treningu");
    private JTextArea textComments =  new JTextArea("Tutaj napisz uwagi do treningu");
    private JSpinner spinnerTotalKm = new JSpinner();
    private JSeparator separator1 = new MySeparator();
    private JSeparator separator2 = new MySeparator();
    private JSeparator separator3 = new MySeparator();

    public PanelInny(JPanel panel) 
    {
        int verticalGapAfter = 20;
        int verticalGapBefore = 5;
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        new PanelMods().modifyText(textDescription);
        new PanelMods().modifyText(textComments);
        new PanelMods().modifyTCount(spinnerTotalKm);

        layout.setHorizontalGroup
        (
                layout.createParallelGroup()
                    .addGroup
                    (
                        layout.createSequentialGroup()
                            .addComponent(labelDescription, 350, 350, 350)
                            .addComponent(textDescription, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator1)
                    .addGap(20)
                    .addGroup
                    (
                        layout.createSequentialGroup()
                            .addComponent(labelComments, 350,350,350)
                            .addComponent(textComments, 100, 150, Short.MAX_VALUE)
                            .addGap(20)
                    )
                    .addComponent(separator2)
                    .addGap(20)
                    .addGroup
                    (
                        layout.createSequentialGroup()
                            .addComponent(labelTotalKm, 350,350,350)
                            .addComponent(spinnerTotalKm)
                            .addGap(20)
                    )
                    .addComponent(separator3)
                    .addGap(20)    
                );
       
        layout.setVerticalGroup
        (
                layout.createSequentialGroup()
                .addGroup
                (
                    layout.createParallelGroup()
                        .addComponent(labelDescription)
                        .addComponent(textDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator1)
                       .addGap(verticalGapAfter)
                .addGroup
                (
                    layout.createParallelGroup()
                        .addComponent(labelComments)
                        .addComponent(textComments, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
                       .addGap(verticalGapBefore)
                       .addComponent(separator2)
                       .addGap(verticalGapAfter)
                .addGroup
                (
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
}
