package com.insurence.insurenceapi.DAO;

import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;

import java.util.List;

public interface PolicyDao {

    public List<InsurancePolicyEntity> showall();

    public InsurancePolicyEntity findbyid(int id);

    public InsurancePolicyEntity crate(InsurancePolicyEntity polycy);

    public void update(InsurancePolicyEntity policy);

    public void delete(int id);
}
