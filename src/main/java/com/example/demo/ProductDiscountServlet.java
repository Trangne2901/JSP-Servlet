package com.example.demo;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "productDiscountServlet", value = "/productDiscount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("ProductName");
        double price = Double.parseDouble(request.getParameter("Price"));
        double productDiscount = Double.parseDouble(request.getParameter("ProductDiscpunt"));
         double discount = productDiscount * price * 0.01;
         double discoountPrice = price - discount;

//        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<p>Ten san pham: "+name +"<p>" );
        printWriter.println("<p>Gia san pham: "+price +"$<p>" );
        printWriter.println("<p>Ty le chiet khau(Phan tram): "+productDiscount +"%<p>" );
        printWriter.println("<p>Gia cuoi cumg: "+discoountPrice +"$<p>" );


    }
}
