package controllers;

import dao.Ads;
import dao.DaoFactory;
import dao.ListAdsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ads", urlPatterns = "/ads")
public class adsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        Ads adsDao = DaoFactory.getAdsDao();
        req.setAttribute("ads",adsDao.all());
req.getRequestDispatcher("ads/index.jsp").forward(req,res);



    }
}
