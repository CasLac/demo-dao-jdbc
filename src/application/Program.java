package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		/*
		Department obj = new Department(1, "Books");
		Seller sellerx = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj);
		System.out.println(sellerx);
		*/

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: seller findById ===");
		Seller seller = sellerDao.findById(3);
	
		System.out.println("\n=== TEST2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list ) {
			System.out.println(obj);
		}


		System.out.println("\n=== TEST3: seller findByAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list ) {
			System.out.println(obj);
		}
	
		
//		System.out.println(seller);
	}

}
