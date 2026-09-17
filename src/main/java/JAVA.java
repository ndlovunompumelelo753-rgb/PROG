/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author Nokukhanya
 *

import.Test;
import static.Assert.*;

public class {

Login login = new Login();

// --- Username Tests ---
@Test
public void testUsernameCorrectlyFormatted() {
// Test Data: "_1"
assertTrue("Username should be valid", login.(1"));
}

@Test
public void testUsernameIncorrectlyFormatted() {
// Test Data: "kyle!!!!!!!"
assertFalse("Username should be invalid", login.("kyle!!!!!!!"));
}

// --- Password Tests ---
@Test
public void testPasswordMeetsComplexity() {
// Test Data: "Ch&sec@ke99!"
assertTrue("Password should be valid", login.("Ch&sec@ke99!"));
}

@Test
public void testPasswordDoesNotMeetComplexity() {
// Test Data: "password"
assertFalse("Password should be invalid", login.("password"));
}

// --- Cell Phone Tests ---
@Test
public void testCellPhoneCorrectlyFormatted() {
// Test Data: "+27838968976"
assertTrue("Cell phone should be valid",("+27838968976"));
}

@Test
public void testCellPhoneIncorrectlyFormatted() {
// Test Data: "08966553"
assertFalse("Cell phone should be invalid",("08966553"));
}

// --- Login Status Tests ---
@Test
public void testLoginSuccessful() {
// Register a user first
login.registerUser("_1", "Ch&sec@ke99!", "+27838968976", "Kyle", "Smith");
// Attempt login with correct credentials
assertTrue(login.loginUser("_1", "Ch&sec@ke99!"));
}

@Test
public void testLoginFailed() {
// Register a user first
login.registerUser("_1", "Ch&sec@ke99!", "+27838968976", "Kyle", "Smith");
// Attempt login with incorrect password
assertFalse(login.("_1", "WrongPassword1!"));
}
}

 
