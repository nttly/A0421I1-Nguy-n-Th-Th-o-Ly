package grandemonstration.servlet;

import grandemonstration.model.Customer;
import grandemonstration.service.CustomerService;
import grandemonstration.service.CustomerServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = CustomerServiceFactory.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = new Customer();
        customer.setName(req.getParameter("name"));
        customer.setEmail(req.getParameter("email"));
        customer.setAddress(req.getParameter("address"));

        Long id = Long.valueOf(req.getParameter("id"));
        customer.setId(id);
        customerService.save(customer);

        resp.sendRedirect("/customers/list.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
