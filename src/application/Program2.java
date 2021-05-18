package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
						
		System.out.println("=== TEST1: department findById ===");
		Department department = departmentDao.findById(3);
		
		System.out.println("\n=== TEST2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list ) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST3: department insert ===");
		Department newDepartment = new Department(7, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
	
		System.out.println("\n=== TEST4: deppartment update ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed"); 

		System.out.println("\n=== TEST5: department delete ===");
		System.out.print("Enter department id for delete test: ");
		int id = sc.nextInt(); 
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}
