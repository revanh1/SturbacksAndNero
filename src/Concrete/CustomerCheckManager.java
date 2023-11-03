package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean ChechIfRealPerson(Customer customer) {
        return true;
    }
}
