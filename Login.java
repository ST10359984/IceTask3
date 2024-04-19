package login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Login {

    private String Username;
    private String Password;
    private String firstName;
    private String lastName;
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <=5;
    }
    public boolean checkPasswordComplexity(String password){
        return password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches("[!@#$%^&-_*()].*");
    }
    public String registerUser(String username, String password, String firstName, String lastName){
        if (!checkUserName(username)){
            return "Username is not correctly formatted, please ensure that your username contaings an underscore and is no more that 5 characters in length.";
        }
        else if (!checkPasswordComplexity(password)){
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";}
        else{
            this.Username = username;
            this.Password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            return "Username and Password successfully captured";
        }
    }
    
    public boolean loginUser(String username, String password){
        return this.Username.equals(username) && this.Password.equals(password);
    }
    public String returnLoginStatus(boolean loginSuccess){
        if (loginSuccess){
            return "Welcome " + this.firstName + " it is geat to see you again.";}
        else{
            return "Username or password incorrect, please try again";
        }
    }   
}
