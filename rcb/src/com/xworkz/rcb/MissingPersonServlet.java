package com.xworkz.rcb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/missing", loadOnStartup = 1)
public class MissingPersonServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String missingName = req.getParameter("missingName");
        String complainteeMobile = req.getParameter("complainteeMobile");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String location = req.getParameter("location");
        String marks = req.getParameter("marks");
        String gender = req.getParameter("gender");
        String lang = req.getParameter("lang");

        req.setAttribute("missingName", missingName);
        req.setAttribute("complainteeMobile", complainteeMobile);
        req.setAttribute("age", age);
        req.setAttribute("address", address);
        req.setAttribute("location", location);
        req.setAttribute("marks", marks);
        req.setAttribute("gender", gender);
        req.setAttribute("lang", lang);

        RequestDispatcher dispatcher = req.getRequestDispatcher("missingpersonresult.jsp");
        dispatcher.forward(req, res);
    }
}