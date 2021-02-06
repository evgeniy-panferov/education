package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Hello from third Servlet</h1>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Third Servlet Destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Third Servlet init");
    }
}
