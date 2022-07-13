package controllers;

import models.Ad;
import models.Ads;
import models.daos.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class AdsControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ads> adsList = adsDao.all();

        req.setAttribute("ads", adsList);

        RequestDispatcher view = req.getRequestDispatcher("/ads/index.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Ads adsDao = DaoFactory.getAdsDao();

        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));


        Ad ad = new Ad("test", 45);


        adsDao.all();


    }
}
