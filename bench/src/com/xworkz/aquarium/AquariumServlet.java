package com.xworkz.aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/aquarium", loadOnStartup = 1)
public class AquariumServlet extends GenericServlet {

    public AquariumServlet() {
        System.out.println("Running AquariumServlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Handling Aquarium Form Submission");

        String model = req.getParameter("model");
        String cost = req.getParameter("cost");
        String size = req.getParameter("size");
        String company = req.getParameter("company");
        String capacity = req.getParameter("capacity");

        System.out.println("Model: " + model +
                ", Cost: " + cost +
                ", Size: " + size +
                ", Company: " + company +
                ", Capacity: " + capacity);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2 style='color:blue;'>Aquarium Details Registered Successfully!</h2>");
        writer.println("<p>Model: " + model + "</p>");
        writer.println("<p>Cost: " + cost + "</p>");
        writer.println("<p>Size: " + size + "</p>");
        writer.println("<p>Company: " + company + "</p>");
        writer.println("<p>Capacity: " + capacity + " liters</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}