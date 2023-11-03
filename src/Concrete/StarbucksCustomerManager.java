package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService _customerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService = customerCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        try{
            if(_customerCheckService.ChechIfRealPerson(customer)){
                super.save(customer);
            }
        }
        catch (Exception e){
            throw new Exception("Not valid person");
        }


    }

}
