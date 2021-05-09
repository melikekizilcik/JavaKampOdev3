package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstracts.CustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;
;

public class CustomerCheckManager implements CustomerCheckService{
	
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

	

}
