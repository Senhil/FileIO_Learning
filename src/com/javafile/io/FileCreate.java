package com.javafile.io;

import java.io.File;

public class FileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Java\\Test.txt");  // declaring path of the file we're checking

            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }

        } catch (Exception e) {
            System.out.println("Error Checked");
        }
    }
}

