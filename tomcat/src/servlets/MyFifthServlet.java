package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFifthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        ServletConfig servletConfig = getServletConfig();
        String message = servletConfig.getInitParameter("message");

        ServletContext servletContext = getServletContext();
        String appScope = (String) servletContext.getAttribute("app");

        HttpSession httpSession = req.getSession();
        String sessionScope = (String) httpSession.getAttribute("session");

        String requestScope = (String) req.getAttribute("request");

        writer.println("<html>");
        writer.println("<h1>Hello from Fifth Servlet</h1>");
        writer.println("<h3>" +appScope + "</h3>");
        writer.println("<h3>" +sessionScope + "</h3>");
        writer.println("<h3>" +requestScope + "</h3>");
        writer.println("<h1>" + message + "</h1>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Fifth Servlet Destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Fifth Servlet init");
    }
}

