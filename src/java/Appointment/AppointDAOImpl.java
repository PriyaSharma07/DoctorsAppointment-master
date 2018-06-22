package Appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppointDAOImpl implements AppointmentDAO{

    @Override
    public void insert(appoint a) {
        try{
       Connection conn = loader.Loader.getConnection();
            
            String query = "insert into appointment (PatientName,Phone,Email,Special) values (?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, a.getAppointID());
            ps.setString(2, a.getAppointName());
            ps.setString(3, a.getAppointPhone());
            ps.setString(4, a.getAppointEmail());
            ps.setString(5, a.getAppointSpecial());
            
            ps.execute();
             }
    
             catch(SQLException e)
             {
                }
}
    @Override
    public void update(appoint a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int pid) {
                   Connection conn = loader.Loader.getConnection();
        
          String query = "delete from appointment where ID = ?";
        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
             
             ps.setInt(1, pid);
             
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

  
    

    @Override
    public appoint getappoint(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<appoint> getappoint() {
      List<appoint> list = new ArrayList<>();
        System.out.println("helloo");
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            System.out.println( conn );
            System.out.println("hello");
            String query = "select * from APPOINTMENT";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                appoint a = new appoint();
                
                a.setAppointID(rs.getInt("ID"));
                a.setAppointName(rs.getString("PatientName"));
                a.setAppointPhone(rs.getString("Phone"));
                a.setAppointEmail(rs.getString("Email"));
                a.setAppointSpecial(rs.getString("Specialization"));
               
               
               
                list.add(a);
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return list;
    }
        
    }

