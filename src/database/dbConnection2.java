/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhanuka Abeywardhane
 */
public class dbConnection2 {
     public static Connection db() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventplanner", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
}
