
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201076699
 */
public class FrmDiceGame extends javax.swing.JFrame {
    // Create image icon for dialogs
    final ImageIcon DIALOG_ICON = new ImageIcon(getClass().getResource("/dice.png"));
    
    // Set the health for each mode
    final int EASY_MODE_HEALTH = 40;
    final int MEDIUM_MODE_HEALTH = 60;
    final int HARD_MODE_HEALTH = 65;
    final int GOD_MODE_HEALTH = 40;
    
    // Set the difficulty for each mode
    final int EASY_MODE_DIFFICULTY = 5;
    final int MEDIUM_MODE_DIFFICULTY = 19;
    final int HARD_MODE_DIFFICULTY = 39;
    final int GOD_MODE_DIFFICULTY = 99999;
    
    /* Initial health will only be set when the mode is changed, it keeps track 
    of the maximum health acheivable, in other words, the starting health*/
    int initialHealth = 50;
    // Initialized and set health counter to 20, this variable will change with each guess
    int health = 50;
    
    // Initializing variables
    int totalRolls = 0; 
    int totalCorrect = 0; 
    int totalIncorrect = 0; 
    int userGuess; 
    int diceRoll; 
    int rollAmount = 5;
    double percCorrect = 0;
    
    // Creates new form FrmDiceGame
    public FrmDiceGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup5 = new javax.swing.ButtonGroup();
        lblCorrectValue = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPercentValue = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblIncorrectValue = new javax.swing.JLabel();
        lblRollValue = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        featurePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        radEasyMode = new javax.swing.JRadioButton();
        radMediumMode = new javax.swing.JRadioButton();
        radHardMode = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        lblHealthAmount = new javax.swing.JLabel();
        radGodMode = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        lblRollInstructions = new javax.swing.JLabel();
        btnRollDice = new javax.swing.JButton();
        spnUserGuess = new javax.swing.JSpinner();
        lblRollsValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 200, 0));

        lblCorrectValue.setText("0");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Percentage of correct guesses:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Number of incorrect guesses:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Number of correct guesses:");

        lblPercentValue.setText("0");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Number of rolls:");

        lblIncorrectValue.setText("0");

        lblRollValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRollValue.setText("0");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel14.setText("Dice Roll");

        jLabel15.setText("and click to roll the dice");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Super Dice Guessing Game");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel18.setText("Your Guess");

        featurePanel.setBackground(new java.awt.Color(204, 204, 255));
        featurePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        featurePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Choose Difficulty:");

        radEasyMode.setBackground(featurePanel.getBackground());
        buttonGroup5.add(radEasyMode);
        radEasyMode.setSelected(true);
        radEasyMode.setText("Easy");
        radEasyMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radEasyMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEasyModeActionPerformed(evt);
            }
        });

        radMediumMode.setBackground(featurePanel.getBackground());
        buttonGroup5.add(radMediumMode);
        radMediumMode.setText("Medium");
        radMediumMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radMediumMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMediumModeActionPerformed(evt);
            }
        });

        radHardMode.setBackground(featurePanel.getBackground());
        buttonGroup5.add(radHardMode);
        radHardMode.setText("Hard");
        radHardMode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radHardMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radHardModeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Life Amount");

        lblHealthAmount.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblHealthAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHealthAmount.setText("Health: 50 HP");

        radGodMode.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup5.add(radGodMode);
        radGodMode.setForeground(new java.awt.Color(255, 255, 255));
        radGodMode.setText("God Mode");
        radGodMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radGodModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout featurePanelLayout = new javax.swing.GroupLayout(featurePanel);
        featurePanel.setLayout(featurePanelLayout);
        featurePanelLayout.setHorizontalGroup(
            featurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(featurePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(featurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radEasyMode)
                    .addComponent(radMediumMode)
                    .addComponent(radHardMode)
                    .addComponent(radGodMode))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(featurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHealthAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        featurePanelLayout.setVerticalGroup(
            featurePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(featurePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radEasyMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radMediumMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radHardMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radGodMode)
                .addGap(56, 56, 56)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHealthAmount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dice.png"))); // NOI18N

        lblRollInstructions.setText("Enter an amount from 1 to 6");

        btnRollDice.setText("Roll Dice");
        btnRollDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollDiceActionPerformed(evt);
            }
        });

        spnUserGuess.setName(""); // NOI18N

        lblRollsValue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(featurePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPercentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIncorrectValue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblRollsValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCorrectValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRollDice)
                                        .addGap(98, 98, 98))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(spnUserGuess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(136, 136, 136)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblRollValue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblRollInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(featurePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRollInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel14)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spnUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblRollValue)))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(lblRollsValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblCorrectValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(lblIncorrectValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblPercentValue)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnRollDice)))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Method to set the mode
    void setMode(int rollingAmount, int healthAmount){
        // Set the new rolling amount (this is provided by the function-caller(?) based on difficulty)
        rollAmount = rollingAmount;
        // Update roll instructions with new roll amount
        lblRollInstructions.setText("Enter a number from 1 to " + Integer.toString(rollingAmount + 1) );
        // Set new health based on health provided by the function caller
        health = healthAmount;
        // Set the initial health
        initialHealth = healthAmount;
        // Update the health label
        lblHealthAmount.setText("Health: " + Integer.toString(healthAmount) + " HP");
        // Reset all relevant variables
        resetInformation();
        // Display dialog notifying user that all statistics are being reset.
        JOptionPane.showMessageDialog(null, "You changed your mode and your stats are being reset..", "Statistic Notification", JOptionPane.INFORMATION_MESSAGE, DIALOG_ICON);
    }
    // Method to reset user health
    void resetHealth(){
        // Resets health to the initialHealth
        health = initialHealth;
        
        // Updates health label
        lblHealthAmount.setText("Health: " + Integer.toString(health) + " HP");
        
        // Show a dialog that tells user that they lost/died
        JOptionPane.showMessageDialog(null, "You have died. Absolute failure. Your life will be reset.", "Death Notification", JOptionPane.INFORMATION_MESSAGE, DIALOG_ICON);
        
        // Reset all relevant variables
        resetInformation();
    }
    
    void resetInformation(){
        // Reset all variables that change
        totalRolls = 0;
        totalCorrect = 0;
        totalIncorrect = 0;
        percCorrect = 0;
        
        // Resets all the labels with values
        lblRollsValue.setText(Integer.toString(0));
        lblCorrectValue.setText(Integer.toString(0));
        lblIncorrectValue.setText(Integer.toString(0));
        lblPercentValue.setText(Integer.toString(0));
    }
    // Modifies health based on the health action
    void modifyHealth(String healthAction){
        if(health <= 0){
            // Calls resetHealth if the health is less than or 0
            resetHealth();
        } else if(healthAction.equals("remove")){
            // Reduces health and updates health label
            health -=5;
            lblHealthAmount.setText("Health: " + Integer.toString(health) + " HP");
        } else {
            // Increases health and updates health label
            health += 5;
            lblHealthAmount.setText("Health: " + Integer.toString(health) + " HP");
        }
        /* Note: To avoid having the lblHealthAmount.setText line three times, 
           I could have nested if statements, but those look bad*/
    }
    // The next four methods set the mode based on the click of each mode radio button
    private void radEasyModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEasyModeActionPerformed
        setMode(EASY_MODE_DIFFICULTY, EASY_MODE_HEALTH);
    }//GEN-LAST:event_radEasyModeActionPerformed

    private void radGodModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radGodModeActionPerformed
        setMode(GOD_MODE_DIFFICULTY, GOD_MODE_HEALTH);
    }//GEN-LAST:event_radGodModeActionPerformed

    private void radMediumModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMediumModeActionPerformed
        setMode(MEDIUM_MODE_DIFFICULTY, MEDIUM_MODE_HEALTH);
    }//GEN-LAST:event_radMediumModeActionPerformed

    private void radHardModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radHardModeActionPerformed
        setMode(HARD_MODE_DIFFICULTY, HARD_MODE_HEALTH);
    }//GEN-LAST:event_radHardModeActionPerformed

    private void btnRollDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollDiceActionPerformed
        diceRoll = (int) Math.round (Math.random()*rollAmount+1);
        lblRollValue.setText(String.valueOf(diceRoll));
        
        userGuess = Integer.parseInt(spnUserGuess.getValue().toString());
        
        totalRolls = totalRolls + 1;
        
        if (diceRoll == userGuess){
            totalCorrect = totalCorrect + 1;
            // Modify the health to add to it, because the user guessed correctly
            modifyHealth("add");
        }
        else{
            totalIncorrect = totalIncorrect + 1;
            // Modify the health to remove from it, because the user guessed in incorrectly
            modifyHealth("remove");
        }
        
        percCorrect = ((double) totalCorrect/ (double) totalRolls) *100;
        
        percCorrect = percCorrect*100;
        percCorrect = Math.round(percCorrect);
        percCorrect = percCorrect / 100;
        
        lblRollsValue.setText(String.valueOf(totalRolls));
        lblCorrectValue.setText(String.valueOf(totalCorrect));
        lblIncorrectValue.setText(String.valueOf(totalIncorrect));
        lblPercentValue.setText (String.valueOf(percCorrect));
    }//GEN-LAST:event_btnRollDiceActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiceGame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRollDice;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JPanel featurePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel lblCorrectValue;
    private javax.swing.JLabel lblHealthAmount;
    private javax.swing.JLabel lblIncorrectValue;
    private javax.swing.JLabel lblPercentValue;
    private javax.swing.JLabel lblRollInstructions;
    private javax.swing.JLabel lblRollValue;
    private javax.swing.JLabel lblRollsValue;
    private javax.swing.JRadioButton radEasyMode;
    private javax.swing.JRadioButton radGodMode;
    private javax.swing.JRadioButton radHardMode;
    private javax.swing.JRadioButton radMediumMode;
    private javax.swing.JSpinner spnUserGuess;
    // End of variables declaration//GEN-END:variables
}
