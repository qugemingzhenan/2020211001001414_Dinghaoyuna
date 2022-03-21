package com.Dinghaoyuan.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConfigDemoServlet", value = "/ConfigDemoServlet",
    initParams = {
            @WebInitParam(name = "name",value = "Dinghaoyuan"),
            @WebInitParam(name = "studentid",value = "2020211001001414")
    }
)
public class ConfigDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
        String studentid = config.getInitParameter("studentid");

        PrintWriter writer = response.getWriter();
        writer.println("name:"+name);
        writer.println("studentid:"+studentid);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
