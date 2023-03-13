package com.academy;

import com.academy.service.ModelService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/models")
public class ModelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");

        var modelService = new ModelService();
        modelService.getModels().forEach(model -> {
            writer.println(model.getModel());
            writer.println("<br>");
        });

        writer.println("</body>");
        writer.println("</html>");
    }
}
