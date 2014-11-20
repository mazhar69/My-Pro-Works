package javasocketapplication;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class TCPClient extends Thread implements Serializable {

    String serverName;
    int serverPort;
    int byteSize;
    InetAddress serverIPAddress;
    Socket clientSocket;
    File myFile;

    float percentage;

    long startTime;
    long endTime;
    long duration;

    public TCPClient(String server, int port, int size, File file) {
        serverName = server;
        serverPort = port;
        byteSize = size;
        myFile = file;
    }

    @Override
    public void run() {
        connect();
    }

    public void connect() {
        try {
            startTime = System.nanoTime();

            serverIPAddress = InetAddress.getByName(serverName);
            clientSocket = new Socket(serverIPAddress, serverPort);

            fileSend(myFile);

            endTime = System.nanoTime();
            duration = (endTime - startTime);

        } catch (UnknownHostException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fileReceive(File myFile) {
        try {
            FileOutputStream fis = new FileOutputStream(myFile);
            BufferedOutputStream bos = new BufferedOutputStream(fis);
            InputStream is = clientSocket.getInputStream();

            byte[] mybytearray = new byte[byteSize];

            int byteReadSize = 0;
            int start = 0;
            int size = mybytearray.length;

            while (true) {
                //read from socket
                byteReadSize = is.read(mybytearray, start, size);
                if (byteReadSize > 0) {

                    //write to file
                    bos.write(mybytearray, start, start + byteReadSize);

                    start += byteReadSize;
                    size += mybytearray.length;
                } else {
                    break;
                }
            }
            bos.flush();

            is.close();

            bos.close();
            fis.close();

            clientSocket.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fileSend(File myFile) {

        try {
            FileInputStream fis = new FileInputStream(myFile);

            byte[] mybytearray = new byte[byteSize];
            int length = (int) myFile.length();
            int start = 0;
            int size = mybytearray.length;

            BufferedInputStream bis = new BufferedInputStream(fis);
            OutputStream os = clientSocket.getOutputStream();

            while (start < length) {
                if ((start + mybytearray.length) > length) {
                    size = length;
                } else {
                    size += mybytearray.length;
                }
                //read from file
                bis.read(mybytearray, start, size);

                //write to
                os.write(mybytearray, start, size);

                start += mybytearray.length;
            }
            os.flush();

            bis.close();
            fis.close();

            os.close();

            clientSocket.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPercentage(int progress, int totalSize) {
        percentage = (progress * 100) / totalSize;
    }

    public float getPercentage() {
        return percentage;
    }

}
