package com.javafile.io;


import java.io.File;

public class FileCheck {
    public static void main(String[] args)
    {
        File file = new File("C:\\Java"); //we must needs to give a path of file

        if(file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File missing");
        }
    }
}
