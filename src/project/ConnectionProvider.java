/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author adhar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver Loaded.");

            // Step 2: Establish a connection
            String url = "jdbc:mysql://localhost:3306/hotel";
            String user = "root";
            String password = "adhu2409";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error while establishing connection: " + e.getMessage());
        }
        return con;
    }
}

