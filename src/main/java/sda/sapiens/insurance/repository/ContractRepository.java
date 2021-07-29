package sda.sapiens.insurance.repository;

import sda.sapiens.insurance.model.Contract;

import java.util.List;

public interface ContractRepository {
    void save(Contract contract);
    List<Contract> findAll();
}
