package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "translateServlet", value = "/translate")
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Thom", "Ngu");
        dictionary.put("ChiAnh", "Học không giỏi");
        dictionary.put("Khanh", "ăn cứt");
        String search = request.getParameter("search");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        String result = dictionary.get(search);
        if(result != null){
            printWriter.println( search);
            printWriter.println( result);
        } else {
            printWriter.println("Not found");
        }
        printWriter.println("</html>");
    }

}

