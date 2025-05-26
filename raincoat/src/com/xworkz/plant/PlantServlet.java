package com.xworkz.plant;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/plant", loadOnStartup = 1)
public class PlantServlet extends GenericServlet {

    public PlantServlet() {
        System.out.println("Running PlantServlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Handling Plant Form Submission");

        String name = req.getParameter("name");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String soilType = req.getParameter("soilType");

        System.out.println("Name: " + name +
                ", Cost: " + cost +
                ", Type: " + type +
                ", Soil Type: " + soilType);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2 style='color:green;'>Plant Details Submitted Successfully!</h2>");
        writer.println("<p>Name: " + name + "</p>");
        writer.println("<p>Cost: " + cost + "</p>");
        writer.println("<p>Type: " + type + "</p>");
        writer.println("<p>Soil Type: " + soilType + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}