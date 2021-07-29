package sda.sapiens.insurance.service;

import sda.sapiens.insurance.model.Contract;

import java.util.List;

public interface ContractService {
    void registerContract(Contract contract);
    List<Contract> showAll();
}
