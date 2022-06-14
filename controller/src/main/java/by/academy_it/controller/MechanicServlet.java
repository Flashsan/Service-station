package by.academy_it.controller;

import by.academy_it.service.dto.AdministratorDto;
import by.academy_it.service.dto.MechanicDto;
import by.academy_it.service.impl.AdministratorServiceImpl;
import by.academy_it.service.impl.MechanicServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "mechanic",
        urlPatterns = {"/listMechanic"}
)
public class MechanicServlet extends HttpServlet {

    public static final String MECHANIC = "listMechanic";
    public static final String MECHANIC_JSP = "mechanic.jsp";
    private final MechanicServiceImpl mechanicService = new MechanicServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<MechanicDto> listMechanic =
                mechanicService.showAllMechanics();
        request.setAttribute(MECHANIC, listMechanic);
        request.getRequestDispatcher(MECHANIC_JSP).forward(request, response);
    }

}
