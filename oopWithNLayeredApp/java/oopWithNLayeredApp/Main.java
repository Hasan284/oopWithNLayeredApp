package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;


import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;

import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPHONE XR", 10000);
	Logger [] loggers= {};
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
