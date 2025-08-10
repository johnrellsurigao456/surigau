package banking;

import java.util.Scanner;

public class bankingClass {
    
    
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_ACCOUNTS = 100;
        int[] accountNumbers = new int[MAX_ACCOUNTS];
        int[] accountPins = new int[MAX_ACCOUNTS];
        float[] accountBalances = new float[MAX_ACCOUNTS];
        int accountCount = 0;
        boolean backToMain = false;
        
        do {
            backToMain = false;
            System.out.println("\nHELLO WELCOME TO THE SYSTEM!");
            System.out.println("What do you feel doing today? ");
            System.out.println("1. Banking");
            System.out.println("2. Doctors Appointment");
            System.out.println("3. Shopping");
            System.out.println("4. View All Registered Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                   
                    boolean backToBankingMenu = false;
                    do {
                        System.out.println("\n--- Banking System ---");
                        System.out.println("1. Sign In");
                        System.out.println("2. Register Account");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int bankingChoice = sc.nextInt();
                        
                        if (bankingChoice == 1) {
                            // Sign In
                            int attempts = 0;
                            boolean loggedIn = false;
                            int currentAccountIndex = -1;
                            
                            while (attempts < 3 && !loggedIn) {
                                System.out.print("Enter Account No: ");
                                int accNo = sc.nextInt();
                                System.out.print("Enter PIN: ");
                                int pin = sc.nextInt();
                                
                                for (int i = 0; i < accountCount; i++) {
                                    if (accountNumbers[i] == accNo && accountPins[i] == pin) {
                                        loggedIn = true;
                                        currentAccountIndex = i;
                                        System.out.println("\nLogin successful!");
                                        break;
                                    }
                                }
                                
                                if (!loggedIn) {
                                    attempts++;
                                    System.out.println("Invalid credentials. Attempts left: " + (3 - attempts));
                                }
                            }
                            
                            if (loggedIn) {
                               
                                boolean exitBanking = false;
                                while (!exitBanking) {
                                    System.out.println("\n--- Banking Menu ---");
                                    System.out.println("1. Deposit");
                                    System.out.println("2. Withdraw");
                                    System.out.println("3. Check Balance");
                                    System.out.println("4. Back to Banking Menu");
                                    System.out.print("Enter choice: ");
                                    
                                    int menuChoice = sc.nextInt();
                                    
                                    switch(menuChoice) {
                                        case 1:
                                            System.out.print("Enter deposit amount: ");
                                            float deposit = sc.nextFloat();
                                            if (deposit > 0) {
                                                accountBalances[currentAccountIndex] += deposit;
                                                System.out.println("Deposit successful. New balance: " + 
                                                    accountBalances[currentAccountIndex]);
                                            } else {
                                                System.out.println("Invalid amount");
                                            }
                                            break;
                                            
                                        case 2:
                                            System.out.print("Enter withdrawal amount: ");
                                            float withdraw = sc.nextFloat();
                                            if (withdraw > 0 && withdraw <= account


