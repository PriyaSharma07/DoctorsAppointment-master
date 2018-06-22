
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DatabaseConnection {

    private Connection conn;
    private ResultSet res;
    private Statement stmt;
    ResultSet getResult(String query, Connection conn) {
        this.conn = conn;
        try{
        stmt = conn.createStatement();
        res = stmt.executeQuery(query);

        }
        catch(SQLException e){
        System.out.println("i found error here");
        }
        return res;
}

    Connection setConnection() {
      
    try{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/root","root","root");
    }
    catch(ClassNotFoundException | SQLException e){
    }
    return conn;
}
    
}




