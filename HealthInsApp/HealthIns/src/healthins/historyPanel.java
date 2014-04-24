package healthins;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author vitormgb
 */
public class historyPanel extends javax.swing.JFrame {

    /**
     * Creates new form UserContent
     */
    public historyPanel() {
        initComponents();
        setDefaultCloseOperation(RegisterFrame.DISPOSE_ON_CLOSE);
        getImages();
    }
    
    public static ArrayList<History> readHistory(ArrayList <History> hist){
        try{
            InputStream file = new FileInputStream("history");
            InputStream buffer = new BufferedInputStream(file);
            File f = new File("history");
            if(f.length()!=0){
                try(ObjectInput input = new ObjectInputStream (buffer)) {
                    ArrayList<History> recoveredHist = (ArrayList<History>)input.readObject();
                    for(History h: recoveredHist)
                       hist.add(new History(h.getOwner(), h.getHist()));
                }
            }
        }
        catch(ClassNotFoundException | IOException ex){
            return null;
        }
        return hist;
    }
    
    public static Boolean saveHistory(ArrayList <History> hist){
        try {
            FileOutputStream fos = new FileOutputStream("history");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(hist);
            }
        }
        catch(IOException ex) {
            return false;
        }
        return true; 
    }
    
    
    
    

    private void getImages() {
        try {
            BufferedImage calendarIcon = ImageIO.read(new File("imgs/cal.png"));
            BufferedImage contactIcon = ImageIO.read(new File("imgs/cont.png"));
            BufferedImage formIcon = ImageIO.read(new File("imgs/serv.png"));
            BufferedImage historyIcon = ImageIO.read(new File("imgs/hist.png"));
            BufferedImage calcIcon = ImageIO.read(new File("imgs/calc.png"));

            JLabel calLabel = new JLabel(new ImageIcon(calendarIcon));
            JLabel contactLabel = new JLabel(new ImageIcon(contactIcon));
            JLabel formLabel = new JLabel(new ImageIcon(formIcon));
            JLabel histLabel = new JLabel(new ImageIcon(historyIcon));
            JLabel calcLabel = new JLabel(new ImageIcon(calcIcon));

            this.calendarPanel.add(calLabel);
            this.contactPanel.add(contactLabel);
            this.formPanel.add(formLabel);
            this.historyPanel.add(histLabel);
            this.calcPanel.add(calcLabel);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unable to load images.");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel = new javax.swing.JTabbedPane();
        calendarPanel = new javax.swing.JTabbedPane();
        contactPanel = new javax.swing.JTabbedPane();
        historyPanel = new javax.swing.JTabbedPane();
        logoutButton = new javax.swing.JButton();
        calcPanel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        editHistoryArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        editHistory = new javax.swing.JButton();
        loadHistory = new javax.swing.JButton();
        saveHistory = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formPanelMouseClicked(evt);
            }
        });

        calendarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarPanelMouseClicked(evt);
            }
        });

        contactPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactPanelMouseClicked(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        calcPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcPanelMouseClicked(evt);
            }
        });

        editHistoryArea.setColumns(20);
        editHistoryArea.setRows(5);
        jScrollPane2.setViewportView(editHistoryArea);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Edit History");

        editHistory.setText("Load and Edit");
        editHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editHistoryMouseClicked(evt);
            }
        });
        editHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHistoryActionPerformed(evt);
            }
        });

        loadHistory.setText("Show");
        loadHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadHistoryMouseClicked(evt);
            }
        });

        saveHistory.setText("Save");
        saveHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveHistoryMouseClicked(evt);
            }
        });
        saveHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveHistoryActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadHistory)
                                .addGap(148, 148, 148)
                                .addComponent(editHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(historyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historyPanel)
                    .addComponent(contactPanel)
                    .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(calcPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(editHistory)
                    .addComponent(loadHistory)
                    .addComponent(saveHistory)
                    .addComponent(clearButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        this.setVisible(false);
        Login frame = new Login(Login.users);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void formPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formPanelMouseClicked
        this.dispose();
        this.setVisible(false);
        formPanel frame = new formPanel();
        frame.setVisible(true);
    }//GEN-LAST:event_formPanelMouseClicked

    private void calendarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPanelMouseClicked
        this.dispose();
        this.setVisible(false);
        calendarPanel frame = new calendarPanel();
        frame.setVisible(true);
    }//GEN-LAST:event_calendarPanelMouseClicked

    private void contactPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactPanelMouseClicked
        this.dispose();
        this.setVisible(false);
        contactPanel frame = new contactPanel();
        frame.setVisible(true);
    }//GEN-LAST:event_contactPanelMouseClicked

    private void calcPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcPanelMouseClicked
        this.dispose();
        this.setVisible(false);
        calculatorPanel frame = new calculatorPanel();
        frame.setVisible(true);
    }//GEN-LAST:event_calcPanelMouseClicked

    private void editHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editHistoryActionPerformed

    private void saveHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveHistoryActionPerformed

    private void loadHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadHistoryMouseClicked
        ArrayList<History> hist = new ArrayList();
        String owner = HealthIns.currentUsr.getId();
        hist = readHistory(hist);
        if(histExists()){
            for(int i=0; i<hist.size(); i++){
                if(hist.get(i).getOwner().equals(owner)){
                    JOptionPane.showMessageDialog(null, hist.get(i).getHist());
                    break;
                }
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No history to load.");
    }//GEN-LAST:event_loadHistoryMouseClicked

    private void editHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editHistoryMouseClicked
        ArrayList<History> hist = new ArrayList();
        String owner = HealthIns.currentUsr.getId();
        hist = readHistory(hist);
        if(histExists()){
            try{
                for(int i=0; i<hist.size(); i++){
                    if(hist.get(i).getOwner().equals(owner)){
                        this.editHistoryArea.setText(hist.get(i).getHist());
                        break;
                    }
                }
            }catch(Exception e){
                this.editHistoryArea.setText("");
            }
        }
        else
           this.editHistoryArea.setText("");
    }//GEN-LAST:event_editHistoryMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        this.editHistoryArea.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void saveHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveHistoryMouseClicked
        ArrayList<History> hist = new ArrayList();
        String owner = HealthIns.currentUsr.getId();
        hist = readHistory(hist);
        if(histExists()){
            for(int i=0; i<hist.size(); i++){
                if(hist.get(i).getOwner().equals(owner)){
                    hist.get(i).setHist(this.editHistoryArea.getText());
                    JOptionPane.showMessageDialog(null, "Company history successfully overwritten.");
                    break;
                }
            }
            
        }
        else{ 
            if(this.editHistoryArea.getText().length()==0)
                hist.add(new History(owner, " "));
            else
                hist.add(new History(owner, this.editHistoryArea.getText()));
            JOptionPane.showMessageDialog(null, "Company history successfully added.");
        }
        this.editHistoryArea.setText("");
        saveHistory(hist);
        loadHistoryMouseClicked(evt);
    }//GEN-LAST:event_saveHistoryMouseClicked
    
    private boolean histExists(){
        ArrayList<History> hist = new ArrayList();
        String owner = HealthIns.currentUsr.getId();
        hist = readHistory(hist);
        for(int i=0; i<hist.size(); i++){
            if(hist.get(i).getOwner().equals(owner)){
                return true;
            }
        }
        return false;
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new historyPanel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane calcPanel;
    private javax.swing.JTabbedPane calendarPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JTabbedPane contactPanel;
    private javax.swing.JButton editHistory;
    private javax.swing.JTextArea editHistoryArea;
    private javax.swing.JTabbedPane formPanel;
    private javax.swing.JTabbedPane historyPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadHistory;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton saveHistory;
    // End of variables declaration//GEN-END:variables
}
