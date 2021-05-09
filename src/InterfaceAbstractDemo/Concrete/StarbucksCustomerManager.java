package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.Abstracts.CustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void save(Customer customer){
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	



}
