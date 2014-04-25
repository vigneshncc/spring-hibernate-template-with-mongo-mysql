package org.gvignesh.dao;

import org.gvignesh.domain.mysql.Employee;

public interface EmployeeDAO extends GenericDAO<Employee, Long> {

	Employee save(Employee employee);	
}