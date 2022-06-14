package by.academy_it.controller;

import by.academy_it.service.impl.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "carAddEdit",
        urlPatterns = {"/addCar"}
)
public class CarServletAdd extends HttpServlet {
    public static final String ADD_CAR_JSP = "addCar.jsp";
    public static final String LIST_CAR = "/listCar";
    public static final String CAR_MODEL = "carModel";
    public static final String CAR_COLOR = "carColor";
    public static final String CAR_NUMBER = "carNumber";
    public static final String CANCEL = "cancel";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(ADD_CAR_JSP)
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CarServiceImpl carService = new CarServiceImpl();
        if (request.getParameter(CANCEL) != null) {
            response.sendRedirect(request.getContextPath() + LIST_CAR);
        } else {
            String carModel = request.getParameter(CAR_MODEL);
            String carColor = request.getParameter(CAR_COLOR);
            String carNumber = request.getParameter(CAR_NUMBER);
            carService.createCar(carModel, carColor, carNumber);
            response.sendRedirect(request.getContextPath() + LIST_CAR);
        }
    }
}
