package com.javafile.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Java\\Test.txt");
        FileWriter filewriter = new FileWriter("C:\\Java\\Test.txt");

        filewriter.write("welcome to java"); //will deleting all the presented contents and add ony what we given

        filewriter.append("Java"); // will add the contents without deleting available contents

        filewriter.close(); //end the file writting method //mandatory one

        System.out.println("Succesfully updated");

    }
}


