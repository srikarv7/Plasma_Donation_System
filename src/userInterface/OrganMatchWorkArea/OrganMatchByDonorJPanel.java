/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.OrganMatchWorkArea;

import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Donor;
import Business.Person.Recipient;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.AdminWorkSpace.SystemAdminWorkArea;

/**
 *
 * @author patol
 */
public class OrganMatchByDonorJPanel extends javax.swing.JPanel {

    JPanel rightPanel;
    ECOSystem system;
    List<Donor> donorList;
    Donor donorEmail;
    Recipient recipientEmail;
    
    /**
     * Creates new form ManageOrganMatch
     */
    public OrganMatchByDonorJPanel(JPanel rightPanel, ECOSystem system, List<Donor> donorList) {
        initComponents();
        this.rightPanel = rightPanel;
        this.system = system;
        this.donorList = donorList;
         populateDonorTable();
         //populateRecipientTable(List<String> organs, String city);
         tbldonorInfo.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));
         recipientInfoJTable.getTableHeader().setFont(new Font("Times New Roman" , Font.ITALIC,23));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        recipientInfoJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldonorInfo = new javax.swing.JTable();
        BtnFindMatch = new javax.swing.JButton();
        btnInform = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recipientInfoJTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        recipientInfoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Recipient Name", "Network", "Plasma", "Severity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recipientInfoJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 980, 170));

        tbldonorInfo.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        tbldonorInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Donor Name", "Network", "Plasma", "Plasma Availabilty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbldonorInfo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 970, 150));

        BtnFindMatch.setBackground(new java.awt.Color(153, 204, 255));
        BtnFindMatch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtnFindMatch.setText("Find Match");
        BtnFindMatch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFindMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFindMatchActionPerformed(evt);
            }
        });
        add(BtnFindMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 270, 40));

        btnInform.setBackground(new java.awt.Color(153, 204, 255));
        btnInform.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnInform.setText("Inform About Match");
        btnInform.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformActionPerformed(evt);
            }
        });
        add(btnInform, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 280, 40));

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setFocusTraversalPolicyProvider(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFindMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFindMatchActionPerformed
        int selectedRow = tbldonorInfo.getSelectedRow();
        
        if(selectedRow >= 0){
           Donor donor = (Donor) tbldonorInfo.getValueAt(selectedRow, 0);
           String city = (String) tbldonorInfo.getValueAt(selectedRow, 1);
           List<String> organs = donor.getOrgans();
           donorEmail = donor;
           populateRecipientTable(organs, city);    
        }else{

            JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnFindMatchActionPerformed

    private void btnInformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformActionPerformed
        int selectedRow = recipientInfoJTable.getSelectedRow();

        if (selectedRow >= 0) {
            recipientEmail = (Recipient) recipientInfoJTable.getValueAt(selectedRow, 0);
            sendEmail(donorEmail.getEmailAdd());
            sendEmail(recipientEmail.getEmailAdd());
            JOptionPane.showMessageDialog(null, "Organ match information is sent successfully via email.");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnInformActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //rightPanel.remove(this);
        //CardLayout layout = (CardLayout) rightPanel.getLayout();
        //layout.previous(rightPanel);
        ManageOrganMatchJPanel manageCitiesJPanel = new ManageOrganMatchJPanel(rightPanel, system);
        rightPanel.add("manageCitiesJPanel", manageCitiesJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFindMatch;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInform;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable recipientInfoJTable;
    private javax.swing.JTable tbldonorInfo;
    // End of variables declaration//GEN-END:variables

    private void populateDonorTable() {
        
        DefaultTableModel model = (DefaultTableModel) tbldonorInfo.getModel();

        model.setRowCount(0);

        for (Donor donor : donorList) {
            Object[] row = new Object[4];
            row[0] = donor;
            row[1] = donor.getNetwork();
            row[2] = donor.getOrgans();
            row[3] = donor.getIsOrganAvaiNow();

            model.addRow(row);
        }
    }

    private void populateRecipientTable(List<String> organs, String city) {
        
         DefaultTableModel model = (DefaultTableModel) recipientInfoJTable.getModel();

        //HashMap<String, Donor> donorList = new HashMap<String, Donor>();
        List<Recipient> recipientList = new ArrayList<Recipient>();

        model.setRowCount(0);
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof HospitalEnterprise){
                    for (Organization or : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (or.getName().equalsIgnoreCase("Visitor Organization")) {
                            for (Recipient recipient : or.getRecipientDirectory().getRecipientList()) {
                                //for(String organ : organs){
                                    //if(organ.equalsIgnoreCase(recipient.getOrgan())){
                                    //add to list  
                                    int p = recipient.getPriority();
                                    if((organs.contains(recipient.getOrgan())) && (p > 0)){
                                          recipient.setNetwork(network.getName());
                                          recipientList.add(recipient);
                                      }  
                                        
                                        
                                    //}
                                //}
                            }
                        }

                   }
                }
            }
        }
        
        
        Collections.sort(recipientList, new Comparator<Recipient>() {

             @Override
             public int compare(Recipient o1, Recipient o2) {
                 return o2.compareTo(o1);
             }
        
        });
        
        for(Recipient obj : recipientList){
            Object[] row = new Object[4];
            row[0] = obj;
            row[1] = obj.getNetwork();
            row[2] = obj.getOrgan();
            row[3] = obj.getPriority();
            model.addRow(row);
        }
        
    }

       
       private void sendEmail(String emailAdd) {
            final String to = emailAdd;
            boolean sessionDebug=false;
            String from = "sidjonas12345@gmail.com"; 
            String host = "smtp.gmail.com";
            String user="sidjonas12345@gmail.com";
            String pass = "Smart@1995";
            Properties properties = System.getProperties();  
            properties.setProperty("mail.smtp.host", host); properties.put("mail.smtp.starttls.required", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host",host);  
            properties.put("mail.smtp.port", "587");  
            properties.put("mail.smtp.auth", "true");  
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());  
            Session session;
            session = Session.getDefaultInstance(properties,  null);
            session.setDebug(sessionDebug);
            try{
            MimeMessage message = new MimeMessage(session);  
            message.setFrom(new InternetAddress(from));  
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            InternetAddress address;
            address = new InternetAddress(to);
            message.setSubject("Did you know?");  
            message.setText("We have paired "+ donorEmail.getEmailAdd()+ " with " + recipientEmail.getEmailAdd()+ " for organ transplant.");  
            Transport transport = session.getTransport("smtp");
            transport.connect(host,user,pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            //JOptionPane.showMessageDialog(null, "Please check your email for further details!");
            }
            
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error!");
            }
        }
}
