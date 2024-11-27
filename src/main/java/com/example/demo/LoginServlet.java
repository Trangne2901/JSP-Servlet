package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServet", value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if ("admin".equals(user) && "admin".equals(pass)) {
            printWriter.println("<h1>Xin chao" + user+"</h1>");
        } else {
            printWriter.println("<h1>Loi dang nhap</h1>");
        }
        printWriter.println("</html>");
    }

}
