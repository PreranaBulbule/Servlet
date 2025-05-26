package com.xworkz.fish;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fish", loadOnStartup = 1)
public class FishServlet extends GenericServlet {

    public FishServlet() {
        System.out.println("Running FishServlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Handling Fish Form Submission");

        String name = req.getParameter("name");
        String colour = req.getParameter("colour");
        String lifespan = req.getParameter("lifespan");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String size = req.getParameter("size");

        System.out.println("Name: " + name +
                ", Colour: " + colour +
                ", Life Span: " + lifespan +
                ", Cost: " + cost +
                ", Type: " + type +
                ", Size: " + size);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2 style='color:green;'>Fish Details Submitted Successfully!</h2>");
        writer.println("<p>Name: " + name + "</p>");
        writer.println("<p>Colour: " + colour + "</p>");
        writer.println("<p>Life Span: " + lifespan + "</p>");
        writer.println("<p>Cost: " + cost + "</p>");
        writer.println("<p>Type: " + type + "</p>");
        writer.println("<p>Size: " + size + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}