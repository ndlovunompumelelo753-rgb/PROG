/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog;

/**
 *
 * @author Nokukhanya
 /import java.until.regex.matcher;
import.until.regex.pattern;
public class PROG {


public class Login {

// Variables to store registered user details
private String storedUsername;
private String storedPassword;
private String storedCellNumber;
private String firstName;
private String lastName;

// 1. Check Username: Contains underscore and no more than 5 chars
public Boolean checkUserName(String username) {
// Prompt states: Username contains an underscore and is no more than five characters long.
if (username == null) return false;
return username.contains("_") && username.length() <= 5;
}

// 2. Check Password Complexity: At least 8 chars, 1 capital, 1 number, 1 special
public boolean checkPasswordComplexity(String password) {
if (password == null) return false;

// Regex explanation:
// (?=.*[A-Z]) -> At least one uppercase letter
// (?=.*[0-9]) -> At least one digit
// (?=.*[@#$%^&+=!]) -> At least one special character
// .{8,} -> At least 8 characters long
String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$";
return password.matches(regex);
}

// 3. Check Cell Phone: International code +27, max 10 characters long total
// *Reference: Regex adapted from standard South African phone number formats*
public Boolean checkCellPhoneNumber(String cellNumber) {
if (cellNumber == null) return false;

// Must start with +27, followed by 9 digits (total 12 characters) OR
// The prompt says "no more than ten characters long" which implies standard local format
// but includes international code. Let's match +27 followed by 9 digits (standard 11 digit total).
// We will use a strict Regex for by 9 digits.
String regex = "^\\+27[0-9]{9}$";
return cellNumber.matches(regex);
}

// 4. Register User: Returns the necessary registration messaging
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

// If all validations pass, store the data
this.storedUsername = username;
this.storedPassword = password;
this.storedCellNumber = cellNumber;
this.firstName = fName;
this.lastName = lName;

return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
}

// 5. Login User: Verifies login details match stored details
public B
* 
* oolean loginUser(String username, String password) {
if (this.storedUsername == null || this.storedPassword == null) {
return false; // No user registered yet
}
return username.equals(this.storedUsername) && password.equals(this.storedPassword);
}

// 6. Return Login Status: Returns success or failure message
public String returnLoginStatus(Boolean isLoggedIn) {
if (isLoggedIn) {
return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
} else {
return "Username or password incorrect, please try again.";
}
}
}
}
