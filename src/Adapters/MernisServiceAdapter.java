package Adapters;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean ChechIfRealPerson(Customer customer) {
        return true;
    }
}
