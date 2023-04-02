package com.insurence.insurenceapi.Serviceleyer;

import com.insurence.insurenceapi.Entity.CustomerEntity;
import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;

import java.util.List;

public interface RestService {

    public List<CustomerEntity> showall();

    public CustomerEntity findbyid(int id);

    public CustomerEntity newcustomer(CustomerEntity customer) ;




    public void delete(int id);

}
