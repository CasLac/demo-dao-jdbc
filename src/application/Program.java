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
		
		System.out.println("\n=== TEST4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	
		System.out.println("\n=== TEST5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed"); 
	
		
//		System.out.println(seller);
	}

}
