/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHSANDARUWAN
 */
public class Database {
    public Connection getConnection(){
        try {
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/products","root","");
            return con;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            return null;
        }
    }
}
