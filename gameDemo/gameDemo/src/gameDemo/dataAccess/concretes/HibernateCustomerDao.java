package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.CustomerDao;
import gameDemo.entities.concretes.Customer;

public class HibernateCustomerDao  implements CustomerDao {

	@Override
	public void save(Customer customer) {

		System.out.println("HPKullan�c� Kimligi Dogruland�"+customer.getFirstName());
		
	}

}
