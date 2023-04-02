package com.insurence.insurenceapi.Serviceleyer;

import com.insurence.insurenceapi.DAO.CustomerDAO;
import com.insurence.insurenceapi.Entity.CustomerEntity;
import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceimp implements RestService {


    private CustomerDAO customerDAO;

   @Autowired
    public CustomerServiceimp(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override

    public List<CustomerEntity> showall() {
        return customerDAO.showall();
    }

    @Transactional
    @Override
    public CustomerEntity findbyid(int id) {
        return customerDAO.findbyid(id);
    }

    @Transactional
    @Override
    public CustomerEntity newcustomer(CustomerEntity customer) {
        return customerDAO.newcustomer(customer);
    }

    @Transactional
    @Override
    public void delete(int id) {
        customerDAO.delete(id);

    }
}
