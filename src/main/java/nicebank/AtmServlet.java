package nicebank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anna on 2017-10-12.
 */
public class AtmServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html><head><title>Nice Bank</title></head>"
                + "<body><form action=\"/withdraw\" method=\"post\">" + "<label for=\"amount\">Amount</label>"
                        + "<input type=\"text\" id=\"amount\" name=\"amount\">" + "<button type=\"submit\" id=\"withdraw\">Withdraw</button>"
                        + "</form></body></html>");
    }
}
