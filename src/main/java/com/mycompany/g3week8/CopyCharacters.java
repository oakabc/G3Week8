package com.mycompany.g3week8;

import java.io.FileReader; 

import java.io.FileWriter; 

import java.io.IOException; 

 

public class CopyCharacters { 

    public static void main(String[] args) throws IOException { 

 

        FileReader inputStream = null; 

        FileWriter outputStream = null; 

 

        try { 

            inputStream = new FileReader("files/xanadu.txt"); 

            outputStream = new FileWriter("files/characteroutput.txt"); 

 

            int c; 

            while ((c = inputStream.read()) != -1) { 

                outputStream.write(c); 

                System.out.println("" + c + " to char = " + (char) c); 

            } 

        } finally { 

            if (inputStream != null) { 

                inputStream.close(); 

            } 

            if (outputStream != null) { 

                outputStream.close(); 

            } 

        } 

    } 

} 