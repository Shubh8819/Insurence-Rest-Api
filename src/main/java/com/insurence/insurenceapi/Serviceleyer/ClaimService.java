package com.insurence.insurenceapi.Serviceleyer;

import com.insurence.insurenceapi.DAO.ClaimDAO;
import com.insurence.insurenceapi.Entity.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClaimService implements ClaimDAO {

    public ClaimDAO claimDAO;
    @Autowired
    public ClaimService(ClaimDAO claimDAO) {
        this.claimDAO = claimDAO;
    }


    @Override
    public List<Claim> showall() {
        return claimDAO.showall();
    }

    @Transactional
    @Override
    public Claim findbyid(int id) {
        return claimDAO.findbyid(id);
    }

    @Transactional
    @Override
    public Claim crate(Claim claim) {
        return claimDAO.crate(claim);
    }

    @Transactional
    @Override
    public void update(Claim claim) {
        claimDAO.update(claim);

    }


    @Transactional
    @Override
    public void delete(int id) {
        claimDAO.delete(id);

    }
}
