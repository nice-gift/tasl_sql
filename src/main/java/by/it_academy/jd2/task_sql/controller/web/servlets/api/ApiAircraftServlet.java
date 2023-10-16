package by.it_academy.jd2.task_sql.controller.web.servlets.api;

import by.it_academy.jd2.task_sql.core.dto.Aircraft;
import by.it_academy.jd2.task_sql.service.api.IAircraftService;
import by.it_academy.jd2.task_sql.service.factory.AircraftServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(name = "ApiAircraftServlet", urlPatterns = "/aircrafts")
public class ApiAircraftServlet extends HttpServlet {
    private final IAircraftService service = AircraftServiceFactory.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        resp.setContentType("text/html; charset=UTF-8");

        List<Aircraft>data = service.getAll();
        req.setAttribute("data",  data);

        req.getRequestDispatcher("/views/aircraft.jsp").forward(req, resp);
    }
}
