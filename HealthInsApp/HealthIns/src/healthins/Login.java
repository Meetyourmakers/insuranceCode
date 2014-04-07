package healthins;
import java.util.*;
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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(81, 86, 86, 50);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText(" Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(81, 155, 86, 50);

        submit_LoginButton.setText("Submit");
        submit_LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submit_LoginButton);
        submit_LoginButton.setBounds(81, 211, 88, 29);

        register_loginButton.setText("Register");
        register_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(register_loginButton);
        register_loginButton.setBounds(213, 211, 95, 29);

        username_loginField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_loginFieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_loginField);
        username_loginField.setBounds(173, 87, 135, 50);
        getContentPane().add(password_loginField);
        password_loginField.setBounds(173, 155, 135, 50);

        exit_LoginButton.setText("Exit");
        exit_LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exit_LoginButton);
        exit_LoginButton.setBounds(148, 258, 100, 29);

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
            if(username.equalsIgnoreCase(users.get(i).getId()) && password.equals(users.get(i).getPass())){
                    this.setVisible(false);
                    HealthIns.setCurrentUsr(users.get(i));
                    this.dispose();
                    new UserContent().setVisible(true);
                    flag = true;
                    break;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"User "+username+" not found or password incorrect!");
        }
    }//GEN-LAST:event_submit_LoginButtonActionPerformed

    private void register_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_loginButtonActionPerformed
        this.setVisible(false);
        this.dispose();
        new RegisterFrame().setVisible(true);
    }//GEN-LAST:event_register_loginButtonActionPerformed

    private void exit_LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_LoginButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_LoginButtonActionPerformed
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
