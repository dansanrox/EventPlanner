/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event_UI;
import database.dbConnection2;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
/**
 *
 * @author User
 */
public class ViewReport extends JFrame {
    public ViewReport(String fileName){
        this(fileName,null);
    }
    public ViewReport(String fileName,HashMap parameter){
        super("View Report");
        try{
            Connection con = dbConnection2.db(); 
            JasperPrint print = JasperFillManager.fillReport(fileName,parameter,con);
            JRViewer viewer = new JRViewer(print);
            
            Container cnt = getContentPane();
            cnt.add(viewer);
        }catch(ClassNotFoundException | JRException e){
            e.printStackTrace();
        }
        
        setBounds(10,10,800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
