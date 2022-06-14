package by.academy_it.controller;

import by.academy_it.service.dto.CarDto;
import by.academy_it.service.impl.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "carAddEdit",
        urlPatterns = {"/editCar"}
)
public class CarServletEdit extends HttpServlet {

    public static final String CAR_ID = "carId";
    public static final String CAR = "car";
    public static final String CANCEL = "cancel";
    public static final String LIST_CAR = "/listCar";
    public static final String CAR_MODEL = "carModel";
    public static final String CAR_COLOR = "carColor";
    public static final String CAR_NUMBER = "carNumber";
    public static final String EDIT_CAR_JSP = "editCar.jsp";
    CarServiceImpl carService = new CarServiceImpl();
    Integer carId;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        carId = Integer.valueOf(request.getParameter(CAR_ID));
        CarDto carDto = carService.findCarById(carId);
        request.setAttribute(CAR, carDto);
        request.getRequestDispatcher(EDIT_CAR_JSP).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter(CANCEL) != null) {
            request.getRequestDispatcher(LIST_CAR).forward(request, response);
        } else {
            carService.updateInformationAboutCar(
                    carId,
                    request.getParameter(CAR_MODEL),
                    request.getParameter(CAR_COLOR),
                    request.getParameter(CAR_NUMBER));
            response.sendRedirect(request.getContextPath() + LIST_CAR);
        }
    }
}
