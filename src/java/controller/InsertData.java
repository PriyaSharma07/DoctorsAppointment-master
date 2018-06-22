
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertData extends HttpServlet {

    String id,fullname,password,phone,email,address,pin,country,gender;
    String query;
    Connection conn;
    Statement stmt;
    ResultSet res;
    DatabaseConnection dbconn;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

                     dbconn = new DatabaseConnection();   
  
           id = request.getParameter("id");
           fullname = request.getParameter("fullname");
           password = request.getParameter("password");
           phone = request.getParameter("phone");
           email = request.getParameter("email");
           address = request.getParameter("address");
           pin = request.getParameter("pin");
           country = request.getParameter("country");
           gender = request.getParameter("gender");

                    conn = dbconn.setConnection();
           stmt = conn.createStatement();
           query = "insert into emp value('"+id+"','"+fullname+"','"+password+"','"+phone+"','"+email+"','"+address+"','"+pin+"','"+country+"','"+gender+"')";
          int i= stmt.executeUpdate(query);
            }
        catch(Exception e){
            request.setAttribute("Error", e);
              RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("Error.jsp");
            rd.forward(request,response);
        }
        finally{
            RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("InsertData.jsp");
            rd.forward(request,response);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
