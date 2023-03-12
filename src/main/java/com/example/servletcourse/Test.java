package com.example.servletcourse;

import com.example.servletcourse.DAO.UserDAO;
import com.example.servletcourse.Model.User;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        ArrayList<User> list = dao.getAllUser();
        for (User u : list) {
            System.out.println(u);
        }

    }
}
