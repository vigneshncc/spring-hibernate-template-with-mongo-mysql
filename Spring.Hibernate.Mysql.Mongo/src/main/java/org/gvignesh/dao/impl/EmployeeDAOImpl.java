package org.gvignesh.dao.impl;

import org.gvignesh.dao.EmployeeDAO;
import org.gvignesh.domain.mysql.Employee;
import org.springframework.stereotype.Repository;

@Repository("employeeDAO")
public class EmployeeDAOImpl extends GenericDAOImpl<Employee, Long> implements EmployeeDAO {
	
	@Override
    public Employee save(Employee employee) {
		return super.save(employee);
    }
		
}