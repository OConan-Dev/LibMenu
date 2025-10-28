/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libmenu;


/**
 *
 * @author 30128308
 */
import java.util.Scanner; //Scanner for user input
import java.io.FileWriter; //For creating and writing to file
import java.io.IOException; //For input/Output error handling
import java.io.File; //For reading to file
import java.io.FileNotFoundException; //For reading files that dont exist errors

public class LibMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int usrOpt; //Var for user choice in menu
        
        do {
        System.out.println("Select Option:\n1: User Login\n2: Staff Login\n3: View Library Contents\n4: Create new user\n5: Exit"); //Base options
     
        System.out.println("Type option");
        usrOpt = sc.nextInt();
        sc.nextLine();
        
        switch (usrOpt) { //switches the use case
            case 1:
                System.out.println("Login");
                break;
            case 2:
                System.out.println("Staff Login");
                break;
            case 3:
                System.out.println("Loading Library Contents");
                break;
            case 4: {
                String username;
                String password;
                boolean confirm = false;
                do {
                System.out.println("Enter new Username:");
                username = sc.nextLine();
                
                System.out.println("Enter new Password:");
                password = sc.nextLine();
                
                System.out.println("Are you happy with the username and password: " + username + " " + password + " [yes/no]");
                String input = sc.nextLine().trim().toLowerCase();
                confirm = input.equals("yes");
                
                if (!confirm) {
                    System.out.println("Please enter details again");
                }
                } while (!confirm);
                
                FileWrite.fileWrite(username, password);
                break;
            }
            case 5:
                System.out.println("Now Exiting...");
                sc.close();
                System.exit(0);
                break;
            case 6:
                System.out.println("Secret testing case");
                FileRead.fileRead();
                break;
            default:
                System.out.println("Error: Invalid Option");
        }

        } while (usrOpt != 5);
        sc.close();
        System.exit(0);
}
}