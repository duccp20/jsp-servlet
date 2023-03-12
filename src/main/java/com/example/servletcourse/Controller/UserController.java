package com.example.servletcourse.Controller;

import com.example.servletcourse.Model.User;
import com.example.servletcourse.DAO.UserDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/load")
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lay data tu db
        UserDAO dao = new UserDAO();
        ArrayList<User> list = dao.getAllUser();
       //luu data vào req obj
        req.setAttribute("listUser", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("show.jsp");
        dispatcher.forward(req, resp);
    }
}
