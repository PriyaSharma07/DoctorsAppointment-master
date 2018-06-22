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
@WebServlet(name = "RegisterServlets", urlPatterns = {"/RegisterServlets"})
public class RegisterServlets extends HttpServlet {

   

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("name");
         String password = request.getParameter("password");
         String phone = request.getParameter("phone");
         String email = request.getParameter("email");
         String address = request.getParameter("address");
         String pin = request.getParameter("pin");
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
         
         
         String sql= "insert into profiles(FullName,Password,PhoneNumber,Email,Address,Pincode,Country,Gender) values(?,?,?,?,?,?,?,?)";
        
        int i = DaoMVC.registerUser (m,sql);
         
        if(i!=0)
        {
            System.out.println("Value Inserted");
            request.setAttribute("msg", "Registration Successfully..!!  Login Here");
            getServletContext().getRequestDispatcher("/signin.jsp").forward(request, response);
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

  
    

  

