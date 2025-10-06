package com.tester;

import com.cdac.service.CustomerServiceInterface;
import com.cdac.service.CustomerServiceImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerServiceInterface service = new CustomerServiceImpl();
        int choice;
        do {
            System.out.println("\n===== CUSTOMER MANAGEMENT MENU =====");
            System.out.println("1. Register Customer");
            System.out.println("2. Login");
            System.out.println("3. Change Password");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        System.out.print("Enter Email: ");
                        String email = sc.next();
                        System.out.print("Enter Password: ");
                        int password = sc.nextInt();
                        System.out.print("Enter Type (GOLD/SILVER): ");
                        String type = sc.next();
                        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
                        String dob = sc.next();
                        System.out.print("Enter Balance: ");
                        int bal = sc.nextInt();

                        String status = service.RegisterUser(id, name, email, password, type, dob, bal);
                        System.out.println(status);
                        break;

                    case 2:
                        System.out.print("Enter Email: ");
                        email = sc.next();
                        System.out.print("Enter Password: ");
                        password = sc.nextInt();

                        String loginStatus = service.login(email, password);
                        System.out.println(loginStatus);
                        break;

                    case 3:
                        System.out.print("Enter Email: ");
                        email = sc.next();
                        System.out.print("Enter Old Password: ");
                        int oldPass = sc.nextInt();
                        System.out.print("Enter New Password: ");
                        int newPass = sc.nextInt();

                        String changeStatus = service.changepassword(email, oldPass, newPass);
                        System.out.println(changeStatus);
                        break;

                    case 4:
                        System.out.print("Enter Email: ");
                        email = sc.next();
                        System.out.print("Enter Password: ");
                        password = sc.nextInt();

                        service.deleteCustomer(email, password);
                        System.out.println("Customer deleted successfully!");
                        break;

                    case 5:
                        System.out.println("Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 5);
        sc.close();
    }
}