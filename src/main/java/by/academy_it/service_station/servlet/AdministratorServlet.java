package by.academy_it.service_station.servlet;

import by.academy_it.service_station.dao.impl.AdministratorDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "administratorServlet", value = "/")
public class AdministratorServlet extends HttpServlet {

    //    private static final long serialVersionUID = 1 L;
    private AdministratorDaoImpl administratorDaoImpl;

    public void init() {
        // administratorDaoImpl = new AdministratorDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
//        requestDispatcher.forward(req, resp);
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title> First Servlet</title></head>");
        out.println("<body><h1>This is Servlet</h1>");
        out.println("</body><html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
//        requestDispatcher.forward(req, resp);
    }

    public void destroy() {
        // administratorDaoImpl = new AdministratorDaoImpl();
    }

}
