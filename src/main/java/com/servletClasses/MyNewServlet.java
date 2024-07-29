package com.servletClasses;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyNewServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {

        // Servlet context and servlet config

        // Servlet context
        PrintWriter out = res.getWriter();
        out.println("hi ");
        ServletContext ctx = req.getServletContext();
        String Myname = ctx.getInitParameter("phone");
        out.println(Myname + " ");

        // Servlet config using init param
        ServletConfig cg = getServletConfig();
        String newName = cg.getInitParameter("name");
        out.println(newName);
    }
}
