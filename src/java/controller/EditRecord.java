/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ModelMVC;
import Dao.DaoMVC;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 //////


/**
 *
 * @author audvik
 */
@WebServlet(name = "EditRecord", urlPatterns = {"/EditRecord"})
public class EditRecord extends HttpServlet {

   

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("fullname");
         String password = request.getParameter("password");
         String phone = request.getParameter("phonenumber");
         String email = request.getParameter("email");
         String address = request.getParameter("address");
         String pin = request.getParameter("pincode");
         String country = request.getParameter("country");
         String gender = request.getParameter("gender");
         
         ModelMVC m = new ModelMVC();
         m.setName(name);
         m.setPassword(password);
         m.setPhone(phone);
         m.setEmail(email);
         m.setAddress(address);
         m.setPin(pin);
         m.setCountry(country);
         m.setGender(gender);
         
         
         String sql= "insert into profiles(FullName,Password,Phonenumber,Email,Address,Pincode,Country,Gender) values(?,?,?,?,?,?,?,?)";
        
        int i = DaoMVC.registerUser (m,sql);
         
        if(i!=0)
        {
            System.out.println("Value Inserted");
            getServletContext().getRequestDispatcher("/Admin.jsp").forward(request, response);
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

  
    

  

