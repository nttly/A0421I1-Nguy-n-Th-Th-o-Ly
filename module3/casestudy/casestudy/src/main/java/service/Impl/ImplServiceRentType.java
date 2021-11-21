package service.Impl;

import bean.RentType;

import java.util.List;

public class ImplServiceRentType<IRepositoryRentType> {
    IRepositoryRentType serviceType = new RepositoryRentTypeImpl();
    @Override
    public List<RentType> rentTypes() {
        return serviceType.rentypes();
    }
}
