
package controller;

import Doctor.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EditDoctor", urlPatterns = {"/EditDoctor"})
public class EditDoctor extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("DoctorName");
         String age = request.getParameter("Age");
         String specialization = request.getParameter("Specialization");
         String phone = request.getParameter("Phone");
         String address = request.getParameter("Address");
         String pincode = request.getParameter("Pincode");
         String email = request.getParameter("Email");
        
        Doctor m = new Doctor();
         
         m.setDoctorName(name);
         m.setAge(age);
         m.setSpecialization(specialization);
         m.setPhone(phone);
         m.setAddress(address);
         m.setPincode(pincode);
         m.setEmail(email);
         
         
         String sql= "insert into Doctor(DoctorName,Age,Specialization,Phone,Address,Pincode,Email) values(?,?,?,?,?,?,?)";
        
        int i = Doctor.registerUser (m,sql);
         
        if(i!=0)
        {
            System.out.println("Value Inserted");
            getServletContext().getRequestDispatcher("/DoctorAdmin.jsp").forward(request, response);
        }
        else
        {
            System.out.println("Value Not Inserted");
        }
            }
    }

