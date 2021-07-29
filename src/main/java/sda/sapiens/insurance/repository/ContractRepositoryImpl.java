package sda.sapiens.insurance.repository;

import sda.sapiens.insurance.model.Contract;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class ContractRepositoryImpl implements ContractRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ContractRepositoryImpl() {
    }

    @Override
    @Transactional
    public void save(Contract contract) {
        entityManager.persist(contract);
    }

    @Override
    public List<Contract> findAll() {
        return entityManager
                .createQuery("FROM Contract", Contract.class)
                .getResultList();
    }
}
