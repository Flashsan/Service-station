package by.academy_it.controller;

import by.academy_it.entity.Car;
import by.academy_it.service.CarService;
import by.academy_it.service.impl.CarServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "car",
        urlPatterns = {"/car"})
public class CarServlet extends HttpServlet {

    private final CarService carService = new CarServiceImpl();

    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
//         request.getServletPath();
        List<Car> listCar = carService.showAllCar();
        request.setAttribute("listCar", listCar);
        request.getRequestDispatcher("web/car.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

    }


}