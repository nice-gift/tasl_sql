package by.it_academy.jd2.task_sql.controller.web.servlets.api;

import by.it_academy.jd2.task_sql.core.dto.Airport;
import by.it_academy.jd2.task_sql.service.api.IAirportService;
import by.it_academy.jd2.task_sql.service.factory.AirportServiceFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@WebServlet(name = "ApiAirportServlet", urlPatterns = "/airport")
public class ApiAirportServlet extends HttpServlet {
    private final IAirportService service = AirportServiceFactory.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        resp.setContentType("text/html; charset=UTF-8");

        List<Airport>data = service.getAll();
        req.setAttribute("data",  data);

        req.getRequestDispatcher("/views/airport.jsp").forward(req, resp);
    }
}
