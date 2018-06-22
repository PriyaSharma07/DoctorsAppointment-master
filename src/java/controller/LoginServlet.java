package controller;

import Dao.DaoMVC;
import Model.ModelMVC;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       
       if(email.equals("Admin")||password.equals("Admin"))
       {
       getServletContext().getRequestDispatcher("/adminHome.jsp").forward(request, response);
       }
        else
       {
           ModelMVC m = new ModelMVC();
           m.setEmail(email);
           m.setPassword(password);
           
           String sql="select * from profiles where email=? and password=?";
           HttpSession session = request.getSession();
           ResultSet rs = DaoMVC.loginUser(m,sql);
           try {
               if(rs.next())
               {
                   session.setAttribute("id",rs.getString(1));
                   session.setAttribute("name", rs.getString(2));
                   session.setAttribute("password", rs.getString(3));
                   session.setAttribute("phone", rs.getString(4));
                   session.setAttribute("email", rs.getString(5));
                   session.setAttribute("address", rs.getString(6));
                   session.setAttribute("pin", rs.getString(7));
                   session.setAttribute("country", rs.getString(8));
                   session.setAttribute("gender", rs.getString(9));
                   
                   getServletContext().getRequestDispatcher("/lastpage.jsp").forward(request, response);
                   
               }
               else
               {
                   getServletContext().getRequestDispatcher("/signin.jsp").forward(request, response);
                   
               }
           } catch (SQLException e) {
           e.printStackTrace();
           }
       }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
