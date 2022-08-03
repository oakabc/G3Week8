/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week8;

import java.io.*; 
import java.util.Scanner; 

 

public class ScanXan { 

    public static void main(String[] args) throws IOException { 

 

        Scanner s = null; 

 

        try { 

            s = new Scanner(new BufferedReader(new FileReader("files/xanadu.txt"))); 

 

            while (s.hasNext()) { 

                System.out.println(s.next()); 

            } 

        } finally { 

            if (s != null) { 

                s.close(); 

            } 

        } 

    } 

} 
