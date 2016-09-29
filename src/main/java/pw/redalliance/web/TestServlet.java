package pw.redalliance.web;

import pw.redalliance.model.TestModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Lynx on 28.09.2016.
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String color = req.getParameter("color");

        TestModel tModel = new TestModel();
        color = tModel.getColorString(color);
        out.println("You selected: " + color);
    }
}
