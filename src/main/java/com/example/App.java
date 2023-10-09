package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        try{
            Socket s = new Socket("localhost",3000);
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream output = new DataOutputStream(s.getOutputStream());
            System.out.println(" Creati input ed output");
            output.writeBytes("ciao server \n");
            System.out.println("stringa inviata");
            String str = input.readLine();
            System.out.println("stringa ricevuta in maiuscolo");
            System.out.println(str);

            s.close();

        
        }
        catch(Exception e){

        }
    }
}
