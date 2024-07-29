package com.servletClasses;

//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name="Multiply", urlPatterns={"/mul"}) this is not supported maybes
public class MulNumServletAnnotation extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int num3 = num1 * num2;

        PrintWriter out = res.getWriter();
        out.println("Result is " + num3);

    }
}
