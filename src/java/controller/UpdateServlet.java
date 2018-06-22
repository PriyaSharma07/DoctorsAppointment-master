package controller;

import Dao.DaoMVC;
import Model.ModelMVC;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
       int uid = Integer.parseInt(req.getParameter("id"));
          String id = req.getParameter("PatientId");
             String fullname = req.getParameter("Fullname");
             System.out.println(fullname);
         String password = req.getParameter("password");
         System.out.println(password);
         String phonenumber = req.getParameter("phonenumber");
         System.out.println(phonenumber);
         String email = req.getParameter("email");
         System.out.println(email);
         String address = req.getParameter("address");
         System.out.println(address);
         String pincode = req.getParameter("pincode");
         System.out.println(pincode);
         String country = req.getParameter("country");
         System.out.println(country);
         String gender = req.getParameter("gender");
         System.out.println(gender);
         
         
         ModelMVC m = new ModelMVC();
         m.setId(id);
         m.setName(fullname);
         m.setPassword(password);
         m.setPhone(phonenumber);
         m.setEmail(email);
         m.setAddress(address);
         m.setPin(pincode);
         m.setCountry(country);
         m.setGender(gender);
    
        if(fullname.equals(null)||fullname==""||password.equals(null)||password==""||phonenumber.equals(null)||phonenumber==""||email.equals(null)||email==""||address.equals(null)||address==""||pincode.equals(null)||pincode==""||country.equals(null)||country==""||gender.equals(null)||gender=="")
         
       {
         req.setAttribute("msg","All feilds are mendatory");
       getServletContext().getRequestDispatcher("/UpdateProfile.jsp").forward(req, resp);
       }
       else
       {
               
            String sql = "Update profiles Set fullname=?,password=?,phonenumber=?,email=?,address=?,pincode=?,country=?,gender=? where patientid=?";
            int i =DaoMVC.updateUser(m,sql);
    
               if(i!=0)
                 {
                      req.setAttribute("msg","User Update SuccessFully..!!");
                         getServletContext().getRequestDispatcher("/UpdateProfile.jsp").forward(req,resp);
                  }
    
                else
                    {
                 req.setAttribute("msg","User Not Update SuccessFully..!!");
                  getServletContext().getRequestDispatcher("/UpdateProfile.jsp").forward(req,resp);   
                     }
       }
    
  }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}