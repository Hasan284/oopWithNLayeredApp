package oopWithNLayeredApp.business;







import oopWithNLayeredApp.core.logging.Logger;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao producDao;
	private Logger[] loggers;

	public ProductManager(ProductDao producDao,Logger [] loggers) {
		this.producDao = producDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatý 10 dan küçük olamaz");
		}

		producDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
