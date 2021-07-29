package sda.sapiens.insurance.service;

import sda.sapiens.insurance.model.Contract;
import sda.sapiens.insurance.repository.ContractRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ContractServiceImpl implements ContractService {

    private ContractRepository repository;

    @Inject
    public ContractServiceImpl(ContractRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerContract(Contract contract) {
        repository.save(contract);
    }

    @Override
    public List<Contract> showAll() {
        return repository.findAll();
    }
}
