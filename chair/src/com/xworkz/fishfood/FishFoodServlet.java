package com.xworkz.fishfood;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fishfood", loadOnStartup = 1)
public class FishFoodServlet extends GenericServlet {

    public FishFoodServlet() {
        System.out.println("Running FishFoodServlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Handling Fish Food Form Submission");

        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String cost = req.getParameter("cost");

        System.out.println("Name: " + name +
                ", Brand: " + brand +
                ", Quantity: " + quantity +
                ", Cost: " + cost);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2 style='color:blue;'>Fish Food Details Submitted Successfully!</h2>");
        writer.println("<p>Name: " + name + "</p>");
        writer.println("<p>Brand: " + brand + "</p>");
        writer.println("<p>Quantity: " + quantity + "</p>");
        writer.println("<p>Cost: " + cost + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}