/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anwarassignment24;

/**
 *
 * @author s201076699
 */
public class AnwarAssignment24 extends javax.swing.JFrame {

    /**
     * Creates new form AnwarAssignment24
     */
    public AnwarAssignment24() {
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

        jToolBar1 = new javax.swing.JToolBar();
        btrnFactorial = new javax.swing.JButton();
        btnPrime = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFibonacci = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFibonacci = new javax.swing.JLabel();
        lblFactorial = new javax.swing.JLabel();
        txtFactorial = new javax.swing.JTextField();
        txtPrime = new javax.swing.JTextField();
        lblPrime = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btrnFactorial.setText("Factorial");
        btrnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrnFactorialActionPerformed(evt);
            }
        });

        btnPrime.setText("Prime");
        btnPrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeActionPerformed(evt);
            }
        });

        btnFibonacci.setText("Fibonacci");
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("--NUMBERS--");

        jLabel2.setText("Enter a number and click the button to find the factorial:");

        jLabel3.setText("Enter a number and click the button to determine whether or not it is a prime number:");

        jLabel4.setText("Enter a number and click the button to see the corresponding Fibonacci Number");

        lblFibonacci.setText("This number is:");

        lblFactorial.setText("The factorial is:");

        lblPrime.setText("This number is:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btrnFactorial))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(btnPrime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(btnFibonacci)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btrnFactorial)
                            .addComponent(txtFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrime)
                            .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFibonacci)
                        .addComponent(lblFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btrnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrnFactorialActionPerformed
        // Declare integer to be used to store value that user enters
        int factorialNum = 0;
        try{
            // Get the text of the textfield and parse an integer (if this fails, catch the error)
            factorialNum = Integer.parseInt(txtFactorial.getText());
            // Call a function to calculate the factorial of the number
            String factorialOutput = factorial(factorialNum);
            // Display the factorial of the number
            lblFactorial.setText(factorialOutput);
        } catch (Exception e){
            // Catch the error of the text not having any numbers and display a prompt to only enter in numbers
            lblFactorial.setText("Please only enter numbers");
        }
    }//GEN-LAST:event_btrnFactorialActionPerformed
    private void btnPrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeActionPerformed
        // Declare integer to be used to store value that user enters
        int primeNum = 0;
        try{
            // Get the text of the textfield and parse an integer (if this fails, catch the error)
            primeNum = Integer.parseInt(txtPrime.getText());
            // Call function to check if the number is prime
            String isPrimeOutput = isNumberPrime(primeNum);
            // Display whether number is prime or not
            lblPrime.setText(isPrimeOutput);
        } catch (Exception e){
            // Catch the error of the text not having any numbers and display a prompt to only enter in numbers
            lblPrime.setText("Please only enter numbers");
        }
    }//GEN-LAST:event_btnPrimeActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        // Use a long to store the (most likely) large value of the number
        long fibonacciNum = 1;
        // Use a long, in case extreme testing is used, to store the position of the number
        long fibonacciPosition = 0;
        try{
            // Get the text of the textfield and parse an integer (if this fails, catch the error)
            fibonacciPosition = Integer.parseInt(txtFibonacci.getText());
            // Call the fibonaccii number calculator and give it the position of the number
            fibonacciNum = calcFibNum(fibonacciPosition);
            // Set the label to the value with the position and numbera at that position
            lblFibonacci.setText("The Fibonacci number at position " + fibonacciPosition + " is " +Long.toString(fibonacciNum));
            
        } catch (Exception e){
            // Catch the error of the text not having any numbers and display a prompt to only enter in numbers
            lblFibonacci.setText("Please only enter numbers");
        }
    }//GEN-LAST:event_btnFibonacciActionPerformed
    
    private String factorial(int factorialNum){
        // Set the initial factorial total to start with the number
        long factorialTotal = factorialNum;
        // Loop for every number below the factorialNum and above 1
        for(int i =1; i<factorialNum; i++){
            // Multiply the number into the factorial total
            factorialTotal*=i;
        }
        // Return a string with the initial number and the factorial of it
        return ("The factorial of " + Integer.toString(factorialNum) + " is " + Long.toString(factorialTotal));
        
    }
    
    private String isNumberPrime(int primeNum){
        // Declare a variable to store whether the number is prime or not
        boolean isPrime = true;
        // Declare varaible to store the result of each modulus operation
        int modulusResult;
        // Loop for every number BELOW but EQUAl to the square root of the number and higher than 2 (e.g for 4 the square root is the only divisor)
        // Everything after the square root is just flipped mutliplication
        // e.g with 18 => sqrt is 4.24... It's divisors are, 2, 3, 6 and 9. 
        // 2 (2x9) and 3 (3x6) are both below 4.24, going above 4.24 is useless, because the same operation is done, but flipped (6x3, 9x2)
        for(int i =2; i<=Math.sqrt(primeNum); i++){
            // Get the modulus result of the prime number
            modulusResult = primeNum%i;
            // If there is no remainder, aka modulus is 0 then there is a divisor for the number
            if(modulusResult == 0){
                // Set isPrime to false
                isPrime = false;
                // Break immediately, instead of checking for more divisors
                break;
            }
        }
        // If is prime is true, return that the number is prime
        if(isPrime){
            return (Integer.toString(primeNum) +" is a prime number." );
        } else {
            // Else, return that the number is not prime
            return (Integer.toString(primeNum) +" is not a prime number." );
        }
    }
    
    private long calcFibNum(long number){
        // If the number is 0 or 1 return itself, because that is it's position
        if(number == 0){
            return number;
        } else if (number == 1){
            return number; 
        }
        // Or else, return the the first number before added to the second number before (recursive)
        return calcFibNum(number-1) + calcFibNum(number-2);
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
            java.util.logging.Logger.getLogger(AnwarAssignment24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnwarAssignment24().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnPrime;
    private javax.swing.JButton btrnFactorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblFactorial;
    private javax.swing.JLabel lblFibonacci;
    private javax.swing.JLabel lblPrime;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtFibonacci;
    private javax.swing.JTextField txtPrime;
    // End of variables declaration//GEN-END:variables
}
