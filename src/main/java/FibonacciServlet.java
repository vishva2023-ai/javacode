import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FibonacciServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int a = 0, b = 1;

        out.println("<h2>Fibonacci Series</h2>");

        for (int i = 1; i <= 10; i++) {
            out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}