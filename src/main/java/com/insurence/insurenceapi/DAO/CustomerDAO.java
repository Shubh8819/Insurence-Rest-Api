package com.insurence.insurenceapi.DAO;

import com.insurence.insurenceapi.Entity.CustomerEntity;

import java.util.List;

public interface CustomerDAO {

    public List<CustomerEntity> showall();

    public CustomerEntity findbyid(int id);

    public CustomerEntity newcustomer(CustomerEntity customer) ;




    public void delete(int id);
}
