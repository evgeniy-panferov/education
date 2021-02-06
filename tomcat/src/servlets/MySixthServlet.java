package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MySixthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("app","app scope");

        HttpSession session = req.getSession();
        session.setAttribute("session", "session scope");

        req.setAttribute("request","request scope");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("fifth");
        requestDispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Sixth servlet destroy");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Sixth servlet initialize");
    }
}
