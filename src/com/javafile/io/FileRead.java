package com.javafile.io;

import java.io.File;

import java.util.Scanner;

public class FileRead {    //INPUT STREAM
    public static void main(String[] args) {
        // we use try catch, bcz there is max chance to throw exception as we are reading files by using scanner
        try{
            File file = new File("C:\\Java\\Test.txt");
            Scanner scanner = new Scanner(file);    // usually we will give system.in to get the values in console

            while(scanner.hasNextLine()){ // It will print all the next lines in file
                System.out.println(scanner.nextLine());
            }


        } catch (Exception e) {
            System.out.println("Error cleared");
        }
    }
}
