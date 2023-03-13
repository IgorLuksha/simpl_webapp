package com.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/loginForm")
public class LoginFormServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);

        /* PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<form action=\"login\">");
        writer.println("<input name=\"login\" type=\"text\"><br>");
        writer.println("<input name=\"password\" type=\"text\"><br>>");
        writer.println("<input type=\"submit\"/>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");*/
    }
}
