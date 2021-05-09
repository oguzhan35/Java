package gameDemo.business.concretes;

import gameDemo.business.abstracts.ProductService;
import gameDemo.core.abstracts.CheckService;
import gameDemo.dataAccess.abstracts.ProductDao;
import gameDemo.entities.abstracts.Entity;
import gameDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private CheckService checkService;
	private ProductDao productDao;
	public ProductManager(CheckService checkService,ProductDao productDao) {
		super();
		this.checkService = checkService;
		this.productDao=productDao;
		
		
	}
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub

	          System.out.println("Urun kaydedildi"+product.getName());
	          productDao.add(product);
	
	}

}
