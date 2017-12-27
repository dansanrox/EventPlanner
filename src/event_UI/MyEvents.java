/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_UI;

import database.dbConnection2;
import static event_UI.event_mainWindow.jProgressBar1;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Dhanuka Abeywardhane
 */
public class MyEvents extends javax.swing.JPanel {

    static int realYear, realMonth, realDay, currentYear, currentMonth;
    static String days; 
    static String allEventsDays[];       
    static boolean rowSelected;
    static int evID;
    public MyEvents() {
        initComponents();
        fillYearCombo();
        refreshCalendar (realMonth, realYear); //Refresh calendar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        calendarTable = new javax.swing.JTable();
        lblMonth = new javax.swing.JLabel();
        nextMonth = new javax.swing.JButton();
        prevMonth = new javax.swing.JButton();
        yearCombo = new javax.swing.JComboBox();
        test = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventsTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Events", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 24))); // NOI18N
        setOpaque(false);

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        calendarTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calendarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calendarTable.setCellSelectionEnabled(true);
        calendarTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calendarTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        calendarTable.setShowHorizontalLines(false);
        calendarTable.setShowVerticalLines(false);
        calendarTable.getTableHeader().setResizingAllowed(false);
        calendarTable.getTableHeader().setReorderingAllowed(false);
        calendarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calendarTable);

        lblMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonth.setText("January");

        nextMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextMonth.setText(">");
        nextMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthActionPerformed(evt);
            }
        });

        prevMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prevMonth.setText("<");
        prevMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevMonthActionPerformed(evt);
            }
        });

        yearCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });

        test.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Events", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        eventsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "Name", "Type", "Time", "Venue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        eventsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eventsTable);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(220, 220, 220))
        );

        jLabel1.setText("Date : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(prevMonth)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(nextMonth)
                        .addGap(18, 18, 18)
                        .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMonth)
                            .addComponent(nextMonth)
                            .addComponent(prevMonth)
                            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prevMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevMonthActionPerformed
            if (currentMonth == 0){ //Back one year
                currentMonth = 11;
                currentYear -= 1;
            }else{ //Back one month
                currentMonth -= 1;
            }
         refreshCalendar(currentMonth, currentYear);
    }//GEN-LAST:event_prevMonthActionPerformed

    private void nextMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthActionPerformed
       if (currentMonth == 11){ //Foward one year
		currentMonth = 0;
		currentYear += 1;
	}
	else{ //Foward one month
		currentMonth += 1;
	}
	refreshCalendar(currentMonth, currentYear);
        
        
    }//GEN-LAST:event_nextMonthActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        if (yearCombo.getSelectedItem() != null){
		String b = yearCombo.getSelectedItem().toString();
		currentYear = Integer.parseInt(b);
		refreshCalendar(currentMonth, currentYear);
	}
    }//GEN-LAST:event_yearComboActionPerformed

    private void calendarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarTableMouseClicked
        String s = ""+yearCombo.getSelectedItem()+"-"+(currentMonth+1)+"-"+calendarTable.getValueAt(calendarTable.getSelectedRow(), calendarTable.getSelectedColumn());
        test.setText(s);
        fillMyEventstable();
             
    }//GEN-LAST:event_calendarTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(!rowSelected){
            JOptionPane.showMessageDialog(null, "Please Select an Event...!","Error",1);
        }else{
            if(JOptionPane.showConfirmDialog(null,"Are You sure want to Remove this...?","Remove",JOptionPane.YES_NO_OPTION)==0){
               try {
                    Statement con = dbConnection2.db().createStatement();
                    con.executeUpdate("DELETE FROM eventdetails WHERE eventID='"+evID+"'");
                    fillMyEventstable();
                    
                } catch (ClassNotFoundException | SQLException | HeadlessException e) {
                    System.out.println(e);
                }
            }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eventsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsTableMouseClicked
        rowSelected = true;
        evID = Integer.parseInt(String.valueOf(eventsTable.getValueAt(eventsTable.getSelectedRow(), 0)));
    }//GEN-LAST:event_eventsTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!rowSelected){
            JOptionPane.showMessageDialog(null, "Please Select an Event...!","Error",1);
        }else{
            String type = String.valueOf(eventsTable.getValueAt(eventsTable.getSelectedRow(), 2));
            HashMap param = new HashMap();
            param.put("evtID",evID);
            //param.put("evtType", type);
            ViewReport vr = new ViewReport("./reports/events2.jasper",param);
            vr.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!rowSelected){
            JOptionPane.showMessageDialog(null, "Please Select an Event...!","Error",1);
        }else{
             if(JOptionPane.showConfirmDialog(null,"Are You sure want to edit this Event...?","Remove",JOptionPane.YES_NO_OPTION)==0){
                 
//                   event_mainWindow mw = new event_mainWindow();
//                   mw.addAllJPane();
//                   mw.showPrevNextBtns();
//                   event_mainWindow.jProgressBar1.setVisible(true);
//                  // mw.hideAll();
//                  // mw.hidePanel(this);
//                   mw.showPanel(mw.event);
                   
//                   this.setVisible(false);
//                   jLayeredPane1.remove(this);
//                   mw.jLayeredPane1.remove(this);
//                   mw.test(evt);
                   eventDetails.editEvent(evID);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void getRealdate(){
          //Get real month/year
		GregorianCalendar cal = new GregorianCalendar(); //Create calendar
		realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
		realMonth = cal.get(GregorianCalendar.MONTH); //Get month
		realYear = cal.get(GregorianCalendar.YEAR); //Get year
		currentMonth = realMonth; //Match month and year
		currentYear = realYear;    
    }
    
    
    private void fillYearCombo(){   
        getRealdate();
        for (int i=realYear-10; i<=realYear+100; i++){
			yearCombo.addItem(String.valueOf(i));
		}
    }
    private void refreshCalendar(int month, int year){
		//Variables
		String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int nod, som; //Number Of Days, Start Of Month
			
		//Allow/disallow buttons
		prevMonth.setEnabled(true);
		nextMonth.setEnabled(true);
		if (month == 0 && year <= realYear-10){prevMonth.setEnabled (false);} //Too early
		if (month == 11 && year >= realYear+100){nextMonth.setEnabled(false);} //Too late
		lblMonth.setText(months[month]); //Refresh the month label (at the top)
		yearCombo.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box
		
		//Clear table
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				calendarTable.setValueAt(null, i, j);
			}
		}
		
		//Get first day of month and number of days
		GregorianCalendar cal = new GregorianCalendar(year, month, 1);
		nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		som = cal.get(GregorianCalendar.DAY_OF_WEEK);
		
		//Draw calendar
		for (int i=1; i<=nod; i++){
			int row = new Integer((i+som-2)/7);
			int column  =  (i+som-2)%7;
			calendarTable.setValueAt(i, row, column);
		}
                
                
		
                
                calendarTable.getParent().setBackground(calendarTable.getBackground()); //Set background

		//No resize/reorder
		calendarTable.getTableHeader().setResizingAllowed(false);
		calendarTable.getTableHeader().setReorderingAllowed(false);

		//Single cell selection
		calendarTable.setColumnSelectionAllowed(true);
		calendarTable.setRowSelectionAllowed(true);
                calendarTable.setCellSelectionEnabled(true);
		calendarTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		//Set row/column count
		calendarTable.setRowHeight(38);
                
                //get eventsDays
                days=getEventDays();
                allEventsDays  = days.split(",");
                
                //Apply renderers
		calendarTable.setDefaultRenderer(calendarTable.getColumnClass(0), new tblCalendarRenderer());
                
                
                
	}
    
    
       private String getEventDays() {
            
                        String eventdays = "";
                        String date="";
                        try {
//                              DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                              java.util.Date StartDate = dateFormat.parse("2016-3-1");
//                              java.util.Date EndDate = dateFormat.parse("2016-3-1");
                              String yr = String.valueOf(yearCombo.getSelectedItem());
                              
                              Statement con = dbConnection2.db().createStatement();
                              java.sql.ResultSet record =  con.executeQuery("SELECT eventStartDate FROM eventdetails "
                                                                           +"WHERE eventStartDate>=' "+yr+"-"+(currentMonth+1)+"-01 ' AND eventStartDate<=' "+yr+"-"+(currentMonth+1)+"-31 ' " );
                              
                              
                              while(record.next()){
                                  date =  record.getString("eventStartDate");
                                  String  fullDate[] = date.split("-");
                                  eventdays += fullDate[2]+",";   //get the days     
                              }
  
                        } catch (ClassNotFoundException | SQLException e) {
                            System.out.println(e);
                       } 
//                            catch (ParseException ex) {
//                            Logger.getLogger(MyEvents.class.getName()).log(Level.SEVERE, null, ex);
//                        }
           return eventdays;
       } 
    
        
        
        static class tblCalendarRenderer extends DefaultTableCellRenderer{
            
		public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
			super.getTableCellRendererComponent(table, value, selected, focused, row, column);
			if (column == 0 || column == 6){ //Week-end
				setBackground(new Color(255, 220, 220));
			}
			else{ //Week
				setBackground(new Color(255, 255, 255));
			}
                        
                        
                        //get events days and highlight them
                        for(int i=0; i<allEventsDays.length ; i++){
                            if(allEventsDays[i].equals(String.valueOf(value))){
                                 setBackground(new Color(220, 220, 0)); 
                            }
                         }      
                              
                        
			if (value != null){
				if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
					setBackground(new Color(220, 220, 255));
                                        setForeground(Color.red);
				}else
                                  setForeground(Color.black);  
                                
			}
			
			return this;  
		}
	}
    
    
     private void fillMyEventstable(){
        int l =0;
        DefaultTableModel table = (DefaultTableModel) eventsTable.getModel();
        table.setRowCount(0);
        
        //setting column width
        TableColumnModel columnModel = eventsTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);
        //load data to table from database
        try {
            Statement con = dbConnection2.db().createStatement();
            java.sql.ResultSet record =  con.executeQuery("SELECT * FROM eventdetails WHERE eventStartDate='"+test.getText()+"' " );
            while(record.next()){
                Vector rc = new Vector();
                rc.add(record.getString("eventID"));
                rc.add(record.getString("eventName"));
                rc.add(record.getString("eventType"));
                rc.add(record.getString("eventStartTime"));
                table.addRow(rc);
                l++;
            }
            for(int i=0;i<l;i++){
                java.sql.ResultSet record2 =  con.executeQuery("SELECT v.venueName FROM venuedetails v , eventvenue e "
                                                               +"WHERE v.venueID=e.venueID AND e.eventID='"+eventsTable.getValueAt(i, 0)+"'");
                while(record2.next()){
                    eventsTable.setValueAt(record2.getString("v.venueName"), i, 4);
                }
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           System.out.println(ex);
        }
 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable calendarTable;
    private javax.swing.JTable eventsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JButton nextMonth;
    private javax.swing.JButton prevMonth;
    private static javax.swing.JLabel test;
    private static javax.swing.JComboBox yearCombo;
    // End of variables declaration//GEN-END:variables
}
