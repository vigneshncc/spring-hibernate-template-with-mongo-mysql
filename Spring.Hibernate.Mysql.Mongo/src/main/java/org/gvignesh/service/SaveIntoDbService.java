package org.gvignesh.service;

import org.gvignesh.domain.mysql.Employee;

public interface SaveIntoDbService {
	
	public void saveIntoMysql();
	public void saveIntoMongo();
	public Employee getEmployeeObj();
	
}