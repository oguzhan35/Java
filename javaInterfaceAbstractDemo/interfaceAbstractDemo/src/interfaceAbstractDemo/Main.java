package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrate.NeroCustomerManager;
import interfaceAbstractDemo.Concrate.StarbucksCustomermanager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManager  customerManager = new StarbucksCustomermanager(new MernisServiceAdapter()); 

		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth(LocalDate.of(1111,11,11));
		customer.setFirstName("FIRSTNAME");
		customer.setLastName("LASTNAME");
		customer.setNationalityId("11111111111");
		
		customerManager.save(customer);
		
	}

}
