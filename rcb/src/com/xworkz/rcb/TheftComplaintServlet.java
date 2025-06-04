package com.xworkz.rcb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/theft", loadOnStartup = 1)
public class TheftComplaintServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String location = req.getParameter("location");
        String item = req.getParameter("item");
        String lostOn = req.getParameter("lostOn");

        req.setAttribute("name", name);
        req.setAttribute("mobile", mobile);
        req.setAttribute("age", age);
        req.setAttribute("address", address);
        req.setAttribute("location", location);
        req.setAttribute("item", item);
        req.setAttribute("lostOn", lostOn);

        RequestDispatcher dispatcher = req.getRequestDispatcher("theftresult.jsp");
        dispatcher.forward(req, res);
    }
}