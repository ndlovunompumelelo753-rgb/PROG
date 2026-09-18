package com.mycompany.prog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nokukhanya
 */

    

public class Login {

// Variables to store registered user details
private String storedUsername;
private String storedPassword;
private String storedCellNumber;
private String firstName;
private String lastName;

// 1. Check Username
public boolean checkUserName(String username) {
if (username == null) return false;
return username.contains("_") && username.length() <= 5;
}

// 2. Check Password Complexity
public boolean checkPasswordComplexity(String password) {
if (password == null) return false;
// Regex: At least 8 chars, 1 uppercase, 1 digit, 1 special char
String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";
return password.matches(regex);
}

// 3. Check Cell Phone
public boolean checkCellPhoneNumber(String cellNumber) {
if (cellNumber == null) return false;
// Regex: Must start with +27, followed by 9 digits
String regex = "^\\+27[0-9]{9}$";
return cellNumber.matches(regex);
}

// 4. Register User
public String registerUser(String username, String password, String cellNumber, String fName, String lName) {
if (!checkUserName(username)) {
return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
}
if (!checkPasswordComplexity(password)) {
return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
}
if (!checkCellPhoneNumber(cellNumber)) {
return "Cell phone number incorrectly formatted or does not contain international code.";
}

// Store valid data
this.storedUsername = username;
this.storedPassword = password;
this.storedCellNumber = cellNumber;
this.firstName = fName;
this.lastName = lName;

return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
}

// 5. Login User
public boolean loginUser(String username, String password) {
if (this.storedUsername == null || this.storedPassword == null) return false;
return username.equals(this.storedUsername) && password.equals(this.storedPassword);
}

// 6. Return Login Status
public String returnLoginStatus(boolean isLoggedIn) {
if (isLoggedIn) {
return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
} else {
return "Username or password incorrect, please try again.";
}
}


    
}
