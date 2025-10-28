/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libmenu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
        public static void fileWrite(String username, String password) {
        
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("C:\\Users\\Orang\\Documents\\testfile.csv");
            boolean fileExists = file.exists();
            
            FileWriter writer = new FileWriter(file, true);
            
            if (!fileExists) {
                writer.write("username, password\n");
            }
            
            System.out.println("Please enter a username and password");
//            String userWord = sc.nextLine();
            
            writer.write(username + "," + password + "\n");
            
            writer.close();
            System.out.println("File written successfully");
            
        } catch (IOException e) {
            System.out.println("An error occured" + e.getMessage());
        }
    }
}
