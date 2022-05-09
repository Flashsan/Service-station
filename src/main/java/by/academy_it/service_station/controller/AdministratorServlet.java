package by.academy_it.service_station.controller;

import by.academy_it.service_station.dao.impl.AdministratorDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "administratorServlet", value = "/")
public class AdministratorServlet extends HttpServlet {

//    //    private static final long serialVersionUID = 1 L;
//    private AdministratorDaoImpl administratorDaoImpl;
//
//    public void init() {
//        // administratorDaoImpl = new AdministratorDaoImpl();
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
////        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
////        requestDispatcher.forward(req, resp);
////        PrintWriter out = resp.getWriter();
////        out.println("<html><head><title> First Servlet</title></head>");
////        out.println("<body><h1>This is Servlet</h1>");
////        out.println("</body><html>");
////        out.println("<html><head><title> First Servlet</title></head>");
////        out.println("<body><h1>Hello " + name + "</h1>");
////        out.println("</body><html>");
////        RequestDispatcher requestDispatcher = req
////                .getRequestDispatcher("/index.jsp");
////        requestDispatcher.forward(req, resp);
//        PrintWriter out = resp.getWriter();
//
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        String age = req.getParameter("age");
//
//        String[] nums = req.getParameterValues("nums");
//
//        out.println("<h2>Name: " + name +
//                "; Surname: " + surname +
//                "; Age: " + age + "</h2>");
//
//        out.println("<h2>Numbers: ");
//        for (String n : nums)
//            out.println(n + " ");
//        out.println("</h2>");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
////        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
////        requestDispatcher.forward(req, resp);
////        RequestDispatcher requestDispatcher = req
////                .getRequestDispatcher("/example.jsp");
////        requestDispatcher.forward(req, resp);
//        doGet(req, resp);
//
//    }
//
//    public void destroy() {
//        // administratorDaoImpl = new AdministratorDaoImpl();
//    }

}
