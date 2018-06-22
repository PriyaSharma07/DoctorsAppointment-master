package controller;

import Appointment.appointment;
import Appointment.appoint;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FixAppoint", urlPatterns = {"/FixAppoint"})
public class FixAppoint extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String name = request.getParameter("name");
         String phone = request.getParameter("phone");
         String email = request.getParameter("email");
         String special = request.getParameter("special");
         
    appoint a = new appoint();
        
         a.setAppointName(name);
         a.setAppointPhone(phone);
         a.setAppointEmail(email);
         a.setAppointSpecial(special);
         
         String sql= "insert into appointment(PatientName,Phone,Email,Specialization) values(?,?,?,?)";
        
         int i = appointment.registerUser (a,sql);
         
        if(i!=0)
        {
            System.out.println("Value Inserted");
            request.setAttribute("msg", "Your Appointment has been fixed..!!   Thank You..!!");
            getServletContext().getRequestDispatcher("/lastpage.jsp").forward(request, response);
        }
        else
        {
            System.out.println("Value Not Inserted");
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

