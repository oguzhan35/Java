package gameDemo.dataAccess.concretes;

import java.util.List;

import gameDemo.dataAccess.abstracts.ProductDao;
import gameDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Urun EKlendi"+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
