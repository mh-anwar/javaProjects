/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarassignment26;

/**
 *
 * @author s201076699
 */
public class anwarAssignment26 extends javax.swing.JFrame {

    /**
     * Creates new form anwarAssignment26
     */
    public anwarAssignment26() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDecimal = new javax.swing.JTextField();
        btnDecimalToBinary = new javax.swing.JButton();
        btnBinaryToDecimal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBinary = new javax.swing.JTextField();
        btnDecimalToHex = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDecimalToHex = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnHexToDecimal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHexadecimal = new javax.swing.JTextField();
        lblBinaryToDecimal = new javax.swing.JLabel();
        lblDecimalToBinary = new javax.swing.JLabel();
        lblDecimalToHex = new javax.swing.JLabel();
        lblHexToDecimal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("--NUMBER SYSTEMS--");

        jLabel2.setText("Decimal and Binary");

        jLabel3.setText("Enter a decimal number:");

        btnDecimalToBinary.setText("Dec. To Bin.");
        btnDecimalToBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalToBinaryActionPerformed(evt);
            }
        });

        btnBinaryToDecimal.setText("Bin. To Dec.");
        btnBinaryToDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinaryToDecimalActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter a binary number:");

        btnDecimalToHex.setText("Dec. To Hex.");
        btnDecimalToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalToHexActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter a decimal number:");

        jLabel6.setText("Decimal and Hexadecimal");

        btnHexToDecimal.setText("Hex. to Dec.");
        btnHexToDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexToDecimalActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter a hexadecimal number:");

        txtHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHexadecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBinaryToDecimal)
                                            .addComponent(btnDecimalToBinary)
                                            .addComponent(btnDecimalToHex)
                                            .addComponent(btnHexToDecimal)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(202, 202, 202))))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDecimalToHex, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(202, 202, 202)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDecimalToBinary, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(lblBinaryToDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDecimalToHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHexToDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDecimalToBinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDecimalToBinary)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBinary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBinaryToDecimal)
                    .addComponent(lblBinaryToDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDecimalToHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDecimalToHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDecimalToHex)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHexToDecimal)
                    .addComponent(lblHexToDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static final char[] HEX_LETTERS = {'A', 'B', 'C', 'D', 'E', 'F'};
    static final char[] HEX_NUMBERS = {10, 11, 12, 13, 14, 15};
    
    private void btnDecimalToBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalToBinaryActionPerformed
        // Declare the blank decimal number
        int decimalNumber = 0;
        
        // Try to get the value of the decimal number from textfield
        try{
            decimalNumber = Integer.parseInt(txtDecimal.getText());
            String binaryNumber = decimalToBinary(decimalNumber);
            lblDecimalToBinary.setText(binaryNumber);
        } catch(Exception e){
            lblDecimalToBinary.setText("Please enter a number.");
        }
    }//GEN-LAST:event_btnDecimalToBinaryActionPerformed

    private void btnBinaryToDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinaryToDecimalActionPerformed
        String binaryNumber = txtBinary.getText();
        int decimalNumber = binaryToDecimal(binaryNumber);
        lblBinaryToDecimal.setText(Integer.toString(decimalNumber));
    }//GEN-LAST:event_btnBinaryToDecimalActionPerformed


    private void btnDecimalToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalToHexActionPerformed
        // Declare the blank decimal number
        int decimalNumber = 0;
        
        // Try to get the value of the decimal number from textfield
        try{
            decimalNumber = Integer.parseInt(txtDecimalToHex.getText());
            String hexadecimal = decimalToHex(decimalNumber);
            lblDecimalToHex.setText(hexadecimal);
        } catch(Exception e){
            lblDecimalToHex.setText("Please enter a number.");
        }
    }//GEN-LAST:event_btnDecimalToHexActionPerformed

    private void btnHexToDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexToDecimalActionPerformed
        String hexString = txtHexadecimal.getText();
        int decimalNumber = hexToDecimal(hexString);
        lblHexToDecimal.setText(Integer.toString(decimalNumber));
    }//GEN-LAST:event_btnHexToDecimalActionPerformed

    private void txtHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHexadecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHexadecimalActionPerformed
    
    private String textReverser(String initialText){
        String reversedText = "";
        for(int i = initialText.length()-1; i >= 0; i--){
            reversedText += initialText.charAt(i);
        }
        return reversedText;
    }
    
    private String decimalToBinary(int decimalNumber){
        // Declare string and int to hold the binary num and remainder respectively
        String binaryNumber = "";
        int remainder;
        
        // Loop until the value of the decimal number is not less than 1 (
        while(decimalNumber != 1/2){
            // Get the remainder of the decimal divided by 2
            remainder = decimalNumber % 2;
            // Divide it by 2 for next iteration
            decimalNumber /= 2;
            // Add the remainder to the binary number (either 0 or 1)
            binaryNumber += Integer.toString(remainder);
        }
        binaryNumber = textReverser(binaryNumber);
        return binaryNumber;
    }
    private int binaryToDecimal(String binaryNumber){
        final int baseTwo = 2;
        int decimalNumber = 0;
        double power = 0;
        
        // Reverse loop through the binary number
        for(int i = binaryNumber.length()-1; i >= 0; i--){
            // Get the number at position i
            int binaryNum = Character.getNumericValue(binaryNumber.charAt(i));
            // Multiply the number by 2 to a power to get the base two number
            int baseTwoNum = binaryNum * (int) Math.pow(baseTwo, power);
            // Add the base two number to the toal decimal value
            decimalNumber += baseTwoNum;
            // Increase power by 1 for next loop
            power+=1;
        }
        return decimalNumber;
    }
    
    private String decimalToHex(int decimalNumber){
        // Declare string and int to hold the hexadecimal num and remainder respectively
        String hexadecimal = "";
        int remainder;
        
        // Loop until the value of the decimal number is not less than 1 (
        while(decimalNumber != 1/2){
            // Get the remainder of the decimal divided by 16 (because hexadecimal is base 16)
            remainder = decimalNumber % 16;
            // Divide it by 16 for next iteration
            decimalNumber /= 16;
            // Convert hexadecimal to letter, if it is letter
            if(remainder >= 10){
                int letterPosition = new String(HEX_NUMBERS).indexOf(remainder);
                
                hexadecimal += HEX_LETTERS[letterPosition];
            } else{
                
                hexadecimal += Integer.toString(remainder);
            }
            System.out.println(remainder);
            // Add the remainder to the binary number (either 0 or 1)
        }
        hexadecimal = textReverser(hexadecimal);
        return hexadecimal;
    }
    
    private int hexToDecimal(String hexString){
        int decimalNumber = 0;
        double power = 0;
        for(int i = hexString.length()-1; i >= 0; i--){
            
            int currentChar = Character.getNumericValue(hexString.charAt(i));
            // Check if the current character is a letter
            int letterPosition = new String(HEX_LETTERS).indexOf(currentChar);
            
            if(letterPosition >= 0){
                currentChar =  (int)  HEX_NUMBERS[letterPosition];
            } 
            
            int baseSixteenNum = currentChar * (int) Math.pow(16, power);
            decimalNumber += baseSixteenNum;
            power+=1;
        }
        return decimalNumber;
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
            java.util.logging.Logger.getLogger(anwarAssignment26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anwarAssignment26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anwarAssignment26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anwarAssignment26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anwarAssignment26().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinaryToDecimal;
    private javax.swing.JButton btnDecimalToBinary;
    private javax.swing.JButton btnDecimalToHex;
    private javax.swing.JButton btnHexToDecimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBinaryToDecimal;
    private javax.swing.JLabel lblDecimalToBinary;
    private javax.swing.JLabel lblDecimalToHex;
    private javax.swing.JLabel lblHexToDecimal;
    private javax.swing.JTextField txtBinary;
    private javax.swing.JTextField txtDecimal;
    private javax.swing.JTextField txtDecimalToHex;
    private javax.swing.JTextField txtHexadecimal;
    // End of variables declaration//GEN-END:variables
}
