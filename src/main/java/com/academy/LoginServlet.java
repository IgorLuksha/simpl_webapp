package com.academy;

import com.academy.model.entity.User;
import com.academy.service.LoginService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");

        LoginService loginService = new LoginService();

        if (loginService.checkCredentials(login, password)){
            writer.println("Hello " + login + " !");
            HttpSession session = req.getSession();
            User user= new User(login, password);
            session.setAttribute("user", user);
        } else {
            writer.println("Access denied");
        }

        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String body = req.getReader().lines().collect(Collectors.joining());
        String[] parameters = body.split("&");


        String login = parameters[0].substring(parameters[0].indexOf("=")+1);
        String password = parameters[1].substring(parameters[1].indexOf("=")+1);

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");


        if ("qwerty".equalsIgnoreCase(login) && "12345".equalsIgnoreCase(password)){
            writer.println("Hello " + login + " !");
        } else {
            writer.println("Access denied");
        }

        writer.println("</body>");
        writer.println("</html>");
    }
}
