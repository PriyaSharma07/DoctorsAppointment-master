package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import profiles.ProfilesDAOImpl;

@WebServlet(name="DeleteRecord",urlPatterns = {"/DeleteRecord"})
public class DeleteRecord extends HttpServlet{
    
   ProfilesDAOImpl pdao = new ProfilesDAOImpl();
    
    
       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("hello");    
        
        
        response.sendRedirect("Admin.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt( req.getParameter("id") );
        System.out.println("ID: " + id);
        pdao.delete(id);
        processRequest(req, resp);
    }
       
       
}
