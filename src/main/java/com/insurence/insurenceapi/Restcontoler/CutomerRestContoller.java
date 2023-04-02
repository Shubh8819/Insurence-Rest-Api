package com.insurence.insurenceapi.Restcontoler;


import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;
import com.insurence.insurenceapi.Serviceleyer.CustomerServiceimp;
import com.insurence.insurenceapi.Serviceleyer.PolicyService;
import com.insurence.insurenceapi.Entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CutomerRestContoller {


    public PolicyService policyService;


    public CustomerServiceimp customerService;
    @Autowired
    public CutomerRestContoller(PolicyService policyService, CustomerServiceimp customerService) {
        this.policyService = policyService;
        this.customerService = customerService;
    }

    @GetMapping("/customer")
   public List<InsurancePolicyEntity> getAll(){

        return policyService.getAll();

    }

    @GetMapping("/customer/{customerId}")
    public CustomerEntity findbyid(@PathVariable(name ="customerId" ) int id){
        return customerService.findbyid(id);
    }

    @PostMapping("/customer")
    public CustomerEntity create(@RequestBody CustomerEntity customer){
        
        return customerService.newcustomer(customer);
    }

    @PutMapping("/customer")
    public CustomerEntity update(@RequestBody CustomerEntity customer){
        return customerService.newcustomer(customer);
    }

    @DeleteMapping("/customer/{customerId}")
    public void delet(@PathVariable(name = "customerId") int id){

        CustomerEntity customer=customerService.findbyid(id);

        customerService.delete(id);
    }






}
