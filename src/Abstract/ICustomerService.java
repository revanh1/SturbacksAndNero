package Abstract;

import Entities.Customer;

public interface ICustomerService extends IEntity{
    public void save(Customer customer) throws Exception;
}
