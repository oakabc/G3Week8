package com.mycompany.g3week8;

import java.io.FileInputStream; 

import java.io.FileOutputStream; 

import java.io.IOException; 

 

public class CopyBytes { 

 

    public static void main(String[] args) throws IOException { 

 

        FileInputStream in = null; 

        FileOutputStream out = null; 

 

        try { 

            in = new FileInputStream("files/xanadu.txt"); 

            out = new FileOutputStream("files/outagain.txt"); 

            int c; 

 

            while ((c = in.read()) != -1) { 

                out.write(c); 

                System.out.println("" + c + " to char = " + (char) c); 

 

            } 

        } finally { 

            if (in != null) { 

                in.close(); 

            } 

            if (out != null) { 

                out.close(); 

            } 

        } 

    } 

}     

