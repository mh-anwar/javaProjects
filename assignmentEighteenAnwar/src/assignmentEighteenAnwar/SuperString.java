/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentEighteenAnwar;

import java.text.DecimalFormat;

/**
 *
 * @author mohammad
 */
public class SuperString extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("###.###");
    /**
     * Creates new form magicalMath
     */
    public SuperString() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUpperCaseResult = new javax.swing.JLabel();
        btnStringLength = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblStringLengthResult = new javax.swing.JLabel();
        btnStringToLowerCase = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLetterSpot = new javax.swing.JButton();
        btnLetterInString = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnIdenticalStrings = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLowerCaseString = new javax.swing.JTextField();
        lblLetterSpotResult = new javax.swing.JLabel();
        txtSpecificLetters = new javax.swing.JTextField();
        txtLetterSpot = new javax.swing.JTextField();
        lblIdenticalStringResult = new javax.swing.JLabel();
        lblLetterInStringResult = new javax.swing.JLabel();
        txtIdenticalStringOne = new javax.swing.JTextField();
        txtLetterInString = new javax.swing.JTextField();
        txtStringWithLetter = new javax.swing.JTextField();
        txtStringLength = new javax.swing.JTextField();
        txtIdenticalStringTwo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSpecificLetters = new javax.swing.JButton();
        lblSpecificLettersResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setAutoscrolls(true);
        jPanel1.setDoubleBuffered(false);

        jLabel1.setText("Enter a String using lowercase letters. The program will output the String in all capital letters:");

        lblUpperCaseResult.setText("Answer: ");

        btnStringLength.setText("Length");
        btnStringLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStringLengthActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter a String. The program will output the number of characters in the String:");

        lblStringLengthResult.setText("Answer: ");

        btnStringToLowerCase.setText("All Caps");
        btnStringToLowerCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStringToLowerCaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter a String. The program will output the character at the 4th spot:");

        jLabel6.setText("Enter two Strings. The program will output whether or not they are identical.");

        btnLetterSpot.setText("4th Spot");
        btnLetterSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetterSpotActionPerformed(evt);
            }
        });

        btnLetterInString.setText("Letter Found?");
        btnLetterInString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetterInStringActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter a String and a letter. The program wil output whether or not the letter is found in the String.");

        btnIdenticalStrings.setText("Identical?");
        btnIdenticalStrings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdenticalStringsActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter a String that is at least 8 characters long. The program will output characters 4 to 6:");

        lblLetterSpotResult.setText("Answer: ");

        lblIdenticalStringResult.setText("Answer: ");

        lblLetterInStringResult.setText("Answer: ");

        txtStringWithLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStringWithLetterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("Super String Software");

        btnSpecificLetters.setText("Characters 4 to 6");
        btnSpecificLetters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecificLettersActionPerformed(evt);
            }
        });

        lblSpecificLettersResult.setText("Answer: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtStringWithLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtLetterInString, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnLetterInString)
                                .addGap(54, 54, 54)
                                .addComponent(lblLetterInStringResult))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtLetterSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(btnLetterSpot))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(txtLowerCaseString, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(121, 121, 121)
                                            .addComponent(btnStringToLowerCase)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblUpperCaseResult))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(lblLetterSpotResult))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtIdenticalStringOne, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(txtIdenticalStringTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(61, 61, 61)
                                            .addComponent(btnIdenticalStrings)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblIdenticalStringResult)))
                                    .addGap(80, 80, 80)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtSpecificLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnSpecificLetters)
                                .addGap(55, 55, 55)
                                .addComponent(lblSpecificLettersResult))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtStringLength, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(btnStringLength)
                        .addGap(61, 61, 61)
                        .addComponent(lblStringLengthResult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStringLength)
                    .addComponent(lblStringLengthResult)
                    .addComponent(txtStringLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStringToLowerCase)
                    .addComponent(lblUpperCaseResult)
                    .addComponent(txtLowerCaseString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLetterSpot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetterSpot)
                    .addComponent(lblLetterSpotResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdenticalStringOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdenticalStringResult)
                    .addComponent(btnIdenticalStrings)
                    .addComponent(txtIdenticalStringTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLetterInString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStringWithLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLetterInString)
                    .addComponent(lblLetterInStringResult))
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSpecificLettersResult)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSpecificLetters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSpecificLetters)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStringToLowerCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStringToLowerCaseActionPerformed
        // Get string input
        String input = txtLowerCaseString.getText();
        // Convert input to upper case
        String upperCaseInput = input.toUpperCase();
        // Display upper case output on lable
        lblUpperCaseResult.setText(upperCaseInput);
    }//GEN-LAST:event_btnStringToLowerCaseActionPerformed

    private void btnStringLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStringLengthActionPerformed
        // Get string input
        String input = txtStringLength.getText();
        // Get length of input
        int inputLength  = input.length();
        // Diplay length of input on label
        lblStringLengthResult.setText(Integer.toString(inputLength));
    }//GEN-LAST:event_btnStringLengthActionPerformed

    private void btnLetterSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetterSpotActionPerformed
        // Get string input
        String input = txtLetterSpot.getText();
        // Get the character at the 3rd spot
        char letterAtSpot = input.charAt(3);
        // Display character on label
        lblLetterSpotResult.setText(Character.toString(letterAtSpot));
    }//GEN-LAST:event_btnLetterSpotActionPerformed

    private void btnIdenticalStringsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdenticalStringsActionPerformed
        // Get first string input
        String firstInput = txtIdenticalStringOne.getText();
        // Get second string input
        String secondInput = txtIdenticalStringTwo.getText();
        // Compare the first string input to the second one
        int stringComparision = firstInput.compareTo(secondInput);
        // If they are the same (0) then display that they are identical
        if(stringComparision == 0){
            lblIdenticalStringResult.setText("Identical Strings");   
        } else{
            // Or else display that they are non-identical
            lblIdenticalStringResult.setText("Non-identical Strings");   
        }
    }//GEN-LAST:event_btnIdenticalStringsActionPerformed

    private void btnLetterInStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetterInStringActionPerformed
        // Get the first string input
        String baseString = txtStringWithLetter.getText();
        // Get the second string (which is a character)
        String character = txtLetterInString.getText();
        // Get the index of the character
        int indexOfCharacter = baseString.indexOf(character);
        // If the character exists, display that the character exists
        if(indexOfCharacter != -1){
            lblLetterInStringResult.setText("Letter is in string");   
        } else{
            // Or else display that it doesn't exist in the string
            lblLetterInStringResult.setText("Character is not in string");   
        }
    }//GEN-LAST:event_btnLetterInStringActionPerformed

    private void btnSpecificLettersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecificLettersActionPerformed
        // Get string input
        String input = txtSpecificLetters.getText();
        // Get substring fromthe string (characters 4,5,6)
        String subString = input.substring(4,7);
        // Display the substring
        lblSpecificLettersResult.setText(subString);
    }//GEN-LAST:event_btnSpecificLettersActionPerformed

    private void txtStringWithLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStringWithLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStringWithLetterActionPerformed

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
            java.util.logging.Logger.getLogger(SuperString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperString.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperString().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIdenticalStrings;
    private javax.swing.JButton btnLetterInString;
    private javax.swing.JButton btnLetterSpot;
    private javax.swing.JButton btnSpecificLetters;
    private javax.swing.JButton btnStringLength;
    private javax.swing.JButton btnStringToLowerCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIdenticalStringResult;
    private javax.swing.JLabel lblLetterInStringResult;
    private javax.swing.JLabel lblLetterSpotResult;
    private javax.swing.JLabel lblSpecificLettersResult;
    private javax.swing.JLabel lblStringLengthResult;
    private javax.swing.JLabel lblUpperCaseResult;
    private javax.swing.JTextField txtIdenticalStringOne;
    private javax.swing.JTextField txtIdenticalStringTwo;
    private javax.swing.JTextField txtLetterInString;
    private javax.swing.JTextField txtLetterSpot;
    private javax.swing.JTextField txtLowerCaseString;
    private javax.swing.JTextField txtSpecificLetters;
    private javax.swing.JTextField txtStringLength;
    private javax.swing.JTextField txtStringWithLetter;
    // End of variables declaration//GEN-END:variables
}
