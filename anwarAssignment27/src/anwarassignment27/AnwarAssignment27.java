/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anwarassignment27;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author mohammad
 */
public class AnwarAssignment27 extends javax.swing.JFrame {

    /**
     * Creates new form anwarAssignment28
     */
    // Final path for data file
    final String USER_DATA_FILE ="src/userData.txt";
    final String POST_DATA_FILE = "src/postData.txt";
    // Five parallel arrays to hold user data
    String[] firstNames;
    String[] lastNames;
    String[] allUserAges;
    String[] allUserIncomes;
    String[] postsPerUser;
    String[] instaPosts;
    String[] instaImages;
    String[] instaAuthors;
    
    public AnwarAssignment27() {
        initComponents();
        initializeArrays();
        loadEveryoneData();
        loadPostData();
        displayEveryonesData();
        displayPostData();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblAverageUserAge = new javax.swing.JLabel();
        lblAverageUserPosts = new javax.swing.JLabel();
        lblHighestUserAge = new javax.swing.JLabel();
        lblNumberOfUsers = new javax.swing.JLabel();
        lblAverageUserIncome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPostURL = new javax.swing.JTextField();
        btnCreatePost = new javax.swing.JButton();
        txtPostData = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblPostImage = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblPostLabel = new javax.swing.JLabel();
        lblPostAuthor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setText("InstaPound");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("A Pound of Instagram Data");

        jLabel3.setText("(Disclaimer: Not affiliated with Instagram, no users were harmed in harvesting this data)");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Your Income");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Your First Name");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel10.setText("Your Last Name");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel5.setText("Your Data:");

        jButton1.setText("Submit Your Data");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Your Age");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(65, 65, 65)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(65, 65, 65)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(65, 65, 65)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel12.setText("Everyone's Data");

        lblAverageUserAge.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAverageUserAge.setText("Average User Age: ");

        lblAverageUserPosts.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAverageUserPosts.setText("Average Number of Posts Per User: ");

        lblHighestUserAge.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblHighestUserAge.setText("Oldest User Age:");

        lblNumberOfUsers.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNumberOfUsers.setText("Number of Users:");

        lblAverageUserIncome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAverageUserIncome.setText("Average Income of Users:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAverageUserPosts, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAverageUserIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberOfUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHighestUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAverageUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAverageUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAverageUserPosts, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumberOfUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAverageUserIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHighestUserAge, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("Make A Post");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("One Word to Describe Your Post");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setText("Your Image URL");

        txtPostURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostURLActionPerformed(evt);
            }
        });

        btnCreatePost.setText("Submit");
        btnCreatePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(txtPostURL, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatePost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPostData, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(txtPostData, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPostURL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreatePost, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel13.setText("View Posts");

        lblPostImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostImage.setText("Image Loads Here");
        lblPostImage.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblPostImageComponentShown(evt);
            }
        });

        jButton3.setText("Next Post");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblPostLabel.setText("Post Label Loads Here");

        lblPostAuthor.setText("Post Author Loads Here");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostLabel)
                    .addComponent(jLabel13)
                    .addComponent(lblPostAuthor))
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPostImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(lblPostImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPostLabel)
                .addGap(18, 18, 18)
                .addComponent(lblPostAuthor)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPostURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostURLActionPerformed

    private void btnCreatePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePostActionPerformed
        String postText = txtPostData.getText();
        String postURL;
        postURL = txtPostURL.getText();
        appendPostData(postText, postURL);
    }//GEN-LAST:event_btnCreatePostActionPerformed

    private void lblPostImageComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblPostImageComponentShown
        displayPostData();
    }//GEN-LAST:event_lblPostImageComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        displayPostData();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void initializeArrays(){
        try {
            int userDataLines = (int) Files.lines(Paths.get(USER_DATA_FILE)).count();
            firstNames = new String[userDataLines];
            lastNames = new String[userDataLines];
            allUserAges = new String[userDataLines];
            allUserIncomes = new String[userDataLines];
            postsPerUser = new String[userDataLines];
            
            int postDataLines = (int) Files.lines(Paths.get(POST_DATA_FILE)).count();
            instaPosts = new String[postDataLines];
            instaImages = new String[postDataLines];
            instaAuthors = new String[postDataLines];
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
        
    private void appendPostData(String postText,String postURL){
        File postFile = new File(POST_DATA_FILE);
        try {
            FileWriter postFileWriter = new FileWriter(postFile, true);        
            BufferedWriter postFileBuffer = new BufferedWriter(postFileWriter);
            postFileBuffer.write(postText + " " + postURL);        
            postFileBuffer.close();
            postFileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(AnwarAssignment27.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void loadEveryoneData(){
        try{
            FileReader userDataReader = new FileReader(USER_DATA_FILE);
            BufferedReader userDataBuffer = new BufferedReader(userDataReader);
            // Better to use while loop
            String line;
            // It's better to use while loops with arraylists but for primitive arrays, for loops are required
            for (int i = 0; (line = userDataBuffer.readLine()) != null; i++){
                // Split text file by spaces and sort data
                String[] data = line.split(" "); 
                String userFirstName = data[0];
                String userLastName = data[1];
                String userAge = data[2].toString();
                String userIncome = data[3].toString();
                String userPostsCreated = data[4].toString();
                
                // Append data to arraylists
                firstNames[i] = userFirstName;
                lastNames[i] = userLastName;
                allUserAges[i] = userAge;
                allUserIncomes[i] = userIncome;
                postsPerUser[i] = userPostsCreated;
            }
            userDataBuffer.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
    private void loadPostData(){
        try{
            FileReader postDataReader = new FileReader(POST_DATA_FILE);
            BufferedReader postDataBuffer = new BufferedReader(postDataReader);
            String line;
            // It's better to use while loops with arraylists but for primitive arrays, for loops are required
            for (int i = 0; (line = postDataBuffer.readLine()) != null; i++){
                // Split text file by spaces and sort data
                String[] data = line.split(" "); 
                String postText = data[0];
                String postURL = data[1];
                String postAuthor = data[2];

                // Append data to arraylists
                instaPosts[i] = postText;
                instaImages[i] = postURL;
                instaAuthors[i] = postAuthor;
            }
            postDataBuffer.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
    private void displayPostData(){
        int randomNumber =(int)Math.round(Math.random()*(instaImages.length - 1));
        URL imageURL;
        try {
            imageURL = new URL(instaImages[randomNumber]);        
            BufferedImage postImage = ImageIO.read(imageURL);
            ImageIcon postIcon = new ImageIcon(postImage);
            lblPostImage.setIcon(postIcon);
            lblPostImage.setText("");
            lblPostLabel.setText(instaPosts[randomNumber]);
            lblPostAuthor.setText("Post made by: " + instaAuthors[randomNumber]);
        } catch (MalformedURLException ex) {
            Logger.getLogger(AnwarAssignment27.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnwarAssignment27.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void displayEveryonesData(){
        int highestUserAge = 0;
        int averageUserAge = 0;
        int averagePostsPerUser= 0;
        int numberOfUsers = 0;
        int averageIncomeOfUsers = 0;
        // Declare and initialize totals
        int totalAges = 0;
        int totalPosts = 0;
        int totalIncome = 0;
        // Calculate highest user age
        for(String age: allUserAges){
            int ageNumber = Integer.parseInt(age);
            if(ageNumber > highestUserAge){
                highestUserAge = ageNumber;
            }
            totalAges += ageNumber;
            numberOfUsers += 1;
        }
        
        for(String post: postsPerUser){
            int postNumber = Integer.parseInt(post);
            totalPosts += postNumber;
        }        
        
        for(String income: allUserIncomes){
            int incomeNumber = Integer.parseInt(income);
            totalIncome += incomeNumber;
        }
        
        averageUserAge = totalAges/allUserAges.length;
        averagePostsPerUser = totalPosts/postsPerUser.length;
        averageIncomeOfUsers = totalIncome/allUserIncomes.length;
        lblHighestUserAge.setText("Oldest User Age: " + Integer.toString(highestUserAge));
        lblAverageUserAge.setText("Average User Age: " + Integer.toString(averageUserAge));
        lblAverageUserPosts.setText("Average Number of Posts Per User: " + Integer.toString(averagePostsPerUser));
        lblNumberOfUsers.setText("Number of Users: " + Integer.toString(numberOfUsers));
        lblAverageUserIncome.setText("Average Income of Users: $" + Integer.toString(averageIncomeOfUsers));
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
            java.util.logging.Logger.getLogger(AnwarAssignment27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnwarAssignment27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnwarAssignment27().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePost;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAverageUserAge;
    private javax.swing.JLabel lblAverageUserIncome;
    private javax.swing.JLabel lblAverageUserPosts;
    private javax.swing.JLabel lblHighestUserAge;
    private javax.swing.JLabel lblNumberOfUsers;
    private javax.swing.JLabel lblPostAuthor;
    private javax.swing.JLabel lblPostImage;
    private javax.swing.JLabel lblPostLabel;
    private javax.swing.JTextField txtPostData;
    private javax.swing.JTextField txtPostURL;
    // End of variables declaration//GEN-END:variables
}
