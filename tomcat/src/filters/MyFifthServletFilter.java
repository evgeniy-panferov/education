package filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFifthServletFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Hi from First Servlet Filter");
        CharResponseWrapper wrapper = new CharResponseWrapper((HttpServletResponse) servletResponse);

        filterChain.doFilter(servletRequest, wrapper);

        PrintWriter writer = servletResponse.getWriter();
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        String originalContent = wrapper.toString();
        charArrayWriter.write(originalContent);

        String addTextIntoResponse = "Modify";
        charArrayWriter.write(addTextIntoResponse);
        String sumContent = charArrayWriter.toString();
        writer.write(sumContent);
    }
}
