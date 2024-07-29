package com.servletClasses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//@WebServlet("/JSTLdemo")
public class JSTLdemo extends HttpServlet {

    // JSTL ->  JSP Standard Tag Library
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//        String name = "tuhin";
//        int roll = 61;
//
//        Students st = new Students(name,roll);

        List<Students> studs = Arrays.asList(new Students("tuhin",61),new Students("swarnanko",56),new Students("ishita",23));

        req.setAttribute("student",studs);
        RequestDispatcher rd = req.getRequestDispatcher("Newdisplay.jsp");
        rd.forward(req,res);

    }
}
