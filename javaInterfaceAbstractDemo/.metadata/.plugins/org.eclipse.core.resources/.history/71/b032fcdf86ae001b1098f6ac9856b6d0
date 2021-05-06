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
		customer.setDateOfBirth(LocalDate.of(1992,06,30));
		customer.setFirstName("OÐUZHAN");
		customer.setLastName("DEMÝR");
		customer.setNationalityId("53527148038");
		
		customerManager.save(customer);
		
	}

}
