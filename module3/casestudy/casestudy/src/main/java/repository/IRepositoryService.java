package repository;
import bean.Service;
import java.util.List;
public interface IRepositoryService {
    List<Service> services();
    void addNewCustomer(Service service);

}
