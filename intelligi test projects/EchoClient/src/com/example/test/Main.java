package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*try (Socket socket = new Socket("localhost" , 5000)){
            socket.setSoTimeout(5000);
            BufferedReader echos = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream() , true);
            Scanner scanner = new Scanner(System.in);
            String echoToString , response;
            do {
                System.out.println("Enter String to be echoed : ");
                echoToString= scanner.nextLine();
                stringToEcho.println(echoToString);
                if (!echoToString.equals("exit"))
                {
                    response = echos.readLine();
                    System.out.println(response);
                }
            }while (!echoToString.equals("exit"));
        }catch (SocketTimeoutException e)
        {
            System.out.println("The socket timed out");
        }
        catch (IOException e)
        {
            System.out.println("Client Error : "+e.getMessage());
        }*/

        try {
            InetAddress address = InetAddress.getLocalHost();
            DatagramSocket datagramSocket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in);
            String echoString;
            do {
                System.out.println("Enter string to be echoed : ");
                echoString =  scanner.nextLine();
                byte[] buffer = echoString.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer , buffer.length , address,1000);
                datagramSocket.send(packet);
                byte[] buffer2 = new byte[50];
                packet = new DatagramPacket(buffer2 , buffer2.length);
                datagramSocket.receive(packet);
                System.out.println("Text received is : "+new String(buffer2 , 0 , packet.getLength()));
            }while (!echoString.equals("exit"));
        }catch (SocketTimeoutException e)
        {
            System.out.println("The socket timed out");
        }catch (IOException e)
        {
            System.out.println("Client error "+e.getMessage());
        }
    }
}
