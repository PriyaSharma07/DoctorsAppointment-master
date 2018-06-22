package controller;

import Appointment.AppointDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteAppointment", urlPatterns = {"/DeleteAppointment"})
public class DeleteAppointment extends HttpServlet {

     AppointDAOImpl adao = new AppointDAOImpl();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
       
        response.sendRedirect("lastpage.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt( req.getParameter("id") );
        System.out.println("ID: " + id);
        adao.delete(id);
        processRequest(req, resp);
    }
       
       
}

         
    
    
  
