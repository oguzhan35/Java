package gameDemo.business.concretes;

import gameDemo.business.abstracts.CustomerService;
import gameDemo.core.abstracts.CheckService;
import gameDemo.dataAccess.abstracts.CustomerDao;
import gameDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CheckService checkService;
	private CustomerDao customerDao;
	
	public CustomerManager(CheckService checkService,CustomerDao customerDao) {
		super();
		this.checkService = checkService;
		this.customerDao=customerDao;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(checkService.check(customer)) {
			 
			this.customerDao.save(customer);
			

		}else {
			System.out.println("Yanl�s bilgi giri�i");
		}
		
	}

}
