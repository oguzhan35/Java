package gameDemo.dataAccess.concretes;

import gameDemo.dataAccess.abstracts.SaleDao;
import gameDemo.entities.concretes.Sale;

public class HibernateSaleDao implements SaleDao {

	@Override
	public void add(Sale sale) {
	 
		System.out.println("Sat�n Al�nm�st�r -Tebrikler");
		
	}

}
