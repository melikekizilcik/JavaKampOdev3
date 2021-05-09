package InterfaceAbstractDemo;

import java.time.LocalDate;

import InterfaceAbstractDemo.Abstracts.BaseCustomerManager;
import InterfaceAbstractDemo.Adapter.MernisServiceAdapter;
import InterfaceAbstractDemo.Concrete.NeroCustomerManager;
import InterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;

public class Main {


	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"Melike","Kýzýlcýk", LocalDate.of(2000, 7, 29), "11111111");
		customerManager.save(customer);
		
		
	}

}
