package InterfaceAbstractDemo.Abstracts;

import InterfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
