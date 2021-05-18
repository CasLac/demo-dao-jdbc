package application;

import java.util.Date;

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

		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST1: seller findById ===");
		Seller seller = sellerdao.findById(3);
		

		System.out.println(seller);
	}

}
