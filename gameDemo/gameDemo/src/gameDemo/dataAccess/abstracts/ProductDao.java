package gameDemo.dataAccess.abstracts;

import java.util.List;

import gameDemo.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	List<Product> getAll();
	Product get(int id);

}
