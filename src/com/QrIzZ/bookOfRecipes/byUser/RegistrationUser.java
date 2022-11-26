package com.QrIzZ.bookOfRecipes.byUser;
import at.favre.lib.crypto.bcrypt.BCrypt;
import java.io.*;
import java.util.Scanner;

public class RegistrationUser {
    static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter userName => ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter emailId => ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            System.out.print(" Enter phoneNo => ");
            long phoneNo = scanner.nextLong();
            register.setPhoneNo(phoneNo);
            File file = new File("Users.txt");
            String hashedUserPassword = BCrypt.withDefaults().hashToString(12, password.toCharArray());
            writingTextToFile(file, readFile(file),   lastName + " " + firstName + " " + userName + " " + hashedUserPassword + " " + emailId + " " + phoneNo + " ");
            System.out.println("Реєстрація успішна");
            System.out.println(register.toString());
        }
    }
    static String readFile(File file){
        String TextFiles = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Users.txt"));
            String line;
            while ((line = br.readLine()) != null )
            {
                TextFiles += line + "\n";
            }

        }catch (IOException e){
            System.out.println("Error: " + e);

        }finally {
            try{
                br.close();
            }catch (IOException e){
                System.out.println("Error: " + e);

            }
        }
        return TextFiles;
    }

    static void writingTextToFile(File file, String pastText, String textWritten){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            String newText =  pastText;
            newText += textWritten;
            pw.write(newText);
            pw.close();

        }catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}

class Register {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

}
