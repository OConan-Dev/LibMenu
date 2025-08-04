/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libmenu;


/**
 *
 * @author 30128308
 */
import java.util.Scanner;

public class LibMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select Options:\n1: User Login\n2: Staff Login\n3: View Library Contents\n4: Exit");
        
        int usrOpt;
        
        System.out.println("Type option");
        usrOpt = sc.nextInt();
        //System.out.println(x);
        
        sc.close(); // scanner close
        
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
            case 4:
                System.out.println("Now Exiting...");
                break;
            default:
                System.out.println("Error: Invalid Option");
        }
        
        //if else statments for later
//        if (usrOpt == 1) {
//           System.out.println("Loggin in");
//        }
//        else if (usrOpt == 2) {
//            System.out.println("Staff logon loading");
//        }
//        else if (usrOpt == 3) {
//            System.out.println("Loading Library Contents");
//        }
//        else if (usrOpt == 4) {
//            System.exit(0);
//        }
//        else {
//            System.out.println("Invalid");
//        }
        if (usrOpt == 4) {
            System.exit(0);
        }
        }
    }

