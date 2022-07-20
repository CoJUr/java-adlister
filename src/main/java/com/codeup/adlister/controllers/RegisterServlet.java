package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // TODO: show the registration form
        try{
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (username == null || email == null || password == null){
            response.sendRedirect("/register");
            return;
        }

        if (Objects.equals(username, "") || Objects.equals(email, "") || Objects.equals(password, "")){
            response.sendRedirect("/register");
            return;
        }




        // TODO: create a new user based off of the submitted information
        DaoFactory.getUsersDao().insert(new User(username, email, password));

        // TODO: if a user was successfully created, send them to their profile
        response.sendRedirect("/login");
    }
}
