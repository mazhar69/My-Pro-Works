/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Server;

import java.rmi.AlreadyBoundException;
import java.rmi.NoSuchObjectException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Farshad
 */
public class ServerGUI extends javax.swing.JFrame {

    /**
     * Creates new form ServerGUI
     */
    public ServerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ServerIDLabel = new javax.swing.JLabel();
        ServerAddressTextField = new javax.swing.JTextField();
        ServerPortIDLabel = new javax.swing.JLabel();
        ServerPortNumTextField = new javax.swing.JTextField();
        ServerStartButton = new javax.swing.JButton();
        ServerStopButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ServerStatusTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        ServerFileMenu = new javax.swing.JMenu();
        ServerFileMenuExitItem = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ServerIDLabel.setText("ServerID");

        ServerAddressTextField.setText("127.0.0.1");

        ServerPortIDLabel.setText("Port Number");

        ServerPortNumTextField.setText("1099");

        ServerStartButton.setBackground(new java.awt.Color(0, 102, 0));
        ServerStartButton.setText("Server Start");
        ServerStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerStartButtonActionPerformed(evt);
            }
        });

        ServerStopButton.setBackground(new java.awt.Color(153, 0, 0));
        ServerStopButton.setText("Server Stop");
        ServerStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerStopButtonActionPerformed(evt);
            }
        });

        ServerStatusTextArea.setColumns(20);
        ServerStatusTextArea.setRows(5);
        jScrollPane4.setViewportView(ServerStatusTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ServerStartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                    .addComponent(ServerStopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ServerIDLabel)
                                    .addComponent(ServerPortIDLabel))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ServerPortNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(ServerAddressTextField))))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServerIDLabel)
                    .addComponent(ServerAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ServerPortIDLabel)
                    .addComponent(ServerPortNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(ServerStartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ServerStopButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ServerFileMenu.setText("File");

        ServerFileMenuExitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ServerFileMenuExitItem.setSelected(true);
        ServerFileMenuExitItem.setText("Exit");
        ServerFileMenuExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerFileMenuExitItemActionPerformed(evt);
            }
        });
        ServerFileMenu.add(ServerFileMenuExitItem);

        jMenuBar1.add(ServerFileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServerStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerStartButtonActionPerformed
        try {
            String ip = ServerAddressTextField.getText();
            String port = ServerPortNumTextField.getText();

            server = new Server(ip, Integer.parseInt(port), this);
        } catch (RemoteException | AlreadyBoundException ex) {
            Logger.getLogger(ServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ServerStartButtonActionPerformed

    private void ServerStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerStopButtonActionPerformed
        try {
            server.close();
        } catch (NoSuchObjectException ex) {
            Logger.getLogger(ServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ServerStopButtonActionPerformed

    private void ServerFileMenuExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerFileMenuExitItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ServerFileMenuExitItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGUI().setVisible(true);
            }
        });
    }

    /**
     * createClient
     */
    public void writeToTextArea(String msg) {
        ServerStatusTextArea.append(msg);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ServerAddressTextField;
    private javax.swing.JMenu ServerFileMenu;
    private javax.swing.JRadioButtonMenuItem ServerFileMenuExitItem;
    private javax.swing.JLabel ServerIDLabel;
    private javax.swing.JLabel ServerPortIDLabel;
    private javax.swing.JTextField ServerPortNumTextField;
    private javax.swing.JButton ServerStartButton;
    private javax.swing.JTextArea ServerStatusTextArea;
    private javax.swing.JButton ServerStopButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    //user defined codes
    Server server;
}
