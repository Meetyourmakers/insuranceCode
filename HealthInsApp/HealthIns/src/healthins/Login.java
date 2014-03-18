package healthins;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    protected static ArrayList <Usr> users;
    public Login(ArrayList<Usr> usr) {
        initComponents();
        users = usr;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submit_LoginButton = new javax.swing.JButton();
        register_loginButton = new javax.swing.JButton();
        username_loginField = new javax.swing.JTextField();
        password_loginField = new javax.swing.JPasswordField();
        exit_LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText(" Password:");

        submit_LoginButton.setText("Submit");
        submit_LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_LoginButtonActionPerformed(evt);
            }
        });

        register_loginButton.setText("Register");
        register_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_loginButtonActionPerformed(evt);
            }
        });

        username_loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_loginFieldActionPerformed(evt);
            }
        });

        exit_LoginButton.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submit_LoginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(register_loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_loginField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(password_loginField))))
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(exit_LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(password_loginField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_LoginButton)
                    .addComponent(register_loginButton))
                .addGap(18, 18, 18)
                .addComponent(exit_LoginButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void username_loginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_loginFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_loginFieldActionPerformed

    private void submit_LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_LoginButtonActionPerformed
        String username = username_loginField.getText();
        String password = password_loginField.getText();
        Boolean flag = false;
        for (int i=0; i<users.size(); i++){
            if(username.equalsIgnoreCase(users.get(i).getId()) && password.equalsIgnoreCase(users.get(i).getPass())){
                    NextPage page=new NextPage();
                    page.setVisible(true);
                    JLabel label = new JLabel("Welcome:"+username);
                    page.getContentPane().add(label);
                    flag = true;
                    break;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"User "+username+" not found.");
        }
    }//GEN-LAST:event_submit_LoginButtonActionPerformed

    private void register_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_loginButtonActionPerformed
        new RegisterFrame().setVisible(true);
    }//GEN-LAST:event_register_loginButtonActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ArrayList <Usr> users = new ArrayList();
                new Login(users).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password_loginField;
    private javax.swing.JButton register_loginButton;
    private javax.swing.JButton submit_LoginButton;
    private javax.swing.JTextField username_loginField;
    // End of variables declaration//GEN-END:variables
}
