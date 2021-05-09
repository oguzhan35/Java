package gameDemo;

import gameDemo.business.abstracts.CustomerService;
import gameDemo.business.abstracts.ProductService;
import gameDemo.business.concretes.CustomerManager;
import gameDemo.business.concretes.ProductManager;
import gameDemo.core.concretes.CheckManager;
import gameDemo.dataAccess.concretes.HibernateCustomerDao;
import gameDemo.dataAccess.concretes.HibernateProductDao;
import gameDemo.entities.concretes.Customer;
import gameDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService customerService = new CustomerManager(new CheckManager(),new HibernateCustomerDao());
		ProductService productService = new ProductManager(new CheckManager(),new HibernateProductDao());
		Customer customer = new Customer(1,"OÐUZHAN","DEMÝR",1992,"53527148038");
		customerService.save(customer);

		Product product = new Product(1,"GTA5",300,10);
		productService.add(product);
		
	}

}
