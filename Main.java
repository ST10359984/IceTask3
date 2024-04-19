/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Login loginSystem = new Login();
        boolean registrationSuccess = false;
        
        //Prompt user to register
        while (!registrationSuccess){
        System.out.println("Please register an account.");
        System.out.print("Enter username (with an underscore and no more than 5 characters): ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password (at least 8 characters, with a capital etter, a number and a special chracter.: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        //Register user and dispay  message
        String registrationMessage = loginSystem.registerUser(username, password, firstName, lastName);
        
        System.out.println(registrationMessage);
        
        //Check if registration was successfull
            if (loginSystem.checkUserName(username) && loginSystem.checkPasswordComplexity(password)){
                registrationSuccess = true;
            System.out.println("Registration successfill! Please log in.");}
            else {
                System.out.println("Please try regiistering again with the correct format.");
                    }
            }
        
        //If registration is successfull, promp for login
        boolean loginSuccess = false;
        while (!loginSuccess){
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();
            
        //Attempt login and display message
        loginSuccess = loginSystem.loginUser(loginUsername, loginPassword);
        String loginStatusMessage = loginSystem.returnLoginStatus(loginSuccess);
        
        System.out.println(loginStatusMessage);
        
        //If login fails, prompt the user to try again
        if (!loginSuccess){
            System.out.println("Please try logging in again with the correct username and password.");
            }
        }
        scanner.close();
    }
}
