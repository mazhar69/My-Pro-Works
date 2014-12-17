/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Tamanna Afreen
 */

/**
 * implements abstract class RMIServerInterface
 **/
public class RMIClient extends UnicastRemoteObject implements RMIClientInterface {

    ClientGUI clientGUI;

    public RMIClient(ClientGUI clientGUI) throws RemoteException {

        this.clientGUI = clientGUI;
    }

    /**
     * implementation of abstract method from abstract class RMIServerInterface
     **/
    @Override
    public void showChat(String sender_name, String msg) {
        clientGUI.showChat(sender_name, msg);
    }

    /**
     * implementation of abstract method from abstract class RMIServerInterface
     **/
    @Override
    public void isAlive() {
    }
}
