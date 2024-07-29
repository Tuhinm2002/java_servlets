package com.servletClasses;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddNumServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int num3 = num1 + num2;

//        PrintWriter out = res.getWriter();

        int k = num3 * num3;

//        req.setAttribute("k",k);

        // Servlet from a servlet
        // But user will not get information about page change
        // to show the change we need to use sendRedirect
        // There is another concept of session manager

//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req,res);

//        HttpSession session = req.getSession();
//        session.setAttribute("k",k);

        // This method is called URL rewriting
        // Another method is cookies (Session Management)
//        res.sendRedirect("sq?k="+k);

        // Using cookies
        Cookie cookie = new Cookie("k",k+"");
        res.addCookie(cookie);
        res.sendRedirect("sq"); //This line is important
    }
}
