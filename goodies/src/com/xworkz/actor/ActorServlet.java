package com.xworkz.actor;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/goodies",loadOnStartup =1)
public class ActorServlet extends GenericServlet {

    public ActorServlet()
    {
        System.out.println("Running Actor Servlet Constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Servlet Request and Response");
        String name= servletRequest.getParameter("Name");
        String language=servletRequest.getParameter("language");
        String salary=servletRequest.getParameter("Salary");
        String BlockBusters=servletRequest.getParameter("BlockBusters");
        String Flops=servletRequest.getParameter("Flops");
        String Upcoming_Movie=servletRequest.getParameter("UpcomingMovie");
        String Upcoming_Movie_Producer=servletRequest.getParameter("UpcomingMovieProducer");
        String Upcoming_Movie_Director=servletRequest.getParameter("UpcomingMovieDirector");
        String Upcoming_Movie_Budget=servletRequest.getParameter("UpcomingMovieBudget");
        System.out.println("Actor Name: "+name+" ,Language: "+language+" ,Actor Name: "+salary+" ,Block Busters: "+BlockBusters+", Flops: "+Flops+" ,Upcoming Movie: "+Upcoming_Movie+", Upcoming Movie Producer: "+Upcoming_Movie_Producer+", Upcoming Movie Director: "+Upcoming_Movie_Director+", Upcoming Movie Budget: "+Upcoming_Movie_Budget);
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 style='color:red;'>");

        writer.println(name+" ,Actor Details Registered");
        writer.println("</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
