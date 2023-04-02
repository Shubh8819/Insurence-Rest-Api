package com.insurence.insurenceapi.Restcontoler;

import com.insurence.insurenceapi.DAO.ClaimDAO;
import com.insurence.insurenceapi.Entity.Claim;
import com.insurence.insurenceapi.Serviceleyer.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Claimcontroler {


    public ClaimService claimService;

    @Autowired
    public Claimcontroler(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("/claim")
   public List<Claim> showall(){
        return claimService.showall();

    }

    @GetMapping("/claim/{claimid}")
    public void findbyid(@PathVariable(name = "claimid") int id){
        claimService.findbyid(id);
    }

    @PostMapping("/claim")
    public Claim post(@RequestBody Claim claim){
        Claim claim1=claimService.crate(claim);
        return claim1;
    }

    @PutMapping("/claim/{claimid}")
    public void put(@RequestBody Claim claim){
         claimService.update(claim);
    }

    @DeleteMapping("/claim")
    public void delet( int id){

        claimService.delete(id);
    }



}
