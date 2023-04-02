package com.insurence.insurenceapi.Serviceleyer;

import com.insurence.insurenceapi.DAO.CustomerDAO;
import com.insurence.insurenceapi.DAO.PolicyDao;
import com.insurence.insurenceapi.Entity.CustomerEntity;
import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PolicyService implements PolicyDao {

    public PolicyDao policyDao;


  public CustomerDAO customerDAO;

    @Autowired
    public PolicyService(PolicyDao policyDao, CustomerDAO customerDAO) {
        this.policyDao = policyDao;
        this.customerDAO = customerDAO;
    }

    @Override
    public List<InsurancePolicyEntity> showall() {
        return policyDao.showall();
    }

    @Transactional
    @Override
    public InsurancePolicyEntity findbyid(int id) {
        return policyDao.findbyid(id);
    }

    @Transactional
    @Override
    public InsurancePolicyEntity crate(InsurancePolicyEntity polycy) {
          return policyDao.crate(polycy);
    }

    @Transactional
    @Override
    public void update(InsurancePolicyEntity policy) {
        policyDao.update(policy);
    }


    @Transactional
    @Override
    public void delete(int id) {
        policyDao.delete(id);

    }

    public List<InsurancePolicyEntity> getAll()  {


        List<InsurancePolicyEntity> employees = policyDao.showall();
        List<InsurancePolicyEntity> insurancePolicyEntities = new ArrayList<>();
        for(InsurancePolicyEntity employee : employees) {

            insurancePolicyEntities.add(employee);
        }
        return insurancePolicyEntities;
    }


}
