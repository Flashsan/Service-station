package by.academy_it.controller;

import by.academy_it.service.dto.AdministratorDto;
import by.academy_it.service.dto.ClientDto;
import by.academy_it.service.impl.AdministratorServiceImpl;
import by.academy_it.service.impl.ClientServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "client",
        urlPatterns = {"/listClient"}
)
public class ClientServlet extends HttpServlet {

    public static final String CLIENT = "listClient";
    public static final String CLIENT_JSP = "client.jsp";
    private final ClientServiceImpl clientService = new ClientServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<ClientDto> listClient =
                clientService.showAllClients();
        request.setAttribute(CLIENT, listClient);
        request.getRequestDispatcher(CLIENT_JSP).forward(request, response);
    }

}
