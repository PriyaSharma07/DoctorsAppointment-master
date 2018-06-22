package controller;

import Dao.DaoMVC;
import Model.ModelMVC;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateRecord", urlPatterns = {"/UpdateRecord"})
public class UpdateRecord extends HttpServlet {
     protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    
    int uid = Integer.parseInt(req.getParameter("id"));
          String id = req.getParameter("PatientId");
             String name = req.getParameter("Fullname");
             System.out.println(name);
         String password = req.getParameter("password");
         System.out.println(password);
         String phone = req.getParameter("phonenumber");
         System.out.println(phone);
         String email = req.getParameter("email");
         System.out.println(email);
         String address = req.getParameter("address");
         System.out.println(address);
         String pin = req.getParameter("pincode");
         System.out.println(pin);
         String country = req.getParameter("country");
         System.out.println(country);
         String gender = req.getParameter("gender");
         System.out.println(gender);
         
         
         ModelMVC m = new ModelMVC();
         m.setId(id);
         m.setName(name);
         m.setPassword(password);
         m.setPhone(phone);
         m.setEmail(email);
         m.setAddress(address);
         m.setPin(pin);
         m.setCountry(country);
         m.setGender(gender);
    
        if(name.equals(null)||name==""||password.equals(null)||password==""||phone.equals(null)||phone==""||email.equals(null)||email==""||address.equals(null)||address==""||pin.equals(null)||pin==""||country.equals(null)||country==""||gender.equals(null)||gender=="")
         
       {
         req.setAttribute("msg","All feilds are mendatory");
       getServletContext().getRequestDispatcher("/UpdateData.jsp").forward(req, resp);
       }
       else
       {
               
            String sql = "Update profiles Set fullname=?,password=?,phonenumber=?,email=?,address=?,pincode=?,country=?,gender=? where patientid=?";
            int i =DaoMVC.updateUser(m,sql);
    
               if(i!=0)
                 {
                      req.setAttribute("msg","User Update SuccessFully..!!");
                         getServletContext().getRequestDispatcher("/UpdateData.jsp").forward(req,resp);
                  }
    
                else
                    {
                 req.setAttribute("msg","User Not Update SuccessFully..!!");
                  getServletContext().getRequestDispatcher("/UpdateData.jsp").forward(req,resp);   
                     }
       }
    
  }
    

}
    