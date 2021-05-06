package interfaceAbstractDemo.Concrate;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomermanager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomermanager(CustomerCheckService customerCheckService) {
		this.customerCheckService =customerCheckService;
	}
	
	
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			save(customer);
			System.out.println("gercek bir kullan�c� ");
		  
		
		}else {
			System.out.println("gercek bir kullan�c� Degil");
		}
		
	}
	
	
}
