/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmichatapp;

/**
 *
 * @author Farshad
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientGUI
     */
    public ClientGUI() {
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

        jPanel2 = new javax.swing.JPanel();
        ClientServerPanel = new javax.swing.JPanel();
        ClientServerIDLabel = new javax.swing.JLabel();
        ClientServerIDTextField = new javax.swing.JTextField();
        ClientServerPortID = new javax.swing.JLabel();
        ClientServerPortIDTextField = new javax.swing.JTextField();
        ClientUserIDLabel = new javax.swing.JLabel();
        ClientUserIDTextField = new javax.swing.JTextField();
        ClientPasswordLabel = new javax.swing.JLabel();
        ClientPasswordField = new javax.swing.JPasswordField();
        ClientLogInButton = new javax.swing.JButton();
        ClientSignUpButton = new javax.swing.JButton();
        AvailableClientPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientAvailableTextArea = new javax.swing.JTextArea();
        ClientMessageBoardPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientMessageTextArea = new javax.swing.JTextArea();
        ClientMessageSendButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClientMessageWriteTextArea = new javax.swing.JTextArea();
        ClientMessageDiscardButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ClientFileChooseButton = new javax.swing.JButton();
        ClientFilePathTextField = new javax.swing.JTextField();
        ClientFileSendButton = new javax.swing.JButton();
        ClientFileTrnsProgressBar = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        FileMenuChatClient = new javax.swing.JRadioButtonMenuItem();
        FileMenuChatSever = new javax.swing.JRadioButtonMenuItem();
        FileMenuExitItem = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ClientServerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<b> Server Address</b>\n</html>"));

        ClientServerIDLabel.setText("Server Address");

        ClientServerIDTextField.setText("127.10.0.1");

        ClientServerPortID.setText("Server Port");

        ClientServerPortIDTextField.setText("1800");

        ClientUserIDLabel.setText("User ID");

        ClientUserIDTextField.setText("John214");

        ClientPasswordLabel.setText("Password");

        ClientPasswordField.setText("jPasswordField1");

        ClientLogInButton.setText("Log in");

        ClientSignUpButton.setText("Signup");

        javax.swing.GroupLayout ClientServerPanelLayout = new javax.swing.GroupLayout(ClientServerPanel);
        ClientServerPanel.setLayout(ClientServerPanelLayout);
        ClientServerPanelLayout.setHorizontalGroup(
            ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientServerPanelLayout.createSequentialGroup()
                .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ClientServerPanelLayout.createSequentialGroup()
                        .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClientServerPanelLayout.createSequentialGroup()
                                .addComponent(ClientUserIDLabel)
                                .addGap(28, 28, 28)
                                .addComponent(ClientUserIDTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClientServerPanelLayout.createSequentialGroup()
                                .addComponent(ClientPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClientPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(ClientServerPanelLayout.createSequentialGroup()
                        .addComponent(ClientServerIDLabel)
                        .addGap(3, 3, 3)
                        .addComponent(ClientServerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientServerPortID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClientServerPortIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientLogInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientSignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ClientServerPanelLayout.setVerticalGroup(
            ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientServerPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ClientServerPanelLayout.createSequentialGroup()
                        .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClientServerIDLabel)
                            .addComponent(ClientServerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClientServerPortID)
                            .addComponent(ClientServerPortIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClientLogInButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClientUserIDLabel)
                            .addComponent(ClientUserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ClientServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClientPasswordLabel)
                            .addComponent(ClientPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClientServerPanelLayout.createSequentialGroup()
                        .addComponent(ClientSignUpButton)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        AvailableClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<b>Available for Chat</b>\n</html>"));

        ClientAvailableTextArea.setColumns(20);
        ClientAvailableTextArea.setRows(5);
        jScrollPane1.setViewportView(ClientAvailableTextArea);

        javax.swing.GroupLayout AvailableClientPanelLayout = new javax.swing.GroupLayout(AvailableClientPanel);
        AvailableClientPanel.setLayout(AvailableClientPanelLayout);
        AvailableClientPanelLayout.setHorizontalGroup(
            AvailableClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        AvailableClientPanelLayout.setVerticalGroup(
            AvailableClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        ClientMessageBoardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("<html>\n<b>Message Board</b>\n</html>"));

        ClientMessageTextArea.setColumns(20);
        ClientMessageTextArea.setRows(5);
        jScrollPane2.setViewportView(ClientMessageTextArea);

        ClientMessageSendButton.setText("Send");

        ClientMessageWriteTextArea.setColumns(20);
        ClientMessageWriteTextArea.setRows(5);
        ClientMessageWriteTextArea.setText("Hi,\nPlease Write Something and share");
        jScrollPane3.setViewportView(ClientMessageWriteTextArea);

        ClientMessageDiscardButton.setText("Discard");

        javax.swing.GroupLayout ClientMessageBoardPanelLayout = new javax.swing.GroupLayout(ClientMessageBoardPanel);
        ClientMessageBoardPanel.setLayout(ClientMessageBoardPanelLayout);
        ClientMessageBoardPanelLayout.setHorizontalGroup(
            ClientMessageBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(ClientMessageBoardPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientMessageBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientMessageDiscardButton)
                    .addComponent(ClientMessageSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        ClientMessageBoardPanelLayout.setVerticalGroup(
            ClientMessageBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientMessageBoardPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClientMessageBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientMessageBoardPanelLayout.createSequentialGroup()
                        .addComponent(ClientMessageSendButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClientMessageDiscardButton))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("<html><b>File Transfer</b></html>"));

        ClientFileChooseButton.setText("Choose");

        ClientFilePathTextField.setText("Choose File to send");
        ClientFilePathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientFilePathTextFieldActionPerformed(evt);
            }
        });

        ClientFileSendButton.setText("Send");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ClientFileTrnsProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ClientFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientFileChooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientFileSendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientFileChooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientFilePathTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClientFileSendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientFileTrnsProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientServerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(ClientMessageBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AvailableClientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ClientServerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AvailableClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ClientMessageBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        FileMenu.setText("File");

        FileMenuChatClient.setSelected(true);
        FileMenuChatClient.setText("Client mode");
        FileMenu.add(FileMenuChatClient);

        FileMenuChatSever.setSelected(true);
        FileMenuChatSever.setText("Server mode");
        FileMenu.add(FileMenuChatSever);

        FileMenuExitItem.setSelected(true);
        FileMenuExitItem.setText("Exit");
        FileMenu.add(FileMenuExitItem);

        jMenuBar1.add(FileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientFilePathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientFilePathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientFilePathTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AvailableClientPanel;
    private javax.swing.JTextArea ClientAvailableTextArea;
    private javax.swing.JButton ClientFileChooseButton;
    private javax.swing.JTextField ClientFilePathTextField;
    private javax.swing.JButton ClientFileSendButton;
    private javax.swing.JProgressBar ClientFileTrnsProgressBar;
    private javax.swing.JButton ClientLogInButton;
    private javax.swing.JPanel ClientMessageBoardPanel;
    private javax.swing.JButton ClientMessageDiscardButton;
    private javax.swing.JButton ClientMessageSendButton;
    private javax.swing.JTextArea ClientMessageTextArea;
    private javax.swing.JTextArea ClientMessageWriteTextArea;
    private javax.swing.JPasswordField ClientPasswordField;
    private javax.swing.JLabel ClientPasswordLabel;
    private javax.swing.JLabel ClientServerIDLabel;
    private javax.swing.JTextField ClientServerIDTextField;
    private javax.swing.JPanel ClientServerPanel;
    private javax.swing.JLabel ClientServerPortID;
    private javax.swing.JTextField ClientServerPortIDTextField;
    private javax.swing.JButton ClientSignUpButton;
    private javax.swing.JLabel ClientUserIDLabel;
    private javax.swing.JTextField ClientUserIDTextField;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JRadioButtonMenuItem FileMenuChatClient;
    private javax.swing.JRadioButtonMenuItem FileMenuChatSever;
    private javax.swing.JRadioButtonMenuItem FileMenuExitItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
