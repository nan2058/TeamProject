package com.busticket;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number of Bus");
        int n= scanner.nextInt();
         while (true) {
                    System.out.println("\nBus Ticket Booking System");
                    System.out.println("1. Sign Up");
                    System.out.println("2. Login");
                    System.out.println("3. Show Available Buses");
                    System.out.println("4. Book Ticket");
                    System.out.println("5. View Tickets");
                    System.out.println("6. Cancel Ticket");
                    System.out.println("7. Show Bus Summary");
                    System.out.println("8. Exit");
                    System.out.println("Enter your choice:");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            bookingSystem.signUp;
                            break;
                        case 2:
                            bookingSystem.login;
                            break;
                        case 3:
                            bookingSystem.showAvailableBuses;
                            break;
                        case 4:
                            bookingSystem.bookTicket;
                            break;
                        case 5:
                            bookingSystem.viewTickets;
                            break;
                        case 6:
                            bookingSystem.cancelTicket;
                            break;
                        case 7:
                            bookingSystem.showBusSummary;
                            break;
                        case 8:
                            System.out.println("Thank you for using Bus Ticket Booking System!");
                            return;
                        default:
                            System.out.println("Invalid choice!");
                    }
                }
            }
        }
    }
}
