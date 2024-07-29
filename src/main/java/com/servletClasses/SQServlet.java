package com.servletClasses;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SQServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        // Was created using RequestDispatcher

//        int atribute = Integer.parseInt(req.getParameter("k"));

        // Using Session Manager
//        HttpSession session = req.getSession();

//        session.removeAttribute("k");
        // The above is used for deleting session

//        int new_attribute = (int)session.getAttribute("k");

        // Using Cookies
        Cookie[] cookies = req.getCookies();

        int cookie_attr = 0;

        for(Cookie c : cookies){
            if(c.getName().equals("k")){
                cookie_attr = Integer.parseInt(c.getValue());
            }
        }


        PrintWriter out = res.getWriter();
        out.println("Result is " + cookie_attr);

        System.out.println("hello from sq the val is " + cookie_attr);
    }
}
