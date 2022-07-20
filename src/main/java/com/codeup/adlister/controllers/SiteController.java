package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SiteController")
public class SiteController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.getWriter().append("served at: ").append(req.getContextPath());
        req.getRequestDispatcher("/WEB-INF/login2.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");


        if (username.equals("user3") && password.equals("123")) {
            req.getSession().invalidate(); //destroy session if any

            HttpSession newSession = req.getSession(true);
            newSession.setMaxInactiveInterval(30000);
            resp.sendRedirect("/profile");
        } else {
            //username and pass incorrect path
            resp.sendRedirect("/register");
        }
    }
}