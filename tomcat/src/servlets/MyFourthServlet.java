package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFourthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        String path = "/fifth";
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.include(req,resp);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Hello from Fourth Servlet. I gone back. Thank you include.</h1>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Fourth Servlet Destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Fourth Servlet init");
    }
}
