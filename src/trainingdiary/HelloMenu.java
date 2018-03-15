/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingdiary;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;


/**
 *
 * @author szyos
 */
public class HelloMenu extends javax.swing.JFrame implements WindowListener{

    /**
     * Creates new form HelloMenu
     */
    public HelloMenu() {
       
        initComponents();
        newTrainingButton.setFocusPainted(false);
        newTrainingButton.setContentAreaFilled(false);
        newTrainingButton.setOpaque(true);
        
        diaryButton.setFocusPainted(false);
        diaryButton.setContentAreaFilled(false);
        diaryButton.setOpaque(true);
        
        exitButton.setFocusPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(true);
        
        settingsButton.setFocusPainted(false);
        settingsButton.setContentAreaFilled(false);
        settingsButton.setOpaque(true);
        
        summaryButton.setFocusPainted(false);
        summaryButton.setContentAreaFilled(false);
        summaryButton.setOpaque(true);
        
        
            
       UIManager.put("ToolTip.background", new Color(50, 50, 50));
       UIManager.put("ToolTip.foreground", new Color(255, 255, 255));
       UIManager.put("ToolTip.border",  BorderFactory.createSoftBevelBorder(0));
       UIManager.put("ToolTip.font",  new Font("Tahoma", Font.PLAIN, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newTrainingButton = new javax.swing.JButton();
        diaryButton = new javax.swing.JButton();
        summaryButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MENU");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("hellomenu"); // NOI18N
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        newTrainingButton.setBackground(new java.awt.Color(51, 51, 51));
        newTrainingButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newTrainingButton.setForeground(new java.awt.Color(255, 255, 255));
        newTrainingButton.setMnemonic('N');
        newTrainingButton.setText("NOWY TRENING");
        newTrainingButton.setToolTipText("Kliknij w celu wprowadzenia nowego treningu");
        newTrainingButton.setActionCommand("newTrainin");
        newTrainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newTrainingButton.setFocusPainted(false);
        newTrainingButton.setFocusable(false);
        newTrainingButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newTrainingButtonFocusGained(evt);
            }
        });
        newTrainingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newTrainingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newTrainingButtonMouseExited(evt);
            }
        });
        newTrainingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainingButtonActionPerformed(evt);
            }
        });

        diaryButton.setBackground(new java.awt.Color(51, 51, 51));
        diaryButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        diaryButton.setForeground(new java.awt.Color(255, 255, 255));
        diaryButton.setMnemonic('D');
        diaryButton.setText("DZIENNICZEK");
        diaryButton.setToolTipText("Kliknij w celu wyświetlenia wprowadzonych treningów");
        diaryButton.setActionCommand("diary");
        diaryButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaryButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        diaryButton.setFocusPainted(false);
        diaryButton.setFocusable(false);
        diaryButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                diaryButtonFocusGained(evt);
            }
        });
        diaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diaryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diaryButtonMouseExited(evt);
            }
        });
        diaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaryButtonActionPerformed(evt);
            }
        });

        summaryButton.setBackground(new java.awt.Color(51, 51, 51));
        summaryButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        summaryButton.setForeground(new java.awt.Color(255, 255, 255));
        summaryButton.setMnemonic('U');
        summaryButton.setText("USTAWIENIA");
        summaryButton.setToolTipText("Kliknij w celu otwarcia panelu ustawień");
        summaryButton.setActionCommand("newTrainin");
        summaryButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        summaryButton.setFocusPainted(false);
        summaryButton.setFocusable(false);
        summaryButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                summaryButtonFocusGained(evt);
            }
        });
        summaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                summaryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                summaryButtonMouseExited(evt);
            }
        });
        summaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(51, 51, 51));
        settingsButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(255, 255, 255));
        settingsButton.setMnemonic('P');
        settingsButton.setText("PODSUMOWANIA");
        settingsButton.setToolTipText("Kliknij w celu wprowadzenia nowego treningu");
        settingsButton.setActionCommand("newTrainin");
        settingsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        settingsButton.setFocusPainted(false);
        settingsButton.setFocusable(false);
        settingsButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                settingsButtonFocusGained(evt);
            }
        });
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTrainingButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(51, 51, 51));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setMnemonic('Z');
        exitButton.setText("ZAKOŃCZ");
        exitButton.setToolTipText("Kliknij w celu zamknięcia aplikacji");
        exitButton.setActionCommand("newTrainin");
        exitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        exitButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                exitButtonFocusGained(evt);
            }
        });
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(summaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTrainingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newTrainingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(summaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void newTrainingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTrainingButtonActionPerformed
       new NewTraining().setVisible(true);
       dispose();
    }//GEN-LAST:event_newTrainingButtonActionPerformed

    private void diaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaryButtonActionPerformed
        new TrainingDiary().setVisible(true);
        dispose();
    }//GEN-LAST:event_diaryButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
      
//      int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz wyjść z menu?");
//            if (opcja == 0)
//            {
//                dispose();  
//               
//            }

        new OptionPane(this, "Czy chcesz zamknąć program?").setVisible(true);
     
    }//GEN-LAST:event_exitButtonActionPerformed

    private void summaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryButtonActionPerformed
       // new Settings().setVisible(true);
       new Colors().setVisible(true);
        dispose();
    }//GEN-LAST:event_summaryButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//      int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz wyjść z menu?");
//            if (opcja == 0)
//            {
//                dispose();  
//               
//            }
//
//       JButton tets = new MyButton("dd");
//       JPanel ppanel = new JPanel();
//       ppanel.add(tets);
//        UIManager.put("OptionPane.background", new Color(150, 150, 150));
//        UIManager.put("Panel.background", new Color(150, 150, 150));
//        
//        UIManager.put("Panel.font", new Font("Tahoma", Font.BOLD, 14));
//        UIManager.put("OptionPane.cancelButtonText", "Anuluj");
//        UIManager.put("OptionPane.okButtonText", "Tak");
//        UIManager.put("Button.okButtonTextSize", 12);
//        UIManager.put("Button.buttonAreaBorder", BorderFactory.createSoftBevelBorder(0));
//        UIManager.put("OptionPane.yesButtonText", "TAK");
//        UIManager.put("OptionPane.noButtonText", "NIE");
//        UIManager.put("OptionPane.buttonFont", new Font("Tahoma", Font.BOLD, 14));
//        UIManager.put("Button.yesButtonFeelAndLook", new MyButton("dd"));
//        UIManager.put("Button.setOpaque", true);
//        
//        UIManager.put("OptionPane.messageForeground", new Color(0, 0, 0));
//        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.BOLD, 14));
//        
//        UIManager.put("Button.background", new Color(45, 45, 45));
//        UIManager.put("Button.foreground", new Color(139, 90, 60));
//        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz wyjść z aplikacji?", "Wybierz opcję",
//                        JOptionPane.YES_NO_OPTION);
//        
//        
//        
//        
//        
//        if (opcja == 0)
//        {
//
//            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        }   
    
        new OptionPane(this, "Czy chcesz wyjść z menu?").setVisible(true);


    }//GEN-LAST:event_formWindowClosing

    private void newTrainingButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newTrainingButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_newTrainingButtonFocusGained

    private void diaryButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diaryButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_diaryButtonFocusGained

    private void settingsButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_settingsButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonFocusGained

    private void summaryButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_summaryButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_summaryButtonFocusGained

    private void exitButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exitButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonFocusGained

    private void newTrainingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTrainingButtonMouseEntered
        buttonColorGained(newTrainingButton);
    }//GEN-LAST:event_newTrainingButtonMouseEntered

    private void newTrainingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTrainingButtonMouseExited
        buttonColorLost(newTrainingButton);
    }//GEN-LAST:event_newTrainingButtonMouseExited

    private void diaryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaryButtonMouseEntered
        buttonColorGained(diaryButton);
    }//GEN-LAST:event_diaryButtonMouseEntered

    private void diaryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaryButtonMouseExited
        buttonColorLost(diaryButton);
    }//GEN-LAST:event_diaryButtonMouseExited

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        buttonColorGained(settingsButton);
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        buttonColorLost(settingsButton);
    }//GEN-LAST:event_settingsButtonMouseExited

    private void summaryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_summaryButtonMouseEntered
        buttonColorGained(summaryButton);
    }//GEN-LAST:event_summaryButtonMouseEntered

    private void summaryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_summaryButtonMouseExited
        buttonColorLost(summaryButton);
    }//GEN-LAST:event_summaryButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        buttonColorGained(exitButton);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        buttonColorLost(exitButton);
    }//GEN-LAST:event_exitButtonMouseExited

     public void buttonColorGained(JButton button)
    {
        button.setBackground(new Color(115, 115, 115));
        button.setForeground(new Color(255, 255, 255));
    }
    public void buttonColorLost(JButton button)
    {
        
        button.setBackground(new Color(51, 51, 51));
        button.setForeground(new Color(255, 255, 255));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelloMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelloMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelloMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelloMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diaryButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newTrainingButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton summaryButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
//        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz wyjść z menu?");
//            if (opcja == 0)
//            {
//                dispose();  
//               
//            }

    }

    

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}