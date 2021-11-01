package servlet;

import customer.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer",urlPatterns = {"/list"})
public class ServletCustomer extends HttpServlet {
    List<Customer> listCustomer = new ArrayList<>();
    public void init() throws ServletException {
        listCustomer.add(new Customer("Mai Văn HOàn", "1983-08-20","Hà Nội", "img//anh1"));
        listCustomer.add(new Customer("Nguyễn Văn Nam", "1983-08-21","Bắc Giang", "img//anh2"));
        listCustomer.add(new Customer("Nguyễn Thái Hòa", "1983-08-22","Nam Định", "img//anh3"));
        listCustomer.add(new Customer("Trần Đăng Khoa", "1983-08-17","Hà Tây", "img//anh4"));
        listCustomer.add(new Customer("Nguyễn Đình Thi", "1983-08-19","Hà Nội", "img//anh5"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",listCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/main/main.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
