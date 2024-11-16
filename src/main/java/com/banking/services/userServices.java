package com.banking.Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class userServices{
    private static Map<String , String> users = new HashMap<>();

    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)){
            System.out.println("User Already Exists. Choose another username.");
        }
        else {
            users.put(username , password);
            System.out.print("user registered successfully " + username);
       
        }

    }

    public static void loginUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        
        if (users.containsKey(username) && users.get(username).equals(password)){
            System.out.println("login was Successful. Welcome to the app Mr/Ms:" + username);
        }
        else {
            System.out.println("login failed. please check the username or the password");
        }
    }
    
}
 