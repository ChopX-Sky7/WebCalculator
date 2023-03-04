package com.example.webcalculator;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "calc", value = "/calculator")
public class CalculatorServlet extends HttpServlet {


    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

     public void doPost(HttpServletRequest req, HttpServletResponse res) throws  IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        float a = Float.parseFloat(req.getParameter("NumberOne"));
        float b = Float.parseFloat(req.getParameter("NumberTwo"));
        String operation = req.getParameter("operation");
        float result = 0;

         switch (operation){
             case "+":
                 result = a + b;
                 break;
             case "-":
                 result = a - b;
                 break;
             case "/":
                 if (b == 0){
                     pw.println("<script>alert(\"На ноль делить нельзя!\");</script>");
                     break;
                 }
                 result = a/b;
                 break;
             case "*":
                 result = a * b;
                 break;
             default:
                 pw.println("<script>alert(\"Ой! Где-то ошибка. Попробуйте снова!\");</script>");
         }

         try {
             pw.println("<h4>Первое число: : </h4>"+"<h3>"+ a +"</h3>");
             pw.println("<h4>Второе число: </h4>"+"<h3>"+ b +"</h3>");
             pw.println("<h4>Действие: </h4>" + "<h3>"+ operation +"</h3>");
             pw.println("<hr><h4>Результат: </h4>" + "<h3>"+ result +"</h3>");
         } finally {
             pw.close();
         }

     }

    public void destroy() {
    }
}