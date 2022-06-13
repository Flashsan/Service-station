package by.academy_it.controller;

import by.academy_it.service.dto.OrdersDto;
import by.academy_it.service.dto.SparePartDto;
import by.academy_it.service.impl.OrdersServiceImpl;
import by.academy_it.service.impl.SparePartServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "sparePart",
        urlPatterns = {"/listSparePart"}
)
public class SparePartServlet
        extends HttpServlet {

    public static final String SPARE_PART = "listSparePart";
    public static final String SPARE_PART_JSP = "sparePart.jsp";
    private final SparePartServiceImpl sparePartService = new SparePartServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<SparePartDto> listSparePart =
                sparePartService.showAllSpareParts();
        request.setAttribute(SPARE_PART, listSparePart);
        request.getRequestDispatcher(SPARE_PART_JSP).forward(request, response);
    }

}
