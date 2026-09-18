package com.mycompany.prog;

import java.util.Scanner;

public class PROG {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Login loginSystem = new Login();

System.out.println("=== Welcome to the Chat App Registration ===");

System.out.print("Enter First Name: ");
String fName = scanner.nextLine();

System.out.print("Enter Last Name: ");
String lName = scanner.nextLine();

System.out.print("Enter Username (must contain '_' and be <= 5 chars): ");
String username = scanner.nextLine();

System.out.print("Enter Password (min 8 chars, 1 capital, 1 number, 1 special): ");
String password = scanner.nextLine();

System.out.print("Enter SA Cell Phone Number (e.g., +27831234567): ");
String cellNumber = scanner.nextLine();

String registrationMessage = loginSystem.registerUser(username, password, cellNumber, fName, lName);
System.out.println("\n--- Registration Status ---");
System.out.println(registrationMessage);

if (registrationMessage.contains("successfully captured")) {
System.out.println("\n=== Login ===");
System.out.print("Enter Username: ");
String loginUser = scanner.nextLine();

System.out.print("Enter Password: ");
String loginPass = scanner.nextLine();

boolean isLoggedIn = loginSystem.loginUser(loginUser, loginPass);
String loginStatus = loginSystem.returnLoginStatus(isLoggedIn);

System.out.println("\n--- Login Status ---");
System.out.println(loginStatus);
} else {
System.out.println("Registration failed. Please restart the application and try again.");
}

scanner.close();
}
}
