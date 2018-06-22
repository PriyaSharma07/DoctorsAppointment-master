
package Appointment;

import Appointment.appoint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class appointment 
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
        public static int registerUser(appoint m, String sql)
    {
        int i=0;
        Connection con=connect();
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, m.getAppointName());
                ps.setString(2, m.getAppointPhone());
                ps.setString(3, m.getAppointEmail());
                ps.setString(4, m.getAppointSpecial());
                
                i= ps.executeUpdate();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return i;
    }

        public static ResultSet loginUser(appoint m, String sql) {
        
        ResultSet rs=null;
        Connection con=connect();
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,m.getAppointName());
                ps.setString(2, m.getAppointPhone());
                ps.setString(3, m.getAppointEmail());
                
                rs = ps.executeQuery();
                
            } catch (SQLException e) {
               e.printStackTrace();
            }
        
    return rs;    
    }

    
}
