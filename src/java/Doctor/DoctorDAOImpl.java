package Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO{

    @Override
    public void insert(Doctor p) {
        
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "insert into Doctor (DoctorName,Age,Specialization,Phone,Address,Pincode,Email) values (?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(2, p.getDoctorName());
            ps.setString(3, p.getAge());
            ps.setString(4, p.getSpecialization());
            ps.setString(5, p.getPhone());
            ps.setString(6, p.getAddress());
            ps.setString(7, p.getPincode());
            ps.setString(8, p.getEmail());
            ps.execute();
            
        }
        catch(SQLException e)
        {
        }
        
    }

    @Override
    public void update(Doctor p) {
         System.out.println("hello");
         
  Connection conn = loader.Loader.getConnection();
            String query = "";
        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
            //Statement stmt = LoadApp.conn.createStatement();
            
            ps.execute(); 
            
            //stmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
        @Override
    public void delete(int pid)
        {
        Connection conn = loader.Loader.getConnection();
        
          String query = "";
        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
             
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
           

    @Override
     public Doctor getDoctor(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> getDoctor() {
        List<Doctor> list = new ArrayList<>();
        
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            System.out.println( conn );
            
            String query = "select * from Doctor";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                Doctor p = new Doctor();
                
                p.setDoctorid(rs.getInt("Doctorid"));
                p.setDoctorName(rs.getString("DoctorName"));
                 p.setAge(rs.getString("Age"));
                p.setSpecialization(rs.getString("Specialization"));
                p.setPhone(rs.getString("Phone"));
                p.setAddress(rs.getString("ADDRESS"));
                p.setPincode(rs.getString("Pincode"));
                p.setEmail(rs.getString("Email"));
               
                list.add(p);
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        
        return list;
    }
    
}
