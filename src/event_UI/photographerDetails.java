/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event_UI;

import database.dbConnection2;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Samudi
 */
public class photographerDetails extends javax.swing.JPanel {

    /**
     * Creates new form photographerDetails
     */
    public static int pvID=0;
    private static boolean insertAdditional ;
    private static boolean insertNew;
    private boolean alreadyExecuted=false;
    private boolean rowSelected;
    
    public photographerDetails() {
        initComponents();
        new_pvID();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pv_txt_name = new javax.swing.JTextField();
        pv_txt_phone = new javax.swing.JTextField();
        pv_txt_email = new javax.swing.JTextField();
        pv_btn_srch = new javax.swing.JButton();
        pv_btn_Addnew = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pv_txt_address = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pv_chk_print = new javax.swing.JCheckBox();
        pv_chk_digital = new javax.swing.JCheckBox();
        pv_txt_numHrs = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        pv_txt_avgCost = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pv_txt_spclNote = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        pv_chk_photo = new javax.swing.JCheckBox();
        pv_chk_vid = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pvTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pv_btn_add = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Photographer/Videographer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 24))); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(700, 550));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Phone :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Address :");

        pv_btn_srch.setText("Search");
        pv_btn_srch.setToolTipText("Search");
        pv_btn_srch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pv_btn_srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pv_btn_srchActionPerformed(evt);
            }
        });

        pv_btn_Addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        pv_btn_Addnew.setToolTipText("Add New");
        pv_btn_Addnew.setBorderPainted(false);
        pv_btn_Addnew.setContentAreaFilled(false);
        pv_btn_Addnew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pv_btn_Addnew.setFocusPainted(false);
        pv_btn_Addnew.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shadow/add.png"))); // NOI18N
        pv_btn_Addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pv_btn_AddnewActionPerformed(evt);
            }
        });

        pv_txt_address.setColumns(10);
        pv_txt_address.setRows(2);
        jScrollPane2.setViewportView(pv_txt_address);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pv_btn_srch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pv_btn_Addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addComponent(pv_txt_phone)
                    .addComponent(pv_txt_name)
                    .addComponent(pv_txt_email)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pv_btn_Addnew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pv_btn_srch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pv_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pv_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pv_txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Detials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Album Type :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Number of Hours :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Special Notes :");

        pv_chk_print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pv_chk_print.setText("Printed Album");
        pv_chk_print.setOpaque(false);

        pv_chk_digital.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pv_chk_digital.setText("Digital Album");
        pv_chk_digital.setOpaque(false);

        pv_txt_numHrs.setModel(new javax.swing.SpinnerNumberModel(0.5d, 0.5d, 24.0d, 0.5d));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Average Cost :");

        pv_txt_spclNote.setColumns(10);
        pv_txt_spclNote.setRows(3);
        jScrollPane3.setViewportView(pv_txt_spclNote);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Service Type :");
        jLabel1.setToolTipText("");

        pv_chk_photo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pv_chk_photo.setText("Photo");
        pv_chk_photo.setOpaque(false);

        pv_chk_vid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pv_chk_vid.setText("Video");
        pv_chk_vid.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pv_chk_photo)
                        .addGap(30, 30, 30)
                        .addComponent(pv_chk_vid))
                    .addComponent(pv_txt_numHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(pv_txt_avgCost, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(pv_chk_digital)
                    .addComponent(pv_chk_print))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pv_chk_photo)
                        .addComponent(pv_chk_vid))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pv_chk_print)
                    .addComponent(jLabel10))
                .addGap(1, 1, 1)
                .addComponent(pv_chk_digital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pv_txt_numHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pv_txt_avgCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Photographers/Videographers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        pvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pvTable.setOpaque(false);
        pvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pvTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pvTable);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/forbidden.png"))); // NOI18N
        jButton2.setToolTipText("Remove");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shadow/forbidden.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(94, 94, 94))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pv_btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/navigate_right2.png"))); // NOI18N
        pv_btn_add.setToolTipText("Add");
        pv_btn_add.setBorderPainted(false);
        pv_btn_add.setContentAreaFilled(false);
        pv_btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pv_btn_add.setFocusPainted(false);
        pv_btn_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shadow/navigate_right2.png"))); // NOI18N
        pv_btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pv_btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pv_btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(pv_btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pv_btn_srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pv_btn_srchActionPerformed
        searchPhotoVideo jfw = new searchPhotoVideo();
        jfw.setVisible(true);
    }//GEN-LAST:event_pv_btn_srchActionPerformed

    private void pv_btn_AddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pv_btn_AddnewActionPerformed
        clear();
        new_pvID();
         
        insertNew=true;
        insertAdditional=true;    //an event can have many photograpers or videographers
    }//GEN-LAST:event_pv_btn_AddnewActionPerformed

    private void new_pvID(){
        try{
            Statement con = dbConnection2.db().createStatement();
            java.sql.ResultSet record1  = con.executeQuery("SELECT MAX(pvID)+1 FROM photovideodetails");      //get next venue ID
                while(record1.next()){                                                                          // if there is not already inserted venue
                    if(record1.getString(1) == null)                                                            // venue id set to 1  
                        pvID = 1;
                    else
                        pvID = Integer.parseInt(record1.getString("MAX(pvID)+1"));                            // else set venue id to next number
                }
        }catch(ClassNotFoundException | SQLException | NumberFormatException e){
                System.out.println(e);
        }
        insertNew=true;
        insertAdditional=true;
    }
    
    private void pv_btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pv_btn_addActionPerformed
        update_eventphotovideoTable();    //update Database
        if(!alreadyExecuted){
            event_mainWindow.updateProgressBar(15);
            alreadyExecuted=true;
        }
        int rowSelected = pvTable.getSelectedRow();         //do not fill pvTable again while ar table row selected
            if(rowSelected == -1)
                fillPhVidTable();
        
        new_pvID();
        clear();
    }//GEN-LAST:event_pv_btn_addActionPerformed

    private void pvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pvTableMouseClicked
        fillTextFields(Integer.parseInt(String.valueOf(pvTable.getValueAt(pvTable.getSelectedRow(), 0))));      
        fillAdditionalDetails(eventDetails.eventID, Integer.parseInt( String.valueOf(pvTable.getValueAt(pvTable.getSelectedRow(), 0))));
        insertNew=false;
        insertAdditional=false;
        rowSelected = true;
    }//GEN-LAST:event_pvTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if(!rowSelected){
            JOptionPane.showMessageDialog(null, "Please Select an Event...!","Error",1);
        }else{
            if(JOptionPane.showConfirmDialog(null,"Are You sure want to Remove this...?","Remove",JOptionPane.YES_NO_OPTION)==0){
               try {
                    Statement con = dbConnection2.db().createStatement();
                    con.executeUpdate("DELETE FROM eventphotovideo WHERE eventID='"+eventDetails.eventID+"'");
                    
                    DefaultTableModel table = (DefaultTableModel) pvTable.getModel();
                    table.removeRow(pvTable.getSelectedRow());
                } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                    System.out.println(e);
                }
            }
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ViewReport vr = new ViewReport("./reports/report_pv.jasper");
       vr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void fillTextFields(int t_pvID){
        pvID=t_pvID;
        insertNew=false;
              try{
                Statement con = dbConnection2.db().createStatement();
                ResultSet record =  con.executeQuery("SELECT * FROM photovideodetails WHERE pvID='"+pvID+"'" );
                   while(record.next()){
                        pv_txt_name.setText(record.getString("pvName"));
                        pv_txt_phone.setText(record.getString("pvPhone"));
                        pv_txt_email.setText(record.getString("pvEmail"));
                        pv_txt_address.setText(record.getString("pvAddress"));
                    }
            }catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(event_mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillAdditionalDetails(int t_eventID , int t_pvID){
        
        int photo=0,video=0,printed=0,digital=0;

        try{
                Statement con = dbConnection2.db().createStatement();
                ResultSet record =  con.executeQuery("SELECT * FROM eventphotovideo WHERE pvID='"+t_pvID+"' AND eventID='"+t_eventID+"'" );
                   while(record.next()){
                        pv_txt_avgCost.setText(record.getString("avgCost"));
                        pv_txt_spclNote.setText(record.getString("spclNote"));
                        pv_txt_numHrs.setValue(Double.parseDouble(record.getString("numberOfHours")));
                        photo = Integer.parseInt(record.getString("photo"));
                        video = Integer.parseInt(record.getString("video"));
                        printed = Integer.parseInt(record.getString("printedAlbum"));
                        digital = Integer.parseInt(record.getString("digitalAlbum"));
              
                    }
            }catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(event_mainWindow.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println(ex);
        }
       
        setCheckBox(pv_chk_photo, photo);
        setCheckBox(pv_chk_vid, video);
        setCheckBox(pv_chk_digital, digital);
        setCheckBox(pv_chk_print, printed);
    }
       private boolean nullValidate(){
        if(isTextFiledNull(pv_txt_name))
            return false;
        else if(isTextFiledNull(pv_txt_phone))
            return false;
        else if(isTextFiledNull(pv_txt_email))
            return false;
        else if(pv_txt_address.getText().equals("") || pv_txt_address.getText() == null)
            return false;
        else if(isTextFiledNull(pv_txt_avgCost))
            return false;
        else 
            return true;
        
    }
      private boolean isTextFiledNull(JTextField t){
        return t.getText().equals("") || t.getText() == null;
    }
     private boolean isValidMoblieNo(JTextField t){
        return t.getText().length()==10;
    }
    private void setCheckBox(JCheckBox c , int val){
        if(val==1)
            c.setSelected(true);
    }
    
    private void update_eventphotovideoTable(){
        int photo = pv_chk_photo.isSelected() ? 1:0;
        int video = pv_chk_vid.isSelected() ? 1:0;
        int printed = pv_chk_print.isSelected() ? 1:0;
        int digital = pv_chk_digital.isSelected() ? 1:0; 
        
         if(!nullValidate()){
            JOptionPane.showMessageDialog(null,"Field Cannot be Empty...!","Error",1);
        }else if(!isValidMoblieNo(pv_txt_phone)){
            JOptionPane.showMessageDialog(null,"Moblie Number is Invalid...!","Error",1);
            pv_txt_phone.grabFocus();
        }else{
         try{
            Statement con = dbConnection2.db().createStatement();  
                if(insertNew){
                    
                    con.executeUpdate("INSERT INTO photovideodetails "
                                      +"VALUES('"+pvID+"' , '"+pv_txt_name.getText()+"' , '"+pv_txt_phone.getText()+"' , '"+pv_txt_email.getText()+"' , '"+pv_txt_address.getText()+"') ");
                    
                     //insert additional details
                    con.executeUpdate("INSERT INTO eventphotovideo VALUES('"+eventDetails.eventID+"', '"+pvID+"' , '"+photo+"' ,"
                                         +"'"+video+"' , '"+printed+"' , '"+digital+"' , '"+String.valueOf(pv_txt_numHrs.getValue())+"' , '"+pv_txt_avgCost.getText()+"' , '"+pv_txt_spclNote.getText()+"') ");
                  

                    insertNew=false;
                }else{
                    
                    con.executeUpdate("UPDATE photovideodetails "
                                     +"SET pvName='"+pv_txt_name.getText()+"' , pvPhone='"+pv_txt_phone.getText()+"' , pvEmail='"+pv_txt_email.getText()+"' , pvAddress='"+pv_txt_address.getText()+"' "
                                     +"WHERE pvID='"+pvID+"' ");
                    
                    //insert additional details
                    if(insertAdditional){
                        con.executeUpdate("INSERT INTO eventphotovideo VALUES('"+eventDetails.eventID+"', '"+pvID+"' , '"+photo+"' ,"
                                         +"'"+video+"' , '"+printed+"' , '"+digital+"' , '"+String.valueOf(pv_txt_numHrs.getValue())+"' , '"+pv_txt_avgCost.getText()+"' , '"+pv_txt_spclNote.getText()+"') ");
                        insertAdditional = false;
                    //update additional details    
                    }else{                                                 
                        con.executeUpdate("UPDATE eventphotovideo SET photo= '"+photo+"' , video='"+video+"' , printedAlbum='"+printed+"' , "
                                         +"digitalAlbum='"+digital+"' , numberOfHours='"+String.valueOf(pv_txt_numHrs.getValue())+"' , avgCost='"+pv_txt_avgCost.getText()+"' , spclNote='"+pv_txt_spclNote.getText()+"' WHERE eventID='"+eventDetails.eventID+"' AND pvID='"+pvID+"' ");
                    }
                }
            }catch(ClassNotFoundException | SQLException | HeadlessException e){
                        System.out.println(e);
            }  
        }
    }
    
    private void fillPhVidTable(){

        DefaultTableModel table = (DefaultTableModel) pvTable.getModel();
       // table.setRowCount(0);
        
        //setting column width
        TableColumnModel columnModel = pvTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(150);
        try {
            Statement con = dbConnection2.db().createStatement();
            java.sql.ResultSet record =  con.executeQuery("SELECT pvID,pvName FROM photovideodetails WHERE pvID='"+pvID+"' " );
                while(record.next()){   
                    Vector rc = new Vector();
                    rc.add(record.getString("pvID"));
                    rc.add(record.getString("pvName"));
                    table.addRow(rc);
                }
        } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(event_mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    
    private void clear(){
        pv_txt_name.setText("");
        pv_txt_phone.setText("");
        pv_txt_email.setText("");
        pv_txt_address.setText("");
        pv_txt_avgCost.setText("");
        pv_txt_spclNote.setText("");
        pv_chk_photo.setSelected(false);
        pv_chk_vid.setSelected(false);
        pv_chk_digital.setSelected(false);
        pv_chk_print.setSelected(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pvTable;
    private javax.swing.JButton pv_btn_Addnew;
    private javax.swing.JButton pv_btn_add;
    private javax.swing.JButton pv_btn_srch;
    private javax.swing.JCheckBox pv_chk_digital;
    private javax.swing.JCheckBox pv_chk_photo;
    private javax.swing.JCheckBox pv_chk_print;
    private javax.swing.JCheckBox pv_chk_vid;
    private static javax.swing.JTextArea pv_txt_address;
    private javax.swing.JTextField pv_txt_avgCost;
    private static javax.swing.JTextField pv_txt_email;
    private static javax.swing.JTextField pv_txt_name;
    private javax.swing.JSpinner pv_txt_numHrs;
    private static javax.swing.JTextField pv_txt_phone;
    private javax.swing.JTextArea pv_txt_spclNote;
    // End of variables declaration//GEN-END:variables
}
