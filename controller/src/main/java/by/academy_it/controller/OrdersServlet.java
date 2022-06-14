package by.academy_it.controller;

import by.academy_it.service.dto.MechanicDto;
import by.academy_it.service.dto.OrdersDto;
import by.academy_it.service.impl.MechanicServiceImpl;
import by.academy_it.service.impl.OrdersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "orders",
        urlPatterns = {"/listOrders"}
)
public class OrdersServlet extends HttpServlet {

    public static final String ORDERS = "listOrders";
    public static final String ORDERS_JSP = "orders.jsp";
    private final OrdersServiceImpl ordersService = new OrdersServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<OrdersDto> listOrders =
                ordersService.showAllOrders();
        request.setAttribute(ORDERS, listOrders);
        request.getRequestDispatcher(ORDERS_JSP).forward(request, response);
    }

}
