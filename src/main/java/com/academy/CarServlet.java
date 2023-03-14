package com.academy;

import com.academy.service.CarService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/cars")
public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");

        CarService carService = new CarService();
        carService.getCars().forEach(car -> {
            writer.println(car.getBrand() + " " + car.getYear());
            writer.println("<br>");
        });

        writer.println("</body>");
        writer.println("</html>");*/

        var carService = new CarService();

        var cars = carService.getCars();

        req.setAttribute("cars", cars);

        req.getRequestDispatcher("/WEB-INF/jsp/car.jsp").forward(req, resp);
    }
}
