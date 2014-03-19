package healthins;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
public class RegisterFrame extends javax.swing.JFrame {
    
    public RegisterFrame() {
        initComponents();
        setDefaultCloseOperation(RegisterFrame.DISPOSE_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_Register = new javax.swing.JLabel();
        password_Register = new javax.swing.JLabel();
        pswInput_Register = new javax.swing.JPasswordField();
        usrInput_Register = new javax.swing.JTextField();
        submitReg_Register = new javax.swing.JButton();
        clearReg_Register = new javax.swing.JButton();
        close_Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username_Register.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        username_Register.setText("Username: ");

        password_Register.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        password_Register.setText("Password: ");

        pswInput_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswInput_RegisterActionPerformed(evt);
            }
        });

        usrInput_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrInput_RegisterActionPerformed(evt);
            }
        });

        submitReg_Register.setText("Register");
        submitReg_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitReg_RegisterActionPerformed(evt);
            }
        });

        clearReg_Register.setText("Clear");
        clearReg_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearReg_RegisterActionPerformed(evt);
            }
        });

        close_Register.setText("Close");
        close_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(submitReg_Register)
                        .addGap(18, 18, 18)
                        .addComponent(clearReg_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usrInput_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(pswInput_Register))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(close_Register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usrInput_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswInput_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitReg_Register)
                    .addComponent(clearReg_Register))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(close_Register))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrInput_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrInput_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrInput_RegisterActionPerformed

    private void pswInput_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswInput_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswInput_RegisterActionPerformed

    private void clearReg_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearReg_RegisterActionPerformed
        usrInput_Register.setText("");
        pswInput_Register.setText("");
    }//GEN-LAST:event_clearReg_RegisterActionPerformed

    private void submitReg_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitReg_RegisterActionPerformed
        String username = usrInput_Register.getText();
        String password = pswInput_Register.getText();
        boolean flag = true;
        for (int i=0; i<Login.users.size(); i++){
            if(Login.users.get(i).getId().equalsIgnoreCase(username)){
                flag = false;
                break;
            }
        }
        if(username.length()==0 || password.length()==0)
            JOptionPane.showMessageDialog(null,"Username and Password cannot be blank!");
        else if(flag){
            Login.users.add(new Usr(username,password));
            HealthIns.saveUsers(Login.users);
            JOptionPane.showMessageDialog(null,"Username "+username+" created!.");
        }
        else
            JOptionPane.showMessageDialog(null,"Username "+username+" already in use.");
    }//GEN-LAST:event_submitReg_RegisterActionPerformed

    private void close_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_RegisterActionPerformed
         JFrame frame = (JFrame)SwingUtilities.getRoot(this);
         frame.setVisible(false);
    }//GEN-LAST:event_close_RegisterActionPerformed
    public void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearReg_Register;
    private javax.swing.JButton close_Register;
    private javax.swing.JLabel password_Register;
    private javax.swing.JPasswordField pswInput_Register;
    private javax.swing.JButton submitReg_Register;
    private javax.swing.JLabel username_Register;
    private javax.swing.JTextField usrInput_Register;
    // End of variables declaration//GEN-END:variables
}
