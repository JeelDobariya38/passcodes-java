package com.passcodes.app;

import java.util.Scanner;

public class App {
    public static final String RESET = "\033[0m";      // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String BLUE = "\033[0;34m";    // BLUE
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Passcodes v0.0.0");
        System.out.println();
        
        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine().trim();
            input = input.toLowerCase();
            
            if (input == "") {
                continue;
            }
            
            else if (input.startsWith("quit") || input.startsWith("exit")) {
                System.exit(0);
            }
            
            else if (input.startsWith("help")) {
                System.out.println("Passcodes v0.0.0");
                System.out.println();
                
                System.out.println("help, will be avaliable soon!!!");
            }
            
            else if (input.startsWith("version")) {
                System.out.println("Passcodes v0.0.0");
                System.out.println();
                
                System.out.println("GITHUB: " + BLUE + "https://github.com/JeelDobariya38/PassCodes" + RESET);
            }
            
            else {
                System.out.println(RED + "Inavlid Command!!!" + RESET);
            }
            
            System.out.println();
        }
    }
}
