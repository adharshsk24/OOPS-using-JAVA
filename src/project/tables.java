/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author adhar
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try{
            con=ConnectionProvider.getCon();
             if (con == null) {
                throw new Exception("Failed to establish a database connection. Check ConnectionProvider configuration.");
             }
            st=con.createStatement();
            st.executeUpdate("CREATE TABLE users(" +
                "name VARCHAR(200), " +
                "email VARCHAR(200), " +
                "password VARCHAR(50), " +
                "securityQuestion VARCHAR(500), " +
                "answer VARCHAR(200), " +
                "address VARCHAR(200), " +
                "status VARCHAR(20))");
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                 if (st != null) 
                     st.close();
                if (con != null) 
                    con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            
            }
        }
    } 
}
