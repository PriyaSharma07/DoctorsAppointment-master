package profiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfilesDAOImpl implements ProfilesDAO{

    @Override
    public void insert(Profiles p) {
    
        
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            String query = "insert into profiles (fullname,password,phonenumber,email,address,pincode,country,gender) values (?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, p.getId());
            ps.setString(2, p.getFullname());
            ps.setString(3, p.getPassword());
            ps.setString(4, p.getPhone());
            ps.setString(5, p.getEmail());
            ps.setString(6, p.getAddress());
            ps.setString(7, p.getpincode());
            ps.setString(8, p.getcountry());
            ps.setString(9, p.getgender());
            ps.execute();
            
        }
        catch(SQLException e)
        {
        }
        
    }

    @Override
    public void update(Profiles p) {
         System.out.println("hello");
         
  Connection conn = loader.Loader.getConnection();
            String query = "update PROFILES SET fullname = '" + p.getFullname() + "' Password = '" + p.getPassword() + "' Phonenumber = '" + p.getPhone() + "' EMAIL = '"+ p.getEmail() +"' ADDRESS = '"+ p.getAddress() +"' Pincode = '" +p.getpincode()+ "' Country = '" + p.getcountry() + "' Gender = '" + p.getgender() + "' where PatientId = " + p.getId();
        
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
        
          String query = "delete from profiles where patientId = ?";
        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
             
             ps.setInt(1, pid);
             
            ps.execute(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
           

    @Override
     public Profiles getProfiles(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profiles> getProfiles() {
        List<Profiles> list = new ArrayList<>();
        
        try
        {
            Connection conn = loader.Loader.getConnection();
            
            System.out.println( conn );
            
            String query = "select * from profiles";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while( rs.next() )
            {
                Profiles p = new Profiles();
                
                p.setId(rs.getInt("PATIENTID"));
                p.setFullname(rs.getString("FULLNAME"));
                 p.setPassword(rs.getString("PASSWORD"));
                p.setPhone(rs.getString("PHONENUMBER"));
                p.setEmail(rs.getString("EMAIL"));
                p.setAddress(rs.getString("ADDRESS"));
                p.setpincode(rs.getString("PINCODE"));
                p.setcountry(rs.getString("COUNTRY"));
                p.setgender(rs.getString("GENDER"));
               
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
