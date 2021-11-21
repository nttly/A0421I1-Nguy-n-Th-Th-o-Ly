package service.Impl;

import bean.ContractDetail;
import service.IServiceContractDetail;

import java.util.List;

public class ImplServiceContracDetail implements IServiceContractDetail {
    private IRepositoryContractDetail contractDetail1 = new RepositoryContractDetailImpl();
    @Override
    public List<ContractDetail> contractDetails() {
        return contractDetail1.contractDetails();
    }

    @Override
    public void createContract(ContractDetail contractDetail) {
        contractDetail1.createContract(contractDetail);
    }
}
