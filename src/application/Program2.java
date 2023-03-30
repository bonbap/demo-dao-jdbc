package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dd = DaoFactory.createDepartmentDao();
		
//		System.out.println("=== Test1: Insert Department");
//		Department newDepartment = new Department(10, "Eletronicos");
//		dd.insert(newDepartment);
//		System.out.println("INSERTED! New Id = " + newDepartment.getId());
		
		System.out.println("TESTE 2: FINDBYID");
		Department dep = dd.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 3: FIND ALL =====");
		List<Department> list = dd.findAll();
		for(Department dep1: list) {
			System.out.println(dep1);
		}
		
		System.out.println("=== test 4: Delete =====");
		dd.deleById(7);
		System.out.println("DELETE COMPLETE! NOVA TABELA: ");
		List<Department> list2 = dd.findAll();
		for(Department dep1: list2) {
			System.out.println(dep1);
		}

	}

}
