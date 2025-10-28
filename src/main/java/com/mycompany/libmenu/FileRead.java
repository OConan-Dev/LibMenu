/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libmenu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Orang
 */
public class FileRead {
    public static void fileRead() {
        try {
            File file = new File("C:\\Users\\Orang\\Documents\\testfile.csv");
            Scanner reader = new Scanner(file);
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] columns = line.split(",");
                
                if (columns.length == 2) {
                    System.out.println("Username: " + columns[0] + " | Password: " + columns[1]);
                } else {
                    System.out.println(line);
                }
            }
            
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
    }
}
}

