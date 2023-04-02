package com.insurence.insurenceapi.DAO;

import com.insurence.insurenceapi.Entity.CustomerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOimp implements CustomerDAO{

    @Autowired
    private EntityManager entityManager;

    public CustomerDAOimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<CustomerEntity> showall() {

        TypedQuery<CustomerEntity> typedQuery=entityManager.createQuery("from CustomerEntity",CustomerEntity.class);
        List<CustomerEntity> list=typedQuery.getResultList();
        return list;
    }

    @Override
    public CustomerEntity findbyid(int id) {
        CustomerEntity customer=entityManager.find(CustomerEntity.class,id);
        return customer;
    }

    @Override
    public CustomerEntity newcustomer(CustomerEntity customer) {

        CustomerEntity customer1=entityManager.merge(customer);
        return customer1;
    }

    @Override
    public void delete(int id) {
        CustomerEntity dbcustomer=entityManager.find(CustomerEntity.class,id);

        entityManager.remove(dbcustomer);

    }
}
