package com.justcris.NewsExercise;

import javax.enterprise.inject.New;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@WebServlet(name = "ViewNews", value = "/ViewNews")
public class ViewNews extends HttpServlet {

    HashMap<Integer, News> news;
    private int idInc;
    private String secretCode;

    public void init() {
        news = new HashMap<Integer, News>();
        idInc = 0;
        secretCode = "bababoi12";
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (!request.getParameter("secretCode").equals(secretCode)) return;


        news.put(idInc, new News(
                idInc++,
                request.getParameter("title"),
                request.getParameter("description"),
                request.getParameter("date")
        ));

        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                "  border: 1px solid black;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "th, td {\n" +
                "  padding: 15px;\n" +
                "  text-align: left;\n" +
                "}" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <ul>\n" +
                "        ");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID</th>\n" +
                "<th>Title</th>\n" +
                "<th>Description</th>" +
                "<th>Date</th>");
        for (News i : news.values()) {
            out.println("<tr>");
            out.println("<td>" + i.get_id() + "</td>");
            out.println("<td>" + i.get_title() + "</td>");
            out.println("<td>" + i.get_description() + "</td>");
            out.println("<td>" + i.get_date() + "</td>");
            out.println("</tr>");

        }
        out.println("</table>");
        out.println("    </ul>\n" +
                "</body>\n" +
                "</html>");
    }
}
