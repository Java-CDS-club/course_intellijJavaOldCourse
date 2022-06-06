package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Main {

    public static void main(String[] args)
    {
        /*try(ServerSocket serverSocket = new ServerSocket(5000))
        {
            while (true)
            {
                new Echoer(serverSocket.accept()).start();
            }
        }catch (IOException e)
        {
            System.out.println("Server exception "+e.getMessage());
        }*/
        try {
            DatagramSocket socket = new DatagramSocket(1000);
            while (true)
            {
                byte[] buffer  = new byte[50];
                DatagramPacket packet = new DatagramPacket(buffer , buffer.length);
                socket.receive(packet);
                System.out.println("Text received is : "+new String(buffer , 0 , packet.getLength()));
                String returnString = "echo : "+new String(buffer , 0 , packet.getLength());
                byte[] buffer2 = returnString.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buffer2 , buffer2.length , address , port);
                socket.send(packet);
            }
        }catch (SocketException e)
        {
            System.out.println("Socket Exception : "+e.getMessage());
        }catch (IOException e)
        {
            System.out.println("IOException : "+e.getMessage());
        }
    }
}
