/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
 
public class MySQLCon {
    public PreparedStatement connect(String query){
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MySQLCon.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/apotek","root","");
            PreparedStatement stm = con.prepareStatement(query);
           return stm;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
