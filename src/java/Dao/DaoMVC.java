
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.ModelMVC;
import java.sql.ResultSet;

public class DaoMVC 
{

        private static Connection connect() 
        {
        Connection con=null;
        
                try
        {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/Root", "root", "root");
             System.out.println("DB Connected");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
              
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
                return con;
        }
        public static int registerUser(ModelMVC m, String sql)
    {
        int i=0;
        Connection con=connect();
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, m.getName());
                ps.setString(2, m.getPassword());
                ps.setString(3, m.getPhone());
                ps.setString(4, m.getEmail());
                ps.setString(5, m.getAddress());
                ps.setString(6, m.getPin());
                ps.setString(7, m.getCountry());
                ps.setString(8, m.getGender());
                
                i= ps.executeUpdate();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return i;
    }

    public static ResultSet loginUser(ModelMVC m, String sql) {
        
        ResultSet rs=null;
        Connection con=connect();
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,m.getEmail());
                ps.setString(2, m.getPassword());
                
                rs = ps.executeQuery();
                
            } catch (SQLException e) {
               e.printStackTrace();
            }
        
    return rs;    
    }

    public static int updateUser(ModelMVC m, String sql) {
        int i=0;
        Connection con=connect();
            try {
                PreparedStatement ps= con.prepareStatement(sql);
                 ps.setString(1, m.getName());
                ps.setString(2, m.getPassword());
                ps.setString(3, m.getPhone());
                ps.setString(4, m.getEmail());
                ps.setString(5, m.getAddress());
                ps.setString(6, m.getPin());
                ps.setString(7, m.getCountry());
                ps.setString(8, m.getGender());
                
                i = ps.executeUpdate();
            } 
            
            catch (SQLException e) {
               e.printStackTrace();
                       }
        
        return 0;
    }


}
