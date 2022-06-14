package by.academy_it.controller;

import by.academy_it.service.dto.SparePartDto;
import by.academy_it.service.dto.WorkListDto;
import by.academy_it.service.impl.SparePartServiceImpl;
import by.academy_it.service.impl.WorkListServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "workList",
        urlPatterns = {"/listWorkList"}
)
public class WorkListServlet
        extends HttpServlet {

    public static final String WORK_LIST = "listWorkList";
    public static final String WORK_LIST_JSP = "workList.jsp";
    private final WorkListServiceImpl workListService = new WorkListServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<WorkListDto> listWorkList =
                workListService.showAllWorkLists();
        request.setAttribute(WORK_LIST, listWorkList);
        request.getRequestDispatcher(WORK_LIST_JSP).forward(request, response);
    }

}
