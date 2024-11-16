package com.banking;
import java.util.Scanner;
import com.banking.Services.userServices;

public class BankingApp{
    public static void main (String[] args){
        System.out.println("Welcome to The Bunny Bank App");
        DisplayMenu();
        
    }
    private static void DisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPlease choose an Option:");
            System.out.println("1. User Registeration");
            System.out.println("2. User Login");
            System.out.println("3. Exit");

            int Choice = scanner.nextInt();
            scanner.nextLine();

            switch(Choice){
                case 1:
                   userServices.registerUser();
                   break; 
                case 2:
                    userServices.loginUser();
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid Choice. Please select the valid option");
            }
        }
    }
}