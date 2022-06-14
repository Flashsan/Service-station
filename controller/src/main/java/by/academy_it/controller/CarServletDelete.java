package by.academy_it.controller;

import by.academy_it.service.impl.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "carDelete",
        urlPatterns = {"/deleteCar"}
)
public class CarServletDelete extends HttpServlet {

    public static final String CANCEL = "cancel";
    public static final String LIST_CAR = "/listCar";
    public static final String DELETE_CAR = "deleteCar";
    public static final String DELETE_CAR_JSP = "deleteCar.jsp";
    CarServiceImpl carService = new CarServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(DELETE_CAR_JSP)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter(CANCEL) != null) {
            response.sendRedirect(request.getContextPath() + LIST_CAR);
        } else {
            Integer idCar = Integer.valueOf(request.getParameter(DELETE_CAR));
            carService.deleteCar(idCar);
            response.sendRedirect(request.getContextPath() + LIST_CAR);
        }
    }

}
