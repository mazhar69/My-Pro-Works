package RMI_Client;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mazhar
 */
public class TCPServer extends Thread {

    int serverPort;
    ServerSocket serverSocket = null;
    boolean listening = true;

    int byteSize;

    String myFileName;
    
    ClientGUI serverClientGUI;

    public TCPServer(int Port, int size, String myfile, ClientGUI aThis) {
        serverPort = Port;
        myFileName = myfile;
        byteSize = size;
        
        serverClientGUI = aThis;
    }

    public void startListening() {
        listening = true;
    }

    public void stopListening() {
        listening = false;
    }

    @Override
    public void run() {
        connect();
    }

    public void connect() {
        try {
            serverSocket = new ServerSocket(serverPort);

            while (listening) {
                new TCPServerThread(serverSocket.accept(), byteSize, myFileName,serverClientGUI).start();
            }
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
