package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCalculator",urlPatterns = {"/tinh"})
public class ServletCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String f=request.getParameter("first");
        String s=request.getParameter("second");

        float first = Float.parseFloat(request.getParameter("first"));
        float second =Float.parseFloat(request.getParameter("second"));
        String operator = request.getParameter("ope");
        double result=0;
        if (operator.equals("+")){
            result=first+second;
        }
        else if (operator.equals("-")){
            result=first-second;
        }else if (operator.equals("*")){
            result=first*second;
        }
        else {
            result=first/second;
        }

        request.setAttribute("r",result);
        request.setAttribute("first",f);
        request.setAttribute("second",s);

        request.getRequestDispatcher("index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
