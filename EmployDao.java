package com.java.dao;



import java.util.List;

import com.java.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employ);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employ);
	Employ searchEmployDao(int empno);
}
