package by.academy_it.controller;

import by.academy_it.service.dto.AdministratorDto;
import by.academy_it.service.impl.AdministratorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "administrator",
        urlPatterns = {"/listAdministrator"}
)
public class AdministratorServlet extends HttpServlet {

    public static final String ADMINISTRATOR = "listAdministrator";
    public static final String ADMINISTRATOR_JSP = "administrator.jsp";
    private final AdministratorServiceImpl administratorService = new AdministratorServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<AdministratorDto> listAdministrator =
                administratorService.showAllAdministrators();
        request.setAttribute(ADMINISTRATOR, listAdministrator);
        request.getRequestDispatcher(ADMINISTRATOR_JSP).forward(request, response);
    }

}
