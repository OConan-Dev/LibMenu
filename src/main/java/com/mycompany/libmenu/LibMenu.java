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
        
        System.out.println("Select Option:\n1: User Login\n2: Staff Login\n3: View Library Contents\n4 Create new user\n5: Exit"); //Base options
        
        int usrOpt; //Var for user choice in menu
        String usrNam; //var for setting a username 
        String usrPwd; //Var for setting a password
     
        System.out.println("Type option");
        usrOpt = sc.nextInt();
        
        //sc.close(); // scanner close
        
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
                System.out.println("Loading User creation menu");
                break;
            case 5:
                System.out.println("Now Exiting...");
                break;
            default:
                System.out.println("Error: Invalid Option");
        }
        
        if (usrOpt == 5) {
            System.exit(0);
        }
        else if (usrOpt == 4){
            System.out.println("Please enter a username:");
            sc.nextLine();
            usrNam = sc.nextLine();
            System.out.println("Please set a password:");
            //sc.nextLine();
            usrPwd = sc.nextLine();
            System.out.println("You have set the Username and password:" + usrNam + " " + usrPwd);
            try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(usrNam + " " + usrPwd);
            myWriter.close();
            System.out.println("Wrote to file!");
            } catch (IOException e) {
                System.out.println("An error occured");
                e.printStackTrace();
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An Error Occured");
                e.printStackTrace();
                }
//                File myObj = new File("filename.txt");
//                if (myObj.exists()) {
//                    System.out.println("File name: " + myObj.getName());
//                    System.out.println("Path: " + myObj.getAbsolutePath());
//                    System.out.println("writeable: " + myObj.canWrite());
//                    System.out.println("readable: " + myObj.canRead());
//                    System.out.println("File size in bytes: " + myObj.length());
//                } else {
//                    System.out.println("Does not exist");
//                }
            }
            }
//        else
//            System.out.println("WIP");
//        
//        sc.close();
        }

