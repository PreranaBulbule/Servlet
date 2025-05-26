package com.xworkz.accessories;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/accessories", loadOnStartup = 1)
public class AccessoriesServlet extends GenericServlet {

    public AccessoriesServlet() {
        System.out.println("Running AccessoriesServlet Constructor");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Handling Accessories Form Submission");

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String warranty = req.getParameter("warranty");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        System.out.println("Name: " + name +
                ", Type: " + type +
                ", Warranty: " + warranty +
                ", Price: " + price +
                ", Quantity: " + quantity);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2 style='color:blue;'>Accessories Details Submitted Successfully!</h2>");
        writer.println("<p>Name: " + name + "</p>");
        writer.println("<p>Type: " + type + "</p>");
        writer.println("<p>Warranty: " + warranty + "</p>");
        writer.println("<p>Price: " + price + "</p>");
        writer.println("<p>Quantity: " + quantity + "</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}