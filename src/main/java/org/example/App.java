/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // User input should consist of y or n
        Scanner input = new Scanner(System.in);
        String user;
        System.out.print("Is the car silent when you turn the key? ");
        user = input.nextLine();
        if(user.compareTo("y") == 0) {
            System.out.print("Are the battery terminals corroded? ");
            user = input.nextLine();
            if(user.compareTo("y") == 0) {
                System.out.print("Clean terminals and try starting again.");
            }
            else if(user.compareTo("n") == 0) {
                System.out.print("Replaces cables and try again.");
            }
        }
        else if(user.compareTo("n") == 0) {
            System.out.print("Does the car make a slicking noise? ");
            user = input.nextLine();

            if(user.compareTo("y") == 0) {
                System.out.print("Replace the battery.");
            }
            else if(user.compareTo("n") == 0) {
                System.out.print("Does the car crank up but fail to start? ");
                user = input.nextLine();
                if(user.compareTo("y") == 0) {
                    System.out.print("Check spark plug connections.");
            }
                else if(user.compareTo("n") == 0) {
                    System.out.print("Does the engine start and then die? ");
                    user = input.nextLine();
                    if(user.compareTo("y") == 0) {
                        System.out.print("Does your car have fuel injection?");
                        user = input.nextLine();
                        if(user.compareTo("y") == 0) {
                            System.out.print("Get it in for service.");
                        }
                        else if(user.compareTo("n") == 0) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }



    }
}
