/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsixteenanwar;
// Initially I was going to use JSON, but JSON is meant more for JS than Java
// Second thought: CSV for a Twitter CLI is a horrible idea, txt file might have been better
import java.io.BufferedReader;  
import java.io.FileReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 *
 * @author s201076699
 */
public class AssignmentSixteenAnwar {

    // Declare and initalize Scanner for input
    static Scanner keyedInput = new Scanner (System.in);
    
    public static void main(String[] args) {
        loginFlow();
        // 5 Arrays, each with 20 Elements, that alone makes a total of 100 Elements
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> userNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> posts = new ArrayList<>();
        ArrayList<Boolean> verifiedUser = new ArrayList<>();
        
        // Variable that will be changed later and will represent each line
        String line = "";
        try {
            // Create a new buffer to read file data.csv
            BufferedReader br = new BufferedReader(new FileReader("data.csv"));  
            while ((line = br.readLine()) != null){  
                // Split CSV by commas and sort data into named variables
                String[] data = line.split(","); 
                String name = data[0];
                String userName = data[1];
                String email = data[2];
                String post = data[3].toString();
                // Check verified as it could be a string or double
                Boolean verified = false;
                if(data[4].equals("true")){
                    verified = true;
                } else if(data[4].equals("false")){
                    verified = false;
                } else{
                    // If it is stored as a double, if it is greater than 100 then the user is verified
                    Double verificationChance = Double.parseDouble(data[4]); //this is a funny variable
                    if(verificationChance >100){
                        verified = true;
                    }
                }
                // Add all the information about the specific user
                names.add(name);
                userNames.add(userName);
                emails.add(email);
                posts.add(post);
                verifiedUser.add(verified);
            }  
        } catch (IOException e){
            // Print error in event of failure
            System.out.println("----------");
            System.out.println("You have failed to change the Path of the data files, visit lines: the exact error you encountered was:");
            e.printStackTrace();  
            System.out.println("----------");
        }
        // only exit when user chooses to do so, using a boolean
        Boolean userExit = false;
        while(userExit == false){
            // Print welcome messages
            System.out.println("----------");
            System.out.println("Welcome to your Clitter Homepage!");
            System.out.println("1.Vew your feed \n2.Edit settings \n3.Create post \n4.Delete account \n5.Exit Clitter");
            System.out.println("----------");
            // Request input
            System.out.print("(1/2/3/4/5)>>>  ");
            String option = keyedInput.next();
            // Depending on decision, show curated feed, change account settings, create a post, delete user account or exit altogether (respectfully)
            System.out.println("");
            if(option.equals("1")){
                 System.out.println("Loading content...");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Generating curated feed...");
                System.out.println("Your special feed, curated just for you");
                System.out.println("Welcome to your curated feed:");
                displayFeed(names, userNames, emails, posts, verifiedUser);
            } else if(option.equals("2")){
                changeAccountSettings();
            } else if(option.equals("3")){
                createPost();
            }else if(option.equals("4")){
                deleteAccount();
            } else if(option.equals("5")){
                System.out.println("Sorry to see you go!");
                break;
            }
            
        }
    }
    // This is a recursive function that displays the user's feed
    // It takes in all the arrays as input
    static void displayFeed(ArrayList names, ArrayList userNames, ArrayList emails, ArrayList posts, ArrayList verifiedUser){
        System.out.println("To move to the next post, press Enter");
        System.out.println("To stop, type in 'No' ");
        // Because it is recursive and to add some spice to the feed, it chooses the next post randomly (based on the total number of items (names.size()))
        int randomPostPosition = (int) Math.round(Math.random()*names.size());
        //Based on the random number, print the information for that specific post from all arrays
        System.out.println("----------");
        // This line uses and iternary operator to determine whether it should be blank or have content
        String verificationStatus = ((Boolean) verifiedUser.get(randomPostPosition))==false ? "" : "(⌐■_■) Verified";
        // The rest of the lines display the post content/info
        System.out.println(verificationStatus);
        System.out.println(names.get(randomPostPosition) + " - " + userNames.get(randomPostPosition));
        System.out.println("Contact me at: " + emails.get(randomPostPosition));
        System.out.println("Post: " + posts.get(randomPostPosition));
        System.out.println("----------");
        // Ask if user wants to see the next post
        System.out.print("(Y/N)>>>  ");
        String showNextPost = keyedInput.next();
        // If not then send them back to the main menu, or else recurse(?) and show another post
        if(showNextPost.equalsIgnoreCase("n")){
            return;
        } else{
            displayFeed(names, userNames, emails, posts, verifiedUser);  
        }
    }
    // This function changes account settings of the user
    static void changeAccountSettings(){
        // It reads all pre-existing user data
        ArrayList<String> userInfo = readUserData();
        // Prompts user, provides menu and requests input
        System.out.println("What account settings would you like to change?");
        System.out.println("1. Name \n2. Username \n3. Password \n4. Email \n5. Verification Status \n6. Exit");
        System.out.print("(1/2/3/4/5/6) >>> ");
        String option = keyedInput.next();
        
        //Takes different actions based on input, each if-block shows the old data, asks what the new data should be then calls
        // writeUserData to change the information (it provides it with the all the old data, the new data segment and where the segment should be inserted)
        if(option.equals("1")){
                System.out.println("Your current name is: " + userInfo.get(0));
                System.out.println("What would you like to change your name to?");
                String newName = keyedInput.next();
                writeUserData(userInfo, newName, 0);
                return;            
        } else if(option.equals("2")){
                System.out.println("Your current user name is: " + userInfo.get(1));
                System.out.println("What would you like to change your username to?");
                String newUserName = keyedInput.next();
                writeUserData(userInfo, newUserName, 1);
                return;         
        } else if(option.equals("3")){
                System.out.println("Your current password is: " + userInfo.get(2));
                System.out.println("What would you like to change your email to?");
                String newPassword = keyedInput.next();
                writeUserData(userInfo, newPassword, 2);
                return;       
        } else if(option.equals("4")){
                System.out.println("Your current email is: " + userInfo.get(4));
                System.out.println("What would you like to change your email to?");
                String newEmail = keyedInput.next();
                writeUserData(userInfo, newEmail, 4);
                return;           
        } else if(option.equals("5")){
            // This specific if block is to provide the user with a chance to be verified
            // if they are already verified it does nothing
                if (userInfo.get(5).equals("false")){
                    // Or else it prompts and requests whether they want to be verified
                  System.out.println("Would you like to be verified? (yes/no)");
                  String wantVerification = keyedInput.next();
                  String userVerified = "false";
                  // If they do want to be verified it calls a function to verifiy them
                  if(wantVerification.equalsIgnoreCase("yes")){
                      userVerified = Boolean.toString(verifyUser());
                  }
                  // Lastly, like all other if-blocks in this function it writes the data to the file
                  writeUserData(userInfo, userVerified, 5);  
              } else {
                  System.out.println("You have already been verified. We will not remove your verification.");
              }
              return;         
        }  else if(option.equals("6")){
            // Option 6 allows the user to exit
              return;         
        } 
    }
    
    static String createAccount(){
            System.out.println("Please note, you can only have one account. This action may delete your old account.");
            System.out.println("What would you like to set your name as?");
            String name = keyedInput.nextLine();

            System.out.println("What would you like to set your username to?");
            String userName = keyedInput.nextLine();

            System.out.println("What would you like to set your password to?");
            String password = keyedInput.nextLine();

            System.out.println("What is your age?");
            String age = keyedInput.nextLine();            
            
            System.out.println("What would you like to set your email to?");
            String email = keyedInput.nextLine();

            System.out.println("Would you like to be verified?");
            String wantVerification = keyedInput.nextLine();
            String userVerified = "false";
            if(wantVerification.equalsIgnoreCase("yes")){
                userVerified =Boolean.toString(verifyUser());
            }
            ArrayList<String> userInfo = new ArrayList<>(Arrays.asList(name, userName, password, age, email, userVerified));
            writeUserData(userInfo);
            return "true";
    }
    
    static void writeUserData(ArrayList allData){
            try {
                FileWriter myWriter = new FileWriter("user.csv");
                myWriter.write(allData.get(0) +","+ allData.get(1) +","+ allData.get(2)  +","+ allData.get(3) +","+ allData.get(4)  +","+ allData.get(5));
                myWriter.close();
            } catch (IOException ex) {
                System.out.println("You have failed to change the Path of the data files, visit lines: the exact error you encountered was:");
                System.out.println(ex);
            }
    }
     static void deleteAccount(){
            try {
                FileWriter myWriter = new FileWriter("user.csv");
                myWriter.write("undefined,undefined,undefined,undefined,undefined,undefined");
                myWriter.close();
                System.out.println("Your account has been deleted.");
                System.exit(0);
            } catch (IOException ex) {
                System.out.println("You have failed to change the Path of the data files, visit lines: the exact error you encountered was:");
                System.out.println(ex);
            }
    }
    static void writeUserData(ArrayList allData, String newSegment, int position){
        allData.set(position, newSegment);
        try {
            FileWriter myWriter = new FileWriter("user.csv");
            myWriter.write(allData.get(0) +","+ allData.get(1) +","+ allData.get(2)  +","+ allData.get(3) +","+ allData.get(4)  +","+ allData.get(5));
            myWriter.close();
        } catch (IOException ex) {
            System.out.println("You have failed to change the Path of the data files, visit lines: the exact error you encountered was:");
            System.out.println(ex);
        }
    }
    // Fun little perk
    static Boolean verifyUser(){
            long verificationChance = (long) Math.round(Math.random()*200);
            Boolean userVerified = false;
            if (verificationChance > 100){
                System.out.println("Clitter has approved your verification. You are verified");
                userVerified = true;
            } else{
                System.out.println("Clitter has decided not to verify you. Remain a peasant.");
            }
            return userVerified;
    }
    static void loginFlow(){
        // accountSuccess measures whether an account has been made or successfully signed into if not it wont let the user pass and view Clitter
        // accountSuccess could be many values (false, fail, true)
        String accountSuccess = "false";
        while(!accountSuccess.equals("true")){
            System.out.println("");
            System.out.println("Welcome to the Clitter (CLI + Twitter). Would you like to");
            System.out.println("1.Login to your account or 2.Create a new account ");
            System.out.print("(1/2) >>> ");
            String loginFlowOption = keyedInput.nextLine();
            if(loginFlowOption.equals("1")){
                accountSuccess = loginToAccount();
            } else if(loginFlowOption.equals("2")) {
                accountSuccess = createAccount();
            }
        }
    }
    
    static String loginToAccount(){
        ArrayList<String> userInfo = readUserData();
        // Countering the edge case where the user has previously deleted their account
        if(userInfo.get(1).equals("undefined")){
            System.out.println("You must create an account.");
            String accountSuccess = createAccount();
            return accountSuccess;
        }
        String userLoggedIn = "false";
        while(userLoggedIn.equals("false")){
            System.out.println("----------");
            // Get username
            System.out.print("Please enter in your username >>> ");
            String username = keyedInput.nextLine();
            // Check file info if username is correct
            if(userInfo.get(1).equals(username)){
                // Get password
                System.out.print("Please enter in your password >>> ");
                String password = keyedInput.nextLine();
                // Check file info if password is right
                if(userInfo.get(2).equals(password)){
                    System.out.println("You are logged in!");
                    userLoggedIn = "true";
                } else{
                    System.out.println("Incorrect Password");
                    System.out.print("Would you like to try again? (y/n) >>> ");
                    String nextLoginFlow = keyedInput.nextLine();
                    if(nextLoginFlow.equalsIgnoreCase("n")){
                        userLoggedIn = "fail";
                    }
                }
            } else {
                    System.out.println("Incorrect Username.");
                    System.out.print("Would you like to try again? (y/n) >>> ");
                    String nextLoginFlow = keyedInput.nextLine();
                    if(nextLoginFlow.equalsIgnoreCase("n")){
                        userLoggedIn = "fail";
                    }
            }
        }
        return userLoggedIn;
    }
    
    static void createPost(){
        ArrayList<String> userInfo = readUserData();
        System.out.println("What is the content of your post?");
        String postContent = keyedInput.nextLine();

        try {        
            File file = new File("data.csv");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(br);
            pr.println(userInfo.get(0) + "," + userInfo.get(1) + "," +userInfo.get(4)+ "," +postContent+ "," +userInfo.get(5));
            pr.close();
            br.close();
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(AssignmentSixteenAnwar.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 
            
    static ArrayList readUserData(){
        ArrayList<String> userInfo = new ArrayList<>();
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("user.csv"));  
            String line;
            while ((line = buffer.readLine()) != null){  
                String[] data = line.split(","); 

                userInfo.add(data[0]);
                userInfo.add(data[1]);
                userInfo.add(data[2]);
                userInfo.add(data[3]);
                userInfo.add(data[4]);
                userInfo.add(data[5]);
            }
        } catch (IOException e){  
            e.printStackTrace();  
        }
        return userInfo;
    }
}
